package oppgave3;

public class Main {
	
	public static void main(String[] args) {
		final String[] kokker = { "Anne", "Erik", "Knut" };
		final String[] servitorer = { "Mia", "Per" };
		final int KAPASITET = 4;

		skrivUtHeader(kokker, servitorer, KAPASITET);

		HamburgerBrett brett = new HamburgerBrett(KAPASITET);

		for (String navn : kokker) {
			new Kokk(brett, navn).start();
		}

		for (String navn : servitorer) {
			new Servitor(brett, navn).start();
		}
	}

	private static void skrivUtHeader(String[] kokker, String[] servitorer, int kapasitet) {
		System.out.println("I denne simuleringen har vi");
		System.out.println(kokker.length + " kokker " + formatArray(kokker));
		System.out.println(servitorer.length + " servitorer " + formatArray(servitorer));
		System.out.println("Kapasiteten til brettet er " + kapasitet + " hamburgere.");
		System.out.println("Vi starter ...\n");
	}

	private static String formatArray(String[] array) {
		StringBuilder sb = new StringBuilder("[");
		for (int i = 0; i < array.length; i++) {
			sb.append(array[i]);
			if (i < array.length - 1) {
				sb.append(", ");
			}
		}
		sb.append("]");
		return sb.toString();
	}
}
