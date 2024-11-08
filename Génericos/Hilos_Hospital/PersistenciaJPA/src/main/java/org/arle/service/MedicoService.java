package org.arle.service;

import org.arle.entity.Medico;
import org.arle.repository.GenericRepository;

import java.util.List;

public class MedicoService {
    private GenericRepository medicoRepository = new GenericRepository();

    public void agregarMedico(Medico medico) {
        medicoRepository.guardarEntidad(medico);
    }

    public List<Medico> listarMedicos() {
        return medicoRepository.obtenerTodos();
    }
}
