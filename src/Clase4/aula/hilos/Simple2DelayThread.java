package Clase4.aula.hilos;

public class Simple2DelayThread extends Thread {

    public String name;
    public int delay;

    public Simple2DelayThread(String mensaje, int delay) {
        this.name = mensaje;
        this.delay = delay;
    }

    public void run() {
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("name : " + name + " | delay : " + delay);
    }
}
