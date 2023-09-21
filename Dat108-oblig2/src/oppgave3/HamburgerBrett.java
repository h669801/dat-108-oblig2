package oppgave3;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class HamburgerBrett {
	private final BlockingQueue<Hamburger> hamburgere;

    public HamburgerBrett(int kapasitet) {
        hamburgere = new ArrayBlockingQueue<>(kapasitet);
    }

    public void leggPaaHamburger(Hamburger hamburger, String kokkNavn) throws InterruptedException {
        hamburgere.put(hamburger);
        System.out.println(kokkNavn + " (kokk) legger paa hamburger " + hamburger + ". Brett: " + hamburgere);
    }

    public Hamburger taAvHamburger(String servitorNavn) throws InterruptedException {
        Hamburger hamburger = hamburgere.take();
        System.out.println(servitorNavn + " (servitor) tar av hamburger " + hamburger + ". Brett: " + hamburgere);
        return hamburger;
    }
}
