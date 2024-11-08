package HilosPresentacionEjemplo.HilosRunTh.Hilos1.Hilos2;

class Mensaje implements Runnable{
    public void  run(){
        System.out.println("Hilo en ejecucion");
    }
}

public class I_Runnable {
    public static void main(String[] args) {
        Mensaje objeto1 = new Mensaje();
        Thread hilo = new Thread(objeto1);
        hilo.start();
    }
}
