package oppgave3;

import java.util.concurrent.ThreadLocalRandom;

public class Kokk extends Thread{
	private final HamburgerBrett brett;
    private final String navn;

    public Kokk(HamburgerBrett brett, String navn) {
        this.brett = brett;
        this.navn = navn;
    }

//    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(ThreadLocalRandom.current().nextInt(4000, 10000));
                Hamburger hamburger = new Hamburger();
                brett.leggPaaHamburger(hamburger, navn);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
