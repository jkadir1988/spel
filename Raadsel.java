package ExtraOpdracht;

import java.util.Scanner;

public class Raadsel {
	Scanner input = new Scanner(System.in);
	String woord = "i";
	String geradenWoord = "";
	int aantalPogingen = 0;
	int maxAantalPogingen = 2;
	boolean limietPogingen = false;

	void begin() {
		System.out.println("Raadsel. Je hebt maximaal " + maxAantalPogingen + " pogingen\n"
				+ "a. Precies 1 van deze beweringen is onwaar.\r\n"
				+ "b. Precies 2 van deze beweringen zijn onwaar.\r\n"
				+ "c. Precies 3 van deze beweringen zijn onwaar.\r\n"
				+ "d. Precies 4 van deze beweringen zijn onwaar.\r\n"
				+ "e. Precies 5 van deze beweringen zijn onwaar.\r\n"
				+ "f. Precies 6 van deze beweringen zijn onwaar.\r\n"
				+ "g. Precies 7 van deze beweringen zijn onwaar.\r\n"
				+ "h. Precies 8 van deze beweringen zijn onwaar.\r\n"
				+ "i. Precies 9 van deze beweringen zijn onwaar.\r\n"
				+ "j. Precies 10 van deze beweringen zijn onwaar.\r\n"
				+ "Welke bewering is juist? Kies het juiste letter.");
		while (!geradenWoord.equals(woord) && !limietPogingen) {
			if (aantalPogingen < maxAantalPogingen) {
				geradenWoord = input.nextLine().toLowerCase();

				aantalPogingen++;
				System.out.println("Poging: " + aantalPogingen + " uit " + maxAantalPogingen);

			} else {
				limietPogingen = true;
			}
		}
		if (limietPogingen) {
			System.out.println("\nVerloren! Het was bewering " + woord + "\n");
		} else {
			System.out.println("\nGefeliciteerd! Je hebt gewonnen! Het was inderdaad bewering " + woord + "\n");
		}
	}
}
