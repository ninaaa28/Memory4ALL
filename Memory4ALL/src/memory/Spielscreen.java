package memory;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Image;
import javax.swing.*;

public class Spielscreen extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JMenu m1, m2;
	private JMenuBar m;
	private JPanel spieler1, spieler2, spieler3, spieler4, spielerleiste13, spielerleiste24, buttons, spielfeld;
	private JButton ngame, rgame, close;
//	TODO je nach Schwierigkeitsgrad werden bestimmt viele Karten angezeigt
	private int anzahlSpielkarten;

	//Nach klick auf eine Karte wird die Karte umgedreht
	private ActionListener kartenUmdrehen = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println("Drehen");
		}
	};
	
	//ActionListener buttonListener "Siel neu konfigurieren"
	private ActionListener buttonListenerReset = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			String cmd = e.getActionCommand();
				if(cmd.equals("Spiel neu konfigurieren?")) {
					Hauptmenue hm = new Hauptmenue();
					hm.setVisible(true);
//					TODO Spielscreen muss beendet werden
				}
		}
	};
	
	//ActionListener buttonListener "Anwedung schlie�en"
	private ActionListener buttonListenerClose = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			String cmd = e.getActionCommand();
				if(cmd.equals("Anwendung schliessen")) {
					System.exit(0);
				}
		}
	};

	public Spielscreen(int anzahlSpielkarten) {

		// Initialisierung des Screens
		super("Memory");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		getContentPane().setLayout(new BorderLayout());

		// Menueelemente fuer den oberen Rand
		m1 = new JMenu("Anleitung");
		m1.add("Ansehen");
		m1.add("Punkte ergaenzen");
		m1.setBackground(Color.lightGray);

		m2 = new JMenu("Impressum");
		m2.add("Ansehen");
		m2.add("Kontakt aufnehmen");
		m2.setBackground(Color.lightGray);

		// Zusammenfassung der Menueleiste
		m = new JMenuBar();
		m.add(m1);
		m.add(m2);
		m.setBackground(Color.lightGray);

		// Pfadhilfe fuer die Bilder
		String path = System.getProperty("user.dir") + "\\src\\memory\\Bilder\\";

		// Bilderfassung Spieler 1
		ImageIcon schiggieinfuegen = new ImageIcon(path + "001-squirtle.png");
		Image schiggigetter = schiggieinfuegen.getImage();
		Image schiggiresize = schiggigetter.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
		ImageIcon schiggi = new ImageIcon(schiggiresize);
		JLabel schiggibild = new JLabel(schiggi);

		// Spielerinformationen Spieler 1
		spieler1 = new JPanel(new GridLayout(3, 1));
		spieler1.add(new JLabel("Spieler 1: " + Spieler.getSpieler1().getName()));
		spieler1.add(new JLabel("Zeit: " + Spieler.getSpieler1().getSpielzeit()));
		spieler1.add(new Label("Spielzuege: " + Spieler.getSpieler1().getNo_zuege()));
		spieler1.setBackground(Color.red);

		// TODO Dummy-Daten ersetzen
		// Spielerinformationen Spieler 3
		if(Spieler.getSpieler3().getName().equals(null))	//Objekte "spieler3" wird nur erzeugt, wenn f�r Spieler 3 ein Name im Hauptmunue eingegeben wurde
//		TODO Exception!!
			;
		else {	//Objekte "spieler3" wird erzeugt und auf Spielscreen angezeigt
			spieler3 = new JPanel(new GridLayout(3, 1));
			spieler3.add(new JLabel("Spieler 3: " + Spieler.getSpieler3().getName()));
			spieler3.add(new JLabel("Zeit: " + Spieler.getSpieler3().getSpielzeit()));
			spieler3.add(new Label("Spielzuege: " + Spieler.getSpieler3().getNo_zuege()));
			spieler3.setBackground(Color.cyan);
		}

		// Bilderfassung Spieler 3
		//ImageIcon glumandereinfuegen = new ImageIcon(path + "003-charmander.png");
		//Image glumandergetter = glumandereinfuegen.getImage();
		//Image glumanderresize = glumandergetter.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
		//ImageIcon glumander = new ImageIcon(glumanderresize);
		JLabel glumanderbild = new JLabel(new ImageIcon(path + "001-squirtle2.png"));
		
		

		// Zusammenfassung der Spieler 1,3
		if(spieler3.equals(null));		//Zusammenfassung geschieht nur, wenn das Objekte "spieler3" erzeugt wurde
		else {
			spielerleiste13 = new JPanel(new GridLayout(4, 1));
			spielerleiste13.add(schiggibild);
			spielerleiste13.add(spieler1);
			spielerleiste13.add(spieler3);
			spielerleiste13.add(glumanderbild);
		}

		// Zentrales Gaming Feld (Poker-Tisch)
		ImageIcon tischeinfuegen = new ImageIcon("C:/Users/LennartanDeMeulen/Pictures/Pokemon/image_1407.jpg");
		Image tischgetter = tischeinfuegen.getImage();
		Image tischresize = tischgetter.getScaledInstance(900, 650, java.awt.Image.SCALE_SMOOTH);
		ImageIcon tisch = new ImageIcon(tischresize);
		JLabel tischbild = new JLabel(tisch);
		spielfeld = new JPanel();
		spielfeld.setLayout(new GridLayout(8, 8));

		// Hinzufuegen der Karten �ber eine Schleife
		this.anzahlSpielkarten = anzahlSpielkarten;
		// nur fuer Testzwecke
		JButton spielKarten[] = new JButton[anzahlSpielkarten];
		JButton spielKartenFront[] = new JButton[anzahlSpielkarten];

		for (int i = 0; i < anzahlSpielkarten; i++) {
			spielKarten[i] = new JButton("karte" + i);
			spielKarten[i].setText("");
			spielfeld.add(spielKarten[i]);
			spielKarten[i].setSize(100, 100);
			String tmpKarte = ("karte" + 1);
			spielKarten[i].addActionListener(kartenUmdrehen);
			spielKarten[i].setIcon (new ImageIcon(path + "Rueckseite.png"));
			//spielKarten[i]. .getResource("pfeil.png")

//			Das jedes 2te Paar ein neues Bild bekommt, Rest = 0 da ZeroBased
//			und bei Null anfängt
//			if (i > 1 && i % 2 == 0) {
//				System.out.println("Naechstes Bild " + i);
//			}
		}

		pack();

		// Spielerinformation Spieler 2
		if(Spieler.getSpieler2().equals(null));		//Zusammenfassung geschieht nur, wenn das Objekte "spieler2" erzeugt wurde
		else {
			spieler2 = new JPanel(new GridLayout(3, 1));
			spieler2.add(new JLabel("Spieler 2: " + Spieler.getSpieler2().getName()));
			spieler2.add(new JLabel("Zeit: " + Spieler.getSpieler2().getSpielzeit()));
			spieler2.add(new Label("Spielzuege: " + Spieler.getSpieler2().getNo_zuege()));
			spieler2.setBackground(Color.green);
		}

		// Bilderfassung Spieler 2
		ImageIcon bisasameinfuegen = new ImageIcon(path + "002-bullbasaur.png");
		Image bisasamgetter = bisasameinfuegen.getImage();
		Image bisasamresize = bisasamgetter.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
		ImageIcon bisasam = new ImageIcon(bisasamresize);
		JLabel bisasambild = new JLabel(bisasam);
		bisasambild.setBackground(Color.green);

		// Bilderfassung Spieler 4
		ImageIcon pikachueinfuegen = new ImageIcon(path + "005-pikachu.png");
		Image pikachugetter = pikachueinfuegen.getImage();
		Image pikachuresize = pikachugetter.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
		ImageIcon pikachu = new ImageIcon(pikachuresize);
		JLabel pikachubild = new JLabel(pikachu);
		pikachubild.setBackground(Color.yellow);

		// Spielerinformation Spieler 4
		if(Spieler.getSpieler4().equals(null));		//Zusammenfassung geschieht nur, wenn das Objekte "spieler4" erzeugt wurde
		else {
		spieler4 = new JPanel(new GridLayout(3, 1));
		spieler4.add(new JLabel("Spieler 4: " + Spieler.getSpieler4().getName()));
		spieler4.add(new JLabel("Zeit: " + Spieler.getSpieler4().getSpielzeit()));
		spieler4.add(new Label("Spielzuege: " + Spieler.getSpieler4().getNo_zuege()));
		spieler4.setBackground(Color.yellow);

		// Zusammenfassung Spieler 2,4
		if(spieler2.equals(null) || spieler4.equals(null));
		else {
			spielerleiste24 = new JPanel(new GridLayout(4, 1));
			spielerleiste24.add(bisasambild);
			spielerleiste24.add(spieler2);
			spielerleiste24.add(spieler4);
			spielerleiste24.add(pikachubild);
		}

		// Buttons am Ende
		rgame = new JButton("Spiel neu konfigurieren?");
		rgame.addActionListener(buttonListenerReset);
		rgame.setBackground(Color.YELLOW);
		rgame.setFont(new Font("MS Gothic", Font.BOLD, 20));

		ngame = new JButton("Spiel erneut beginnen?");
		ngame.setBackground(Color.green);
		ngame.setFont(new Font("MS Gothic", Font.BOLD, 20));

		close = new JButton("Anwendung schliessen");
		close.addActionListener(buttonListenerClose);
		close.setBackground(Color.red);
		close.setFont(new Font("MS Gothic", Font.BOLD, 20));

		// Button in ein Panel einpassen
		buttons = new JPanel(new GridLayout(1, 3));
		buttons.add(close);
		buttons.add(rgame);
		buttons.add(ngame);

		// Layout fuer das Frame
		getContentPane().add(m, BorderLayout.NORTH);
		getContentPane().add(spielerleiste13, BorderLayout.WEST);
		getContentPane().add(spielfeld, BorderLayout.CENTER);

		getContentPane().add(spielerleiste24, BorderLayout.EAST);
		getContentPane().add(buttons, BorderLayout.SOUTH);

		// Weitere Konfigurationen fuer das Frame
		setVisible(true);
		setBounds(400, 50, 1100, 750);
		setResizable(true);
		}

	}

	public static void main(String[] args) {

		new Spielscreen(64);
	}
}
