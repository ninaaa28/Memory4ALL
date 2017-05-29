package memory;


//Klasse zum Regeln der Rahmenbedingungen des Spiels
public class Rahmenbedingungen {
	
	private int no_spieler;				//Anzahl der "Speiler"-Objekte
	private int no_karten;				//Anzhal der "Karten"-Objekte
	private int level;					//Schwierigkeitsgrad des Spiels

	
	//Konstruktor von "Spielfeld"
	public Rahmenbedingungen(int no_spieler, int no_karten, int level){
		this.no_spieler = no_spieler;
		this.no_karten = no_karten;
		this.level = level;
	}
	
	//Getter- und Setter-Mehtoden
	public int getNo_karten() {
		return no_karten;
	}

	public void setNo_karten(int no_karten) {
		this.no_karten = no_karten;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getNo_spieler() {
		return no_spieler;
	}

	public void setNo_spieler(int no_spieler) {
		this.no_spieler = no_spieler;
	}
	

}
