package oppgave2;

import java.util.ArrayList;
import java.util.List;

public class HamburgerBrett {
	 private final int kapasitet;
	    private final List<Hamburger> hamburgere = new ArrayList<>();

	    public HamburgerBrett(int kapasitet) {
	        this.kapasitet = kapasitet;
	    }
	    
	    public synchronized void leggPaaHamburger(Hamburger hamburger, String kokkNavn) throws InterruptedException {
	        while (hamburgere.size() >= kapasitet) {
	            System.out.println(kokkNavn + " (kokk) klar med hamburger, men brett fullt. Venter!");
	            wait();
	        }
	        hamburgere.add(hamburger);
	        System.out.println(kokkNavn + " (kokk) legger paa hamburger " + hamburger + ", Brett: " + hamburgere);
	        notifyAll();
	    }

	    public synchronized Hamburger taAvHamburger(String servitorNavn) throws InterruptedException {
	        while (hamburgere.isEmpty()) {
	            System.out.println(servitorNavn + " (servitor) onsker aa ta hamburger, men brett tomt. Venter!");
	            wait();
	        }
	        Hamburger hamburger = hamburgere.remove(0);
	        System.out.println(servitorNavn + " (servitor) tar av hamburger " + hamburger + ", Brett: " + hamburgere);
	        notifyAll();
	        return hamburger;
	    }
}
