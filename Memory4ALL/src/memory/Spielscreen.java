package memory;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.BevelBorder;


public class Spielscreen extends JFrame {
	
	private JFrame Memory;
	private JMenu m1, m2;
	private JMenuBar m;
	private JPanel spieler1, spieler2, spieler3, spieler4, spielerleiste13, spielerleiste24, buttons, spielfeld;
	private JButton ngame, rgame, close;
	private int anzahlSpielkarten=0;
	
	private ActionListener kartenUmdrehen = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println("Drehen");
			
		}
	};
	
public Spielscreen (int anzahlSpielkarten){
	
	
	
	// Initialisierung des Screens
	super ("Memory");
	setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	getContentPane().setLayout(new BorderLayout());
	

	// Menueelemente fuer den oberen Rand
	m1 = new JMenu("Anleitung");
	m1.add("Ansehen");
	m1.add("Punkte ergänzen");
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
	String path = System.getProperty("user.dir")+"\\src\\memory\\Bilder\\";

	// Bilderfassung Spieler 1
	ImageIcon schiggieinfuegen = new ImageIcon(path+"001-squirtle.png");
	Image schiggigetter = schiggieinfuegen.getImage();
	Image schiggiresize = schiggigetter.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
	ImageIcon schiggi = new ImageIcon(schiggiresize);
	JLabel schiggibild = new JLabel(schiggi);

	// Spielerinformationen Spieler 1
	spieler1 = new JPanel(new GridLayout(3, 1));
	spieler1.add(new JLabel("Spieler 1"));
	spieler1.add(new JLabel("Zeit: 12:00"));
	spieler1.add(new Label("Spielz�ge:25"));
	spieler1.setBackground(Color.red);

	// Spielerinformationen Spieler 3
	spieler3 = new JPanel(new GridLayout(3, 1));
	spieler3.add(new JLabel("Spieler 3"));
	spieler3.add(new JLabel("Zeit: 13:00"));
	spieler3.add(new Label("Spielz�ge:24"));
	spieler3.setBackground(Color.cyan);

	// Bilderfassung Spieler 3
	ImageIcon glumandereinfuegen = new ImageIcon(path+"003-charmander.png");
	Image glumandergetter = glumandereinfuegen.getImage();
	Image glumanderresize = glumandergetter.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
	ImageIcon glumander = new ImageIcon(glumanderresize);
	JLabel glumanderbild = new JLabel(glumander);

	// Zusammenfassung der Spieler 1,3
	spielerleiste13 = new JPanel(new GridLayout(4, 1));
	spielerleiste13.add(schiggibild);
	spielerleiste13.add(spieler1);
	spielerleiste13.add(spieler3);
	spielerleiste13.add(glumanderbild);

	// Zentrales Gaming Feld (Poker-Tisch)
	ImageIcon tischeinfuegen = new ImageIcon("C:/Users/LennartanDeMeulen/Pictures/Pokemon/image_1407.jpg");
	Image tischgetter = tischeinfuegen.getImage();
	Image tischresize = tischgetter.getScaledInstance(900, 650, java.awt.Image.SCALE_SMOOTH);
	ImageIcon tisch = new ImageIcon(tischresize);
	JLabel tischbild = new JLabel(tisch);
	spielfeld= new JPanel();
	spielfeld.setLayout(new GridLayout(8,0));
	
	//Hinzufügen der Karten über eine Schleife
	this.anzahlSpielkarten=anzahlSpielkarten;
	//nur für Testzwecke

	for(int i=0; i<anzahlSpielkarten;i++){
		JButton spielKarten = new JButton("karte"+i);
		spielfeld.add(spielKarten);
		String tmpKarte = ("karte"+1);
		
		spielKarten.addActionListener(kartenUmdrehen);
		spielKarten.setIcon(new ImageIcon(path+"Rueckseite.png"));
	}
	

	// Spielerinformation Spieler 2
	spieler2 = new JPanel(new GridLayout(3, 1));
	spieler2.add(new JLabel("Spieler 2"));
	spieler2.add(new JLabel("Zeit: 12:30"));
	spieler2.add(new Label("Spielz�ge:25"));
	spieler2.setBackground(Color.green);

	// Bilderfassung Spieler 2
	ImageIcon bisasameinfuegen = new ImageIcon(path+"002-bullbasaur.png");
	Image bisasamgetter = bisasameinfuegen.getImage();
	Image bisasamresize = bisasamgetter.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
	ImageIcon bisasam = new ImageIcon(bisasamresize);
	JLabel bisasambild = new JLabel(bisasam);
	bisasambild.setBackground(Color.green);

	// Bilderfassung Spieler 4
	ImageIcon pikachueinfuegen = new ImageIcon(path+"005-pikachu.png");
	Image pikachugetter = pikachueinfuegen.getImage();
	Image pikachuresize = pikachugetter.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
	ImageIcon pikachu = new ImageIcon(pikachuresize);
	JLabel pikachubild = new JLabel(pikachu);
	pikachubild.setBackground(Color.yellow);

	// Spielerinformation Spieler 4
	spieler4 = new JPanel(new GridLayout(3, 1));
	spieler4.add(new JLabel("Spieler 4"));
	spieler4.add(new JLabel("Zeit: 15:00"));
	spieler4.add(new Label("Spielz�ge:24"));
	spieler4.setBackground(Color.yellow);

	// Zusammenfassung Spieler 2,4
	spielerleiste24 = new JPanel(new GridLayout(4, 1));
	spielerleiste24.add(bisasambild);
	spielerleiste24.add(spieler2);
	spielerleiste24.add(spieler4);
	spielerleiste24.add(pikachubild);

	// Buttons am Ende
	ngame = new JButton("Spiel neu konfigurieren?");
	ngame.setBackground(Color.YELLOW);
	ngame.setFont(new Font("MS Gothic", Font.BOLD, 20));

	rgame = new JButton("Spiel erneut beginnen?");
	rgame.setBackground(Color.green);
	rgame.setFont(new Font("MS Gothic", Font.BOLD, 20));

	close = new JButton("Anwendung schliessen");
	close.setBackground(Color.red);
	close.setFont(new Font("MS Gothic", Font.BOLD, 20));

	// Button in ein Panel einpassen
	buttons = new JPanel(new GridLayout(1, 3));
	buttons.add(close);
	buttons.add(ngame);
	buttons.add(rgame);

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

	public static void main (String [] args){
	 
		new Spielscreen(32);
	}



}