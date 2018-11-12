package ExtraOpdracht;

import java.util.Scanner;

class Galgje {
	String woord = "divageren";
	String geradenWoord = "";
	int aantalPogingen = 0;
	int maxAantalPogingen = 10;
	boolean limietPogingen = false;
	Scanner sc = new Scanner(System.in);

	void galgjeSpelen() {
		System.out.println("Welkom bij Galgje\nJe hebt 10 pogingen! Succes!");
		StringBuilder sb = new StringBuilder(woord.length());
		for (int i = 0; i < woord.length(); i++)
			sb.append("*");
		char[] woordInCharArray = woord.toCharArray();
		while (!geradenWoord.equals(woord) && !limietPogingen) {
			if (aantalPogingen < maxAantalPogingen) {
				System.out.println("\nTe raden woord : " + sb.toString()
						+ "\nKies een letter : ");
				char inputLetter = sc.nextLine().toLowerCase().toCharArray()[0];
				for (int i = 0; i < woordInCharArray.length; i++) {
					if (inputLetter == woordInCharArray[i]) {
						sb.setCharAt(i, inputLetter);
					}
				}
				aantalPogingen++;
				System.out.println("Dit is uw " + aantalPogingen + "e beurt uit " + maxAantalPogingen + " beurten.");
			} else {
				limietPogingen = true;
			}
		}
		if (limietPogingen) {
			System.out.println("\nVerloren! Het was " + woord + "\n");
			
		} else {
			System.out.println("\nGefeliciteerd! Je hebt gewonnen! Het was inderdaad " + woord + "\n");
		}
	}

}
