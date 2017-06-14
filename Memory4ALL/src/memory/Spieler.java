package memory;

import java.util.*;

public class Spieler {
	
	private static Spieler spieler1;
	private static Spieler spieler2;
	private static Spieler spieler3;
	private static Spieler spieler4;
	
//	TODO Attribut "Avatar" (Bild des Spielers hinzufügen
//	private avartar;
	private String name;				//Name von "Spieler"
	private int no_zuege;				//Anzhal (number of = no) der Züge von "Spieler"
	private float spielzeit;			//gesamte Spielzeit von "Spieler"
	private float zeit_pro_zug;			//Zeit pro Zug von "Spieler"
	private int no_paerchen;			//Anzahl der richtig aufgedeckten Pärchen von "Spieler"
	private int plazierung;				//Plazierung von "Spieler" im Mehrspielermodus (nach dem Spiel)
	
	
	//Konstruktor von "Spieler"
	public Spieler(	String name, int no_zuege, float spielzeit, float zeit_pro_zug, int no_paerchen, int plazierung){
		this.name = name;
		this.no_zuege = no_zuege;
		this.spielzeit = spielzeit;
		this.zeit_pro_zug = zeit_pro_zug;
		this.no_paerchen = no_paerchen;
		this.plazierung = plazierung;
	}
	
	//Daten-Container für die Spieler-Objekte
	public static ArrayList<Spieler> liste = new ArrayList<Spieler>();
	
	//Spieler1 wird erzeugt - Aufruf durch Hauptmenue-Klasse
	public static void erstelleSpieler1(String name, int no_zuege, float spielzeit, 
											float zeit_pro_zug, int no_paerchen, int plazierung) {
		spieler1 = new Spieler(name, no_zuege, spielzeit, zeit_pro_zug, no_paerchen, plazierung);
		liste.add(spieler1);
	}

	//Spieler2 wird erzeugt - Aufruf durch Hauptmenue-Klasse
	public static void erstelleSpieler2(String name, int no_zuege, float spielzeit, 
											float zeit_pro_zug, int no_paerchen, int plazierung) {
		spieler2 = new Spieler(name, no_zuege, spielzeit, zeit_pro_zug, no_paerchen, plazierung);
		liste.add(spieler2);

}

	//Spieler3 wird erzeugt - Aufruf durch Hauptmenue-Klasse
	public static void erstelleSpieler3(String name, int no_zuege, float spielzeit, 
											float zeit_pro_zug, int no_paerchen, int plazierung) {
		spieler3 = new Spieler(name, no_zuege, spielzeit, zeit_pro_zug, no_paerchen, plazierung);
		liste.add(spieler3);

}

	//Spieler4 wird erzeugt - Aufruf durch Hauptmenue-Klasse
	public static void erstelleSpieler4(String name, int no_zuege, float spielzeit, 
											float zeit_pro_zug, int no_paerchen, int plazierung) {
		spieler4 = new Spieler(name, no_zuege, spielzeit, zeit_pro_zug, no_paerchen, plazierung);
		liste.add(spieler4);

}
	public static void listeAusgeben() {
		Iterator<Spieler> i = liste.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next().toString());
		}
	}
	
	public static void listeClear() {
		
		liste.clear();
	}

	
	//Getter- und Setter-Methoden für Spieler-Objekte
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getNo_zuege() {
		return no_zuege;
	}


	public void setNo_zuege(int no_zuege) {
		this.no_zuege = no_zuege;
	}


	public float getSpielzeit() {
		return spielzeit;
	}


	public void setSpielzeit(float spielzeit) {
		this.spielzeit = spielzeit;
	}


	public float getZeit_pro_zug() {
		return zeit_pro_zug;
	}


	public void setZeit_pro_zug(float zeit_pro_zug) {
		this.zeit_pro_zug = zeit_pro_zug;
	}


	public float getNo_paerchen() {
		return no_paerchen;
	}


	public void setNo_paerchen(int no_paerchen) {
		this.no_paerchen = no_paerchen;
	}


	public int getPlazierung() {
		return plazierung;
	}


	public void setPlazierung(int plazierung) {
		this.plazierung = plazierung;
	}
}