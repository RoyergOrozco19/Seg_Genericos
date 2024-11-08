package HilosPresentacionEjemplo.HilosRunTh.Hilos1;

import java.time.Duration;

public class EjecutableEjemplo implements  Runnable{
    @Override
    public void run() {
        try {
            System.out.println("Hola soy un ejecutable");
            Thread.sleep(Duration.ofMillis(3000));
            System.out.println("Adios soy un ejecutable");
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    }
}