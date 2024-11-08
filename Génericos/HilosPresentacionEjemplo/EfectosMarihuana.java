package HilosPresentacionEjemplo;

public class EfectosMarihuana extends Thread{

        public void run() {
            try {
                System.out.println("Fase 1: Relajación inicial.");
                Thread.sleep(3000); // Simula el paso de tiempo de 3 segundos

                System.out.println("Fase 2: Sensación de bienestar y euforia.");
                Thread.sleep(3000);

                System.out.println("Fase 3: Aumento del apetito (munchies).");
                Thread.sleep(3000);

                System.out.println("Fase 4: Percepción alterada del tiempo.");
                Thread.sleep(3000);

                System.out.println("Fase 5: Somnolencia y relajación profunda.");
                Thread.sleep(3000);

                System.out.println("Fase 6: Efectos empiezan a desaparecer.");
            } catch (InterruptedException e) {
                System.out.println("El hilo fue interrumpido.");
            }
        }

        public static void main(String[] args) {
            EfectosMarihuana hilo = new EfectosMarihuana();
            hilo.start();

}}
