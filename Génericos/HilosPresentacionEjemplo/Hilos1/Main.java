package HilosPresentacionEjemplo.HilosRunTh.Hilos1;

public class Main{

    public static void main(String[] args) {
        HiloEjemplo hiloEjemplo = new HiloEjemplo();
        hiloEjemplo.start();

        EjecutableEjemplo ejecutableEjemplo = new EjecutableEjemplo();
        Thread thread = new Thread(ejecutableEjemplo);
        thread.start();

    }

}