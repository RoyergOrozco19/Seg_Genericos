package HilosPresentacionEjemplo;

public class Ejemplo2CuentaRegresiva extends Thread{
    public void run() {
        for (int i = 10; i >= 0; i--) {
            System.out.println("Cuenta atrás: " + i);
            try {
                Thread.sleep(500); // Pausa por 0.5 segundos
            } catch (InterruptedException e) {
                System.out.println("Hilo interrumpido.");
            }
        }
    }

    public static void main(String[] args) {
        Ejemplo2CuentaRegresiva hilo = new Ejemplo2CuentaRegresiva();
        hilo.start();
}

}
