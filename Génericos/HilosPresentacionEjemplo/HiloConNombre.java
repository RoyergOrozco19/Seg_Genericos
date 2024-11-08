package HilosPresentacionEjemplo;
//metodo1
public class HiloConNombre extends Thread{

    public void run() {
        System.out.println("El nombre del hilo es: " + getName());
    }

    public static void main(String[] args) {
        HiloConNombre hilo = new HiloConNombre();
        hilo.setName("MiHiloPersonalizado");
        hilo.start();
    }

}
