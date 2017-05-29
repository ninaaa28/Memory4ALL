package memory;

import java.lang.invoke.SwitchPoint;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Funktionen {

	private int anzKarten = 0;
	private String Spielmodus;

	
	

	public void Ordnen() {
		// Um jeden 2ten Stein anders einanderes Layout zu zuordnen
		//Der Scanner wird nur zu Testzwecken benötigt, kann später durch ein ActionListener ausgetauscht werden
		Scanner scanner = new Scanner(System.in);
		Spielmodus = scanner.nextLine();

		switch (Spielmodus) {
		case "einfach":
			anzKarten = 16;
			break;
		case "mittel":
			anzKarten = 32;
			break;
		case "schwer":
			anzKarten = 64;
			break;

		default:
			System.out.println("Student, oder was?");

			for (int i = 1; i < anzKarten; i++) {
				if(i%2==0){
					//wechsel Bild
				}
				//karten[i] =new Karte(Konstrukter bla bla)
				 
			}
			// Nach der Schleife Array mischen
		}

	}

}
