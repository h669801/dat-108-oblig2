package oppgave1;

import java.util.Scanner;

public class Main {
	
	public static String melding;
	
	public static void main(String[] args) {
//        // Tråd for å skrive ut meldinger hvert 3. sekund
//		melding = "Hallo verden!";
//        Thread print = new Thread(() -> {
//            while (true) {
//                try {
//                    Thread.sleep(3000); // Venter i 3 sekunder
//                    System.out.println(melding);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        });
//
//        // Tråd for å la brukeren taste inn meldinger
//        Thread input = new Thread(() -> {
//            Scanner scanner = new Scanner(System.in);
//            while (true) {
//                System.out.print("Skriv inn en melding (skriv 'quit' for å avslutte): ");
//                String userInput = scanner.nextLine();
//                if (userInput.equalsIgnoreCase("quit")) {
//                    System.exit(0); // Avslutter programmet hvis brukeren skriver 'quit'
//                } else {
////                    System.out.println("Brukeren skrev: " + userInput);
//                	test = userInput;
//                }
//            }
//        });
//
//        // Starter trådene
//        print.start();
//        input.start();
//		
		
		
//		Thread printInTraad = new Thread(); {
//		@Override
//		public void run() {
//			while(melding == "Hallo verden!") {
//				try {
//					Thread.sleep(3000);
//				}catch (InterruptedException e) {	
//				}
//			}
//			System.out.println(melding);
//		}
//		};
//	    Thread giVerdi = new Thread() -> melding = scannerInput;
//	    
//	    giVerdi.start;
		
		
		//En tråd som skriver ut melding på skjermen
		melding = "Hallo verden!";
				Thread printlnTraad = new Thread() {
					@Override
					public void run() {
						while (true) {
							try {
								Thread.sleep(3000);
//								melding = "Hallo verden!";
								System.out.println(melding);
							} catch (InterruptedException e) {
							}
						}
//						System.out.println(melding);
					}
				};
				
				//En tråd som gir melding en verdi
//				Thread giVerdiTraad = new Thread(() -> melding = "Hallo verden!");
				Thread giVerdiTraad = new Thread();
				
//				  Tråd for å la brukeren taste inn meldinger
		        Thread input = new Thread(() -> {
		            Scanner scanner = new Scanner(System.in);
		            while (true) {
		                System.out.print("Skriv inn en melding (skriv 'quit' for å avslutte): ");
		                String userInput = scanner.nextLine();
		                if (userInput.equalsIgnoreCase("quit")) {
		                    System.exit(0); // Avslutter programmet hvis brukeren skriver 'quit'
		                } else {
//		                    System.out.println("Brukeren skrev: " + userInput);
		                	melding = userInput;
		                }
		            }
		        });
				
				printlnTraad.start();
				input.start();
		
    }
}
