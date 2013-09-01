package Clase4.aula.hilos;

public class AplicacionHilos {

    public static void main(String[] args) {

        //AplicacionHilos.dohiloImplementacion();
        //AplicacionHilos.doSleep2();
        //AplicacionHilos.doSleep2Priority();
        AplicacionHilos.doRamThread();


    }

    public static void dohiloHerencia() {
        HiloHerencia hilo = new HiloHerencia();
        hilo.start();
    }

    public static void dohiloImplementacion() {
        HiloImplements hilo = new HiloImplements();
        Thread th = new Thread(hilo);
        th.start();
    }

    public static void doSleep2() {
        Simple2DelayThread delay = new Simple2DelayThread("Tecsup", 2000);
        delay.start();

    }

    public static void doSleep2Priority() {
        Simple2DelayThread thread1 = new Simple2DelayThread("thread1", 0);
        Simple2DelayThread thread2 = new Simple2DelayThread("thread2", 0);

        // Modificando las prioridades
        thread1.setPriority(Thread.MIN_PRIORITY);
        thread2.setPriority(Thread.MAX_PRIORITY);

        thread1.start();
        thread2.start();

    }

    public static void doRamThread() {

        RamThread th = new RamThread(3);

        th.start();




    }
}
