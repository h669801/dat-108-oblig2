package oppgave2;

import java.util.Random;

public class Kokk extends Thread {
		
	private final HamburgerBrett brett;
    private final String navn;

    public Kokk(HamburgerBrett brett, String navn) {
        this.brett = brett;
        this.navn = navn;
    }
    
//    @Override
    public void run() {
        Random random = new Random();
        while (true) {
            try {
                Thread.sleep(random.nextInt(12000) + 3000); // Tid mellom 2 og 6 sekunder
                Hamburger hamburger = new Hamburger();
                brett.leggPaaHamburger(hamburger, navn);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
