package HilosPresentacionEjemplo.HilosRunTh.Hilos1;

import java.time.Duration;

public class HiloEjemplo extends Thread{

    @Override
    public  void  run() {
        try {
            System.out.println("Hola soy un hilo");
            Thread.sleep(Duration.ofMillis(4000));
            System.out.println("Adios soy un hilo");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
