package ExtraOpdracht;

import java.util.Scanner;

class RaadHetGetal {
	int nana;
	boolean stoppen = true;
	Scanner sc = new Scanner(System.in);

	void spel1() {
		System.out.println("Raad het getal! Typ het gewenste getal in!");
		while (stoppen) {
			nana = sc.nextInt();
			switch (nana) {
			case 4:
				System.out.println("Goed geraden!");
				stoppen = false;
				break;
			default:
				System.out.println("Fout geraden, probeer het opnieuw!");
			}
		}
	}
}
