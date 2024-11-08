package HilosPresentacionEjemplo;
//metodo2
public class HiloConPrioridad extends Thread{
    public void run() {
        System.out.println("Prioridad del hilo: " + getPriority());
    }

    public static void main(String[] args) {
        HiloConPrioridad hilo = new HiloConPrioridad();
        hilo.setPriority(Thread.MAX_PRIORITY); // Prioridad máxima (10)
        hilo.start();
}

}
