package memory;

//Klasse zur Erstellung der Objekte "Karten"
public class Karten {
	
	private int bild_r;			//Stellt die R�ckseite einer Karte da
	private int bild_v;			//Stellt die Vorderseite einer Karte da
	
	//Kontruktor von "Karten"
	public Karten(int bild_r, int bild_v){
		this.bild_r = bild_r;
		this.bild_v = bild_v;
	}
	
	//Getter- und Setter-Methoden  
	public int getBild_r() {
		return bild_r;
	}

	public void setBild_r(int bild_r) {
		this.bild_r = bild_r;
	}


	public int getBild_v() {
		return bild_v;
	}


	public void setBild_v(int bild_v) {
		this.bild_v = bild_v;
	}

	
	
}
