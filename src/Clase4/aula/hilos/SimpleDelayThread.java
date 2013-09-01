package Clase4.aula.hilos;

public class SimpleDelayThread extends Thread {

    public void run() {
        // 
        for (int i = 0; i < 5; i++) {
            try {
                // 1000 ms
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }
}
