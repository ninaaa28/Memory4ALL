package memory;

public class Spieler {
	
	private String name;				//Name von "Spieler"
	private int no_zuege;				//Anzhal (number of = no) der Züge von "Spieler"
	private float spielzeit;			//gesamte Spielzeit von "Spieler"
	private float zeit_pro_zug;			//Zeit pro Zug von "Spieler"
	private float no_paerchen;			//Anzahl der richtig aufgedeckten Pärchen von "Spieler"
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


	public void setNo_paerchen(float no_paerchen) {
		this.no_paerchen = no_paerchen;
	}


	public int getPlazierung() {
		return plazierung;
	}


	public void setPlazierung(int plazierung) {
		this.plazierung = plazierung;
	}
	
	
	
	

}
