package ExtraOpdracht;

import java.util.Scanner;

class SpellenMenu {
	String lala;
	boolean stopppen = true;
	Scanner sc = new Scanner(System.in);
	RaadHetGetal rhc = new RaadHetGetal();
	Raadsel raadsel = new Raadsel();
	Galgje gj = new Galgje();

	void spel1() {
		while (stopppen) {
			menu();
			lala = sc.nextLine().toLowerCase();
			switch (lala) {
			case "1":
				rhc.spel1();
			
				break;
			case "2":
				raadsel.begin();
				
				break;
			case "3":
				gj.galgjeSpelen();
				
				break;
			case "q":
				System.out.println("Tot de volgende keer!");
				stopppen = false;
				break;
			default:
				System.out.println("\nToets een geldige knop aub!");
			}
		}
	}
	void menu() {
		System.out.println("\nWelk spelletje wil je spelen?"
				+ "\nKies 1 voor Raad het getal!"
				+ "\nKies 2 voor Welk raadsel is juist?!"
				+ "\nKies 3 voor Galgje!"
				+ "\nKies Q om te stoppen!");
	}
}





//System.out.println("Enter Secrect Word");
//
//Scanner scn = new Scanner(System.in);
//String secrectStr = scn.next();
//StringBuilder b = new StringBuilder(secrectStr.length());
//for (int i = 0; i < secrectStr.length(); i++)
//	b.append("*");
//char[] secrectStrCharArr = secrectStr.toCharArray();
//int charCnt = secrectStr.length();
//while (charCnt >= 0) {
//	System.out.println("Secrect Word :" + b.toString());
//	System.out.println("Guess a letter :");
//	char guessChar = scn.next().toCharArray()[0];
//	for (int i = 0; i < secrectStrCharArr.length; i++) {
//		if (guessChar == secrectStrCharArr[i])
//			b.setCharAt(i, guessChar);
//	}
//}
