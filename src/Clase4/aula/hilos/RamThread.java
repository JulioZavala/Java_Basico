package Clase4.aula.hilos;

import java.util.logging.Level;
import java.util.logging.Logger;

public class RamThread extends Thread {

    private int parametro;

    public RamThread(int parametro) {
        this.parametro = parametro;
    }
    long mem1 = Runtime.getRuntime().totalMemory();
    long mem2 = Runtime.getRuntime().freeMemory();
    long mem3 = Runtime.getRuntime().availableProcessors();
    long mem4 = Runtime.getRuntime().maxMemory();

    @Override
    public void run() {

        String mensaje;
        
        for (int i = 0; i < 10; i++) {

            try {
                Thread.sleep(5000);

            } catch (InterruptedException ex) {
                Logger.getLogger(ex.getMessage());
            }

            switch (parametro) {
                case 1:
                    System.out.println(mem1/1024/1024+" MB");
                    break;
                case 2:
                    System.out.println(mem2/1024/1024+" MB");
                    break;
                case 3:
                    System.out.println(mem3/1024/1024+" Procesadores");
                    break;
                case 4:
                    System.out.println(mem4/1024/1024+" MB");
                    break;
                default:
                    
            }


        }

    }
}
