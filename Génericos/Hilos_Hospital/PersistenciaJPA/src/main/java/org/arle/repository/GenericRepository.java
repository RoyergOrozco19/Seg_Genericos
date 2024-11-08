package org.arle.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import java.util.List;

public class GenericRepository<T> {
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("PersistenciaJPA_PU");
    private Class<T> entityClass;

    public GenericRepository() {
        this.entityClass = entityClass;
    }

    public void guardarEntidad(T entidad) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(entidad);
        em.getTransaction().commit();
        em.close();
    }

    public List<T> obtenerTodos() {
        EntityManager em = emf.createEntityManager();
        List<T> entidades = em.createQuery("SELECT e FROM " + entityClass.getSimpleName() + " e", entityClass).getResultList();
        em.close();
        return entidades;
    }

}


