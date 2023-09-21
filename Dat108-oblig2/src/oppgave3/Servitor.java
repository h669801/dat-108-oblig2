package oppgave3;

import java.util.concurrent.ThreadLocalRandom;

public class Servitor extends Thread{
    private final HamburgerBrett brett;
    private final String navn;

    public Servitor(HamburgerBrett brett, String navn) {
        this.brett = brett;
        this.navn = navn;
    }

//    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(ThreadLocalRandom.current().nextInt(4000, 10000));
                Hamburger hamburger = brett.taAvHamburger(navn);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
