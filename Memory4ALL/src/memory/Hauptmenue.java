package memory;

import java.awt.*;

import javax.swing.*;
import javax.swing.border.Border;

public class Hauptmenue extends JFrame {
	
	private JMenu m1, m2;
	private JMenuBar m;
	private JFrame hauptmenue;
	private JPanel schwierigkeit, spieler1, spieler2, spieler3, spieler4, spieler, buttons;
	private JComboBox dropdowns1, dropdowns2, dropdowns3, dropdowns4;
	private JCheckBox sehrleicht, leicht, mittel, schwer, sehrschwer;
	private JButtonGroup schwere;
	private JLabel spielerlabel1, spielerlabel2, spielerlabel3, spielerlabel4;
	private JTextField name1, name2, name3, name4;
	private JButton reset, start;
	
	
public Hauptmenue {
	
	
	super  ("Hauptmenue");
	setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	setLayout(new BorderLayout());
	
	// Rahmen der Panels
	Border rahmen1 = BorderFactory.createEtchedBorder();
	Border rahmenschwierigkeit = BorderFactory.createTitledBorder(rahmen1, "Schwierigkeit wählen");
	Border rahmenspieler = BorderFactory.createTitledBorder(rahmen1, "Spieler angeben");
	
	// Menueelemente fuer den oberen Rand
	m1 = new JMenu("Anleitung");
	m1.add("Ansehen");
	m1.add("Punkte ergänzen");
	m1.setBackground(Color.yellow);

<<<<<<< HEAD
		JFrame hauptmenue = new JFrame("Hauptmenue");
		hauptmenue.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		hauptmenue.setLayout(new BorderLayout());
=======
	m2 = new JMenu("Impressum");
	m2.add("Ansehen");
	m2.add("Kontakt aufnehmen");
	m2.setBackground(Color.yellow);
>>>>>>> branch 'master' of https://github.com/WISCB16/Memory4ALL.git

<<<<<<< HEAD
		// Rahmen der Panels
		Border rahmen1 = BorderFactory.createEtchedBorder();
		Border rahmenschwierigkeit = BorderFactory.createTitledBorder(rahmen1, "Schwierigkeit waehlen");
		Border rahmenspieler = BorderFactory.createTitledBorder(rahmen1, "Spieler angeben");
=======
	// Zusammenfassung der Menüleiste
	m = new JMenuBar();
	m.add(m1);
	m.add(m2);
	m.setBackground(Color.lightGray);
>>>>>>> branch 'master' of https://github.com/WISCB16/Memory4ALL.git

<<<<<<< HEAD
		// Menueelemente fuer den oberen Rand
		JMenu m1 = new JMenu("Anleitung");
		m1.add("Ansehen");
		m1.add("Punkte ergÃ¤nzen");
		m1.setBackground(Color.yellow);
=======
	// Schwierigkeitsbereich anpassen
	schwierigkeit = new JPanel(new GridLayout(5, 1));
	schwere = new ButtonGroup();
	sehrleicht = new JCheckBox("Sehr Leicht (16 Karten)");
	schwere.add(sehrleicht);
	schwierigkeit.add(sehrleicht);
	leicht = new JCheckBox("Leicht (32 Karten)");
	schwere.add(leicht);
	schwierigkeit.add(leicht);
	mittel = new JCheckBox("Mittel (48 Karten)");
	schwere.add(mittel);
	schwierigkeit.add(mittel);
	schwer = new JCheckBox("Schwer(64 Karten)");
	schwere.add(schwer);
	schwierigkeit.add(schwer);
	sehrschwer = new JCheckBox("Sehr Schwer (72 Karten)");
	schwere.add(sehrschwer);
	schwierigkeit.add(sehrschwer);
	schwierigkeit.setBorder(rahmenschwierigkeit);
	schwierigkeit.setBackground(Color.cyan);
>>>>>>> branch 'master' of https://github.com/WISCB16/Memory4ALL.git

	// Textfeld fuer die Spieler
	name1 = new JTextField(30);
	name1.setFont(new Font("Serif", Font.PLAIN, 25));

<<<<<<< HEAD
		// Zusammenfassung der Menueleiste
		JMenuBar m = new JMenuBar();
		m.add(m1);
		m.add(m2);
		m.setBackground(Color.lightGray);
=======
	name2 = new JTextField(30);
	name2.setFont(new Font("Serif", Font.PLAIN, 25));
>>>>>>> branch 'master' of https://github.com/WISCB16/Memory4ALL.git

<<<<<<< HEAD
		// Schwierigkeitsbereich anpassen
		JPanel schwierigkeit = new JPanel(new GridLayout(5, 1));
		ButtonGroup schwere = new ButtonGroup();
		JRadioButton sehrleicht = new JRadioButton("Sehr Leicht (16 Karten)");
		schwere.add(sehrleicht);
		schwierigkeit.add(sehrleicht);
		JRadioButton leicht = new JRadioButton("Leicht (32 Karten)");
		schwere.add(leicht);
		schwierigkeit.add(leicht);
		JRadioButton mittel = new JRadioButton("Mittel (48 Karten)");
		schwere.add(mittel);
		schwierigkeit.add(mittel);
		JRadioButton schwer = new JRadioButton("Schwer(64 Karten)");
		schwere.add(schwer);
		schwierigkeit.add(schwer);
		JRadioButton sehrschwer = new JRadioButton("Sehr Schwer (72 Karten)");
		schwere.add(sehrschwer);
		schwierigkeit.add(sehrschwer);
		schwierigkeit.setBorder(rahmenschwierigkeit);
		schwierigkeit.setBackground(Color.cyan);
=======
	name3 = new JTextField(30);
	name3.setFont(new Font("Serif", Font.PLAIN, 25));
>>>>>>> branch 'master' of https://github.com/WISCB16/Memory4ALL.git

<<<<<<< HEAD
		// Textfeld fuer die Spieler
		JTextField name1 = new JTextField(30);
		name1.setFont(new Font("Serif", Font.PLAIN, 25));
=======
	name4 = new JTextField(30);
	name4.setFont(new Font("Serif", Font.PLAIN, 25));
>>>>>>> branch 'master' of https://github.com/WISCB16/Memory4ALL.git

	// Label fuer Spieler
	spielerlabel1 = new JLabel("Spieler 1");
	spielerlabel1.setFont(new Font("Serif", Font.BOLD, 40));

	spielerlabel2 = new JLabel("Spieler 2");
	spielerlabel2.setFont(new Font("Serif", Font.BOLD, 40));

	spielerlabel3 = new JLabel("Spieler 3");
	spielerlabel3.setFont(new Font("Serif", Font.BOLD, 40));

<<<<<<< HEAD
		// Label fuer Spieler
		JLabel spielerlabel1 = new JLabel("Spieler 1");
		spielerlabel1.setFont(new Font("Serif", Font.BOLD, 40));
=======
	spielerlabel4 = new JLabel("Spieler 4");
	spielerlabel4.setFont(new Font("Serif", Font.BOLD, 40));
>>>>>>> branch 'master' of https://github.com/WISCB16/Memory4ALL.git

	// Panel fuer Spieler1
	spieler1 = new JPanel(new FlowLayout(0));
	spieler1.add(spielerlabel1);
	spieler1.add(name1);
	spieler1.setBackground(Color.yellow);

	// Panel fuer Spieler2
	spieler2 = new JPanel(new FlowLayout(0));
	spieler2.add(spielerlabel2);
	spieler2.add(name2);
	spieler2.setBackground(Color.orange);

	// Panel fuer Spieler3
	spieler3 = new JPanel(new FlowLayout(0));
	spieler3.add(spielerlabel3);
	spieler3.add(name3);
	spieler3.setBackground(Color.pink);

<<<<<<< HEAD
		// Panel fuer Spieler1
		JPanel spieler1 = new JPanel(new FlowLayout(0));
		spieler1.add(spielerlabel1);
		spieler1.add(name1);
		spieler1.setBackground(Color.yellow);
=======
	// Panel fuer Spieler 4
	spieler4 = new JPanel(new FlowLayout(0));
	spieler4.add(spielerlabel4);
	spieler4.add(name4);
	spieler4.setBackground(Color.magenta);
>>>>>>> branch 'master' of https://github.com/WISCB16/Memory4ALL.git

<<<<<<< HEAD
		// Panel fuer Spieler2
		JPanel spieler2 = new JPanel(new FlowLayout(0));
		spieler2.add(spielerlabel2);
		spieler2.add(name2);
		spieler2.setBackground(Color.orange);
=======
	// Zusammenfassung der Spieler Panels
	spieler = new JPanel(new GridLayout(4, 1));
	spieler.add(spieler1);
	spieler.add(spieler2);
	spieler.add(spieler3);
	spieler.add(spieler4);
	spieler.setBorder(rahmenspieler);
	spieler.setBackground(Color.cyan);
	
	// Bilder fuer das Dropdowns
	String path = System.getProperty("user.dir")+"\\src\\memory\\Bilder\\";
	
	ImageIcon schiggieinfuegen = new ImageIcon(path+"001-squirtle.png");
	Image schiggigetter = schiggieinfuegen.getImage();
	Image schiggiresize = schiggigetter.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
	ImageIcon schiggi = new ImageIcon(schiggiresize);
>>>>>>> branch 'master' of https://github.com/WISCB16/Memory4ALL.git

<<<<<<< HEAD
		// Panel fuer Spieler3
		JPanel spieler3 = new JPanel(new FlowLayout(0));
		spieler3.add(spielerlabel3);
		spieler3.add(name3);
		spieler3.setBackground(Color.pink);
=======
	
	ImageIcon glumandereinfuegen =  new ImageIcon (path+"002-bullbasaur.png");
	Image glumandergetter = glumandereinfuegen.getImage();
	Image glumanderresize = glumandergetter.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
	ImageIcon glumander = new ImageIcon(glumanderresize);
>>>>>>> branch 'master' of https://github.com/WISCB16/Memory4ALL.git

<<<<<<< HEAD
		// Panel fuer Spieler 4
		JPanel spieler4 = new JPanel(new FlowLayout(0));
		spieler4.add(spielerlabel4);
		spieler4.add(name4);
		spieler4.setBackground(Color.magenta);
=======
	ImageIcon bisasameinfuegen = new ImageIcon(path+"002-bullbasaur.png");
	Image bisasamgetter = bisasameinfuegen.getImage();
	Image bisasamresize = bisasamgetter.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
	ImageIcon bisasam = new ImageIcon(bisasamresize);
>>>>>>> branch 'master' of https://github.com/WISCB16/Memory4ALL.git

	ImageIcon relaxoeinfuegen = new ImageIcon(path+"004-snorlax.png");
	Image relaxogetter = relaxoeinfuegen.getImage();
	Image relaxoresize = relaxogetter.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
	ImageIcon relaxo = new ImageIcon(relaxoresize);

<<<<<<< HEAD
		// Bilder fuer das Dropdowns
		String path = System.getProperty("user.dir")+"\\src\\memory\\Bilder\\";
		
		ImageIcon schiggieinfuegen = new ImageIcon(path+"001-squirtle.png");
		Image schiggigetter = schiggieinfuegen.getImage();
		Image schiggiresize = schiggigetter.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
		ImageIcon schiggi = new ImageIcon(schiggiresize);
=======
	ImageIcon pikachueinfuegen = new ImageIcon(path+"005-pikachu.png");
	Image pikachugetter = pikachueinfuegen.getImage();
	Image pikachuresize = pikachugetter.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
	ImageIcon pikachu = new ImageIcon(pikachuresize);
>>>>>>> branch 'master' of https://github.com/WISCB16/Memory4ALL.git

<<<<<<< HEAD
		
		ImageIcon glumandereinfuegen =  new ImageIcon (path+"002-bullbasaur.png");
		Image glumandergetter = glumandereinfuegen.getImage();
		Image glumanderresize = glumandergetter.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
		ImageIcon glumander = new ImageIcon(glumanderresize);
=======
	ImageIcon mauzieinfuegen = new ImageIcon(path+"006-avatar.png");
	Image mauzigetter = mauzieinfuegen.getImage();
	Image mauziresize = mauzigetter.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
	ImageIcon mauzi = new ImageIcon(mauziresize);
>>>>>>> branch 'master' of https://github.com/WISCB16/Memory4ALL.git

<<<<<<< HEAD
		ImageIcon bisasameinfuegen = new ImageIcon(path+"002-bullbasaur.png");
		Image bisasamgetter = bisasameinfuegen.getImage();
		Image bisasamresize = bisasamgetter.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
		ImageIcon bisasam = new ImageIcon(bisasamresize);
=======
	ImageIcon monkeyeinfuegen = new ImageIcon(path+"007-mankey.png");
	Image monkeygetter = monkeyeinfuegen.getImage();
	Image monkeyresize = monkeygetter.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
	ImageIcon monkey = new ImageIcon(monkeyresize);
>>>>>>> branch 'master' of https://github.com/WISCB16/Memory4ALL.git

<<<<<<< HEAD
		ImageIcon relaxoeinfuegen = new ImageIcon(path+"004-snorlax.png");
		Image relaxogetter = relaxoeinfuegen.getImage();
		Image relaxoresize = relaxogetter.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
		ImageIcon relaxo = new ImageIcon(relaxoresize);
=======
	ImageIcon venomateinfuegen = new ImageIcon(path+"008.venomat.png");
	Image venomatgetter = venomateinfuegen.getImage();
	Image venomatresize = venomatgetter.getScaledInstance(90, 90, java.awt.Image.SCALE_SMOOTH);
	ImageIcon venomat = new ImageIcon(venomatresize);
>>>>>>> branch 'master' of https://github.com/WISCB16/Memory4ALL.git

<<<<<<< HEAD
		ImageIcon pikachueinfuegen = new ImageIcon(path+"005-pikachu.png");
		Image pikachugetter = pikachueinfuegen.getImage();
		Image pikachuresize = pikachugetter.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
		ImageIcon pikachu = new ImageIcon(pikachuresize);
=======
	ImageIcon ratfratzeinfuegen = new ImageIcon(path+"009-rattata.png");
	Image ratfratzgetter = ratfratzeinfuegen.getImage();
	Image ratfratzresize = ratfratzgetter.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
	ImageIcon ratfratz = new ImageIcon(ratfratzresize);
>>>>>>> branch 'master' of https://github.com/WISCB16/Memory4ALL.git

<<<<<<< HEAD
		ImageIcon mauzieinfuegen = new ImageIcon(path+"006-avatar.png");
		Image mauzigetter = mauzieinfuegen.getImage();
		Image mauziresize = mauzigetter.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
		ImageIcon mauzi = new ImageIcon(mauziresize);
=======
	ImageIcon taubsieinfuegen = new ImageIcon(path+"010-pidgey.png");
	Image taubsigetter = taubsieinfuegen.getImage();
	Image taubsiresize = taubsigetter.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
	ImageIcon taubsi = new ImageIcon(taubsiresize);
>>>>>>> branch 'master' of https://github.com/WISCB16/Memory4ALL.git

<<<<<<< HEAD
		ImageIcon monkeyeinfuegen = new ImageIcon(path+"007-mankey.png");
		Image monkeygetter = monkeyeinfuegen.getImage();
		Image monkeyresize = monkeygetter.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
		ImageIcon monkey = new ImageIcon(monkeyresize);
=======
	ImageIcon meweinfuegen = new ImageIcon(path+"011-sqirtle.png");
	Image mewgetter = meweinfuegen.getImage();
	Image mewresize = mewgetter.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
	ImageIcon mew = new ImageIcon(mewresize);
>>>>>>> branch 'master' of https://github.com/WISCB16/Memory4ALL.git

<<<<<<< HEAD
		ImageIcon venomateinfuegen = new ImageIcon(path+"008.venomat.png");
		Image venomatgetter = venomateinfuegen.getImage();
		Image venomatresize = venomatgetter.getScaledInstance(90, 90, java.awt.Image.SCALE_SMOOTH);
		ImageIcon venomat = new ImageIcon(venomatresize);
=======
	ImageIcon evolieinfuegen = new ImageIcon(path+"012-eevee.png");
	Image evoligetter = evolieinfuegen.getImage();
	Image evoliresize = evoligetter.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
	ImageIcon evoli = new ImageIcon(evoliresize);
>>>>>>> branch 'master' of https://github.com/WISCB16/Memory4ALL.git

<<<<<<< HEAD
		ImageIcon ratfratzeinfuegen = new ImageIcon(path+"009-rattata.png");
		Image ratfratzgetter = ratfratzeinfuegen.getImage();
		Image ratfratzresize = ratfratzgetter.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
		ImageIcon ratfratz = new ImageIcon(ratfratzresize);
=======
	ImageIcon puffeinfuegen = new ImageIcon(path+"013-jigglypuff.png");
	Image puffgetter = puffeinfuegen.getImage();
	Image puffresize = puffgetter.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
	ImageIcon puff = new ImageIcon(puffresize);
>>>>>>> branch 'master' of https://github.com/WISCB16/Memory4ALL.git

<<<<<<< HEAD
		ImageIcon taubsieinfuegen = new ImageIcon(path+"010-pidgey.png");
		Image taubsigetter = taubsieinfuegen.getImage();
		Image taubsiresize = taubsigetter.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
		ImageIcon taubsi = new ImageIcon(taubsiresize);
=======
	ImageIcon[] sammlung = { schiggi, glumander, relaxo, bisasam, pikachu, puff, evoli, taubsi, venomat, monkey,
			mew, ratfratz, mauzi };
	
	// Dropdown Menues
	dropdowns1 = new JComboBox<Object>(sammlung);
	dropdowns2 = new JComboBox<Object>(sammlung);
	dropdowns3 = new JComboBox<Object>(sammlung);
	dropdowns4 = new JComboBox<Object>(sammlung);
>>>>>>> branch 'master' of https://github.com/WISCB16/Memory4ALL.git

<<<<<<< HEAD
		ImageIcon meweinfuegen = new ImageIcon(path+"011-sqirtle.png");
		Image mewgetter = meweinfuegen.getImage();
		Image mewresize = mewgetter.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
		ImageIcon mew = new ImageIcon(mewresize);
=======
	JPanel dropdown = new JPanel(new GridLayout(4, 1));
	dropdown.add(dropdowns1);
	dropdown.add(dropdowns2);
	dropdown.add(dropdowns3);
	dropdown.add(dropdowns4);
>>>>>>> branch 'master' of https://github.com/WISCB16/Memory4ALL.git

<<<<<<< HEAD
		ImageIcon evolieinfuegen = new ImageIcon(path+"012-eevee.png");
		Image evoligetter = evolieinfuegen.getImage();
		Image evoliresize = evoligetter.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
		ImageIcon evoli = new ImageIcon(evoliresize);
=======
	// Buttons fuer Start/Reset
	reset = new JButton("Reset");
	reset.setBackground(Color.RED);
	reset.setFont(new Font("MS Gothic", Font.BOLD, 20));
>>>>>>> branch 'master' of https://github.com/WISCB16/Memory4ALL.git

<<<<<<< HEAD
		ImageIcon puffeinfuegen = new ImageIcon(path+"013-jigglypuff.png");
		Image puffgetter = puffeinfuegen.getImage();
		Image puffresize = puffgetter.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
		ImageIcon puff = new ImageIcon(puffresize);
=======
	start = new JButton("Spiel starten!");
	start.setBackground(Color.GREEN);
	start.setFont(new Font("MS Gothic", Font.BOLD, 20));
>>>>>>> branch 'master' of https://github.com/WISCB16/Memory4ALL.git

	// Panel fuer Buttons fuer Start/Reset
	buttons = new JPanel(new GridLayout(1, 2));
	buttons.add(reset);
	buttons.add(start);

	// Anordnung im Hauptmenue
	setJMenuBar(m);
	getContentPane.add(schwierigkeit, BorderLayout.WEST);
	getContentPane.add(spieler, BorderLayout.CENTER);
	getContentPane.add(dropdown, BorderLayout.EAST);
	getContentPane.add(buttons, BorderLayout.SOUTH);

	// Weitere Einstellungen fuer das Hauptmenue
	setVisible(true);
	setBounds(400, 50, 1100, 750);
	setResizable(true);
	

	
	}
	

}