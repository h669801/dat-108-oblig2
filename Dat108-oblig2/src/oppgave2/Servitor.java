package oppgave2;

import java.util.Random;

public class Servitor extends Thread{
	private final HamburgerBrett brett;
    private final String navn;

    public Servitor(HamburgerBrett brett, String navn) {
        this.brett = brett;
        this.navn = navn;
    }
    
//    @Override
    public void run() {
        Random random = new Random();
        while (true) {
            try {
                Thread.sleep(random.nextInt(5000) + 2000); // Tid mellom 2 og 6 sekunder
                Hamburger hamburger = brett.taAvHamburger(navn);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
