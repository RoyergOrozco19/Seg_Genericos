package HilosPresentacionEjemplo;

public class Ejemplo1Contador extends Thread{
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000); // Pausa por 1 segundo
            } catch (InterruptedException e) {
                System.out.println("Hilo interrumpido.");
            }
        }
    }

    public static void main(String[] args) {
        Ejemplo1Contador hilo = new Ejemplo1Contador();
        hilo.start();}

}
