package oppgave3;

public class Hamburger {
	private static int hamburgerCount = 0;
    private int number;

    public Hamburger() {
        hamburgerCount++;
        this.number = hamburgerCount;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "<" + number + ">";
    }
}
