package memory;

import java.util.Iterator;
import java.util.TreeSet;

public class Spieler implements Comparable<Spieler> {
	
	private String name;				//Name von "Spieler"
//TODO Attribut "Avatar" (Bild des Spielers hinzufügen
//	private avartar;
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
		
		//Zähler der "Spieler"-Objekte hochzählen
	}
	
	private static TreeSet<Spieler> liste = new TreeSet<Spieler>();

//	private static Einwohner ermittleObjekt(String vorname, String name) {
//		return liste.floor(new Einwohner(null, vorname, name, null, null, null));
//	}
//	
	public static void erstelleSpieler1(String name, int no_zuege, float spielzeit, 
											float zeit_pro_zug, int no_paerchen, int plazierung) {
		Spieler spieler1 = new Spieler(name, no_zuege, spielzeit, zeit_pro_zug, no_paerchen, plazierung);
		
		liste.add(spieler1);
	}

	public static void erstelleSpieler2(String name, int no_zuege, float spielzeit, 
											float zeit_pro_zug, int no_paerchen, int plazierung) {
		Spieler spieler2 = new Spieler(name, no_zuege, spielzeit, zeit_pro_zug, no_paerchen, plazierung);
		
		liste.add(spieler2);

}

	public static void erstelleSpieler3(String name, int no_zuege, float spielzeit, 
											float zeit_pro_zug, int no_paerchen, int plazierung) {
		Spieler spieler3 = new Spieler(name, no_zuege, spielzeit, zeit_pro_zug, no_paerchen, plazierung);
		
		liste.add(spieler3);

}
	
	public static void erstelleSpieler4(String name, int no_zuege, float spielzeit, 
											float zeit_pro_zug, int no_paerchen, int plazierung) {
		Spieler spieler4 = new Spieler(name, no_zuege, spielzeit, zeit_pro_zug, no_paerchen, plazierung);
		
		liste.add(spieler4);

}
	

	@Override
	public int compareTo(Spieler o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	//ANFANG TEST!!!!!!!!!!!!!!!!!!!
	public static void listeAusgeben() {
		Iterator<Spieler> i = liste.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
	}
	
	public static void listeClear() {
		
		liste.clear();
	}
	
	//ENDE TEST!!!!!!!!!!!!!!!!!!!!!
	
	//Getter- und Setter-Methoden für "Spieler"
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

//	TEST
public static void main(String[] args) {
	
//	listeClear();
//	Spieler s1 = new Spieler("Julius", 0, 0f, 0f, 0 ,0);
//	Spieler s2 = new Spieler("Lara", 0, 0f, 0f, 0 ,0);
//	Spieler s3 = new Spieler("Lara", 0, 0f, 0f, 0 ,0);
//	liste.add(s1);
//	liste.add(s2);
//	liste.add(s3);
//	listeAusgeben();
}
	
}	