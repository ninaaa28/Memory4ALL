package memory;

import java.awt.*;

import javax.swing.*;
import javax.swing.border.Border;

public class Hauptmenue {
	public static void main(String[] args) {

		JFrame hauptmenue = new JFrame("Hauptmen�");
		hauptmenue.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		hauptmenue.setLayout(new BorderLayout());

		// Rahmen der Panels
		Border rahmen1 = BorderFactory.createEtchedBorder();
		Border rahmenschwierigkeit = BorderFactory.createTitledBorder(rahmen1, "Schwierigkeit wählen");
		Border rahmenspieler = BorderFactory.createTitledBorder(rahmen1, "Spieler angeben");

		// Menüelemente für den oberen Rand
		JMenu m1 = new JMenu("Anleitung");
		m1.add("Ansehen");
		m1.add("Punkte ergänzen");
		m1.setBackground(Color.yellow);

		JMenu m2 = new JMenu("Impressum");
		m2.add("Ansehen");
		m2.add("Kontakt aufnehmen");
		m2.setBackground(Color.yellow);

		// Zusammenfassung der Menüleiste
		JMenuBar m = new JMenuBar();
		m.add(m1);
		m.add(m2);
		m.setBackground(Color.lightGray);

		// Schwierigkeitsbereich anpassen
		JPanel schwierigkeit = new JPanel(new GridLayout(5, 1));
		ButtonGroup schwere = new ButtonGroup();
		JCheckBox sehrleicht = new JCheckBox("Sehr Leicht (16 Karten)");
		schwere.add(sehrleicht);
		schwierigkeit.add(sehrleicht);
		JCheckBox leicht = new JCheckBox("Leicht (32 Karten)");
		schwere.add(leicht);
		schwierigkeit.add(leicht);
		JCheckBox mittel = new JCheckBox("Mittel (48 Karten)");
		schwere.add(mittel);
		schwierigkeit.add(mittel);
		JCheckBox schwer = new JCheckBox("Schwer(64 Karten)");
		schwere.add(schwer);
		schwierigkeit.add(schwer);
		JCheckBox sehrschwer = new JCheckBox("Sehr Schwer (72 Karten)");
		schwere.add(sehrschwer);
		schwierigkeit.add(sehrschwer);
		schwierigkeit.setBorder(rahmenschwierigkeit);
		schwierigkeit.setBackground(Color.cyan);

		// Textfeld für die Spieler
		JTextField name1 = new JTextField(30);
		name1.setFont(new Font("Serif", Font.PLAIN, 25));

		JTextField name2 = new JTextField(30);
		name2.setFont(new Font("Serif", Font.PLAIN, 25));

		JTextField name3 = new JTextField(30);
		name3.setFont(new Font("Serif", Font.PLAIN, 25));

		JTextField name4 = new JTextField(30);
		name4.setFont(new Font("Serif", Font.PLAIN, 25));

		// Label für Spieler
		JLabel spielerlabel1 = new JLabel("Spieler 1");
		spielerlabel1.setFont(new Font("Serif", Font.BOLD, 40));

		JLabel spielerlabel2 = new JLabel("Spieler 2");
		spielerlabel2.setFont(new Font("Serif", Font.BOLD, 40));

		JLabel spielerlabel3 = new JLabel("Spieler 3");
		spielerlabel3.setFont(new Font("Serif", Font.BOLD, 40));

		JLabel spielerlabel4 = new JLabel("Spieler 4");
		spielerlabel4.setFont(new Font("Serif", Font.BOLD, 40));

		// Panel für Spieler1
		JPanel spieler1 = new JPanel(new FlowLayout(0));
		spieler1.add(spielerlabel1);
		spieler1.add(name1);
		spieler1.setBackground(Color.yellow);

		// Panel für Spieler2
		JPanel spieler2 = new JPanel(new FlowLayout(0));
		spieler2.add(spielerlabel2);
		spieler2.add(name2);
		spieler2.setBackground(Color.orange);

		// Panel für Spieler3
		JPanel spieler3 = new JPanel(new FlowLayout(0));
		spieler3.add(spielerlabel3);
		spieler3.add(name3);
		spieler3.setBackground(Color.pink);

		// Panel für Spieler 4
		JPanel spieler4 = new JPanel(new FlowLayout(0));
		spieler4.add(spielerlabel4);
		spieler4.add(name4);
		spieler4.setBackground(Color.magenta);

		// Zusammenfassung der Spieler Panels
		JPanel spieler = new JPanel(new GridLayout(4, 1));
		spieler.add(spieler1);
		spieler.add(spieler2);
		spieler.add(spieler3);
		spieler.add(spieler4);
		spieler.setBorder(rahmenspieler);
		spieler.setBackground(Color.cyan);

		// Bilder für das Dropdowns
		String path = System.getProperty("user.dir")+"\\src\\memory\\Bilder\\";
		
		ImageIcon schiggieinfügen = new ImageIcon(path+"001-squirtle.png");
		Image schiggigetter = schiggieinfügen.getImage();
		Image schiggiresize = schiggigetter.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
		ImageIcon schiggi = new ImageIcon(schiggiresize);

		
		ImageIcon glumandereinfügen =  new ImageIcon (path+"002-bullbasaur.png");
		Image glumandergetter = glumandereinfügen.getImage();
		Image glumanderresize = glumandergetter.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
		ImageIcon glumander = new ImageIcon(glumanderresize);

		ImageIcon bisasameinfügen = new ImageIcon(path+"002-bullbasaur.png");
		Image bisasamgetter = bisasameinfügen.getImage();
		Image bisasamresize = bisasamgetter.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
		ImageIcon bisasam = new ImageIcon(bisasamresize);

		ImageIcon relaxoeinfügen = new ImageIcon(path+"004-snorlax.png");
		Image relaxogetter = relaxoeinfügen.getImage();
		Image relaxoresize = relaxogetter.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
		ImageIcon relaxo = new ImageIcon(relaxoresize);

		ImageIcon pikachueinfügen = new ImageIcon(path+"005-pikachu.png");
		Image pikachugetter = pikachueinfügen.getImage();
		Image pikachuresize = pikachugetter.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
		ImageIcon pikachu = new ImageIcon(pikachuresize);

		ImageIcon mauzieinfügen = new ImageIcon(path+"006-avatar.png");
		Image mauzigetter = mauzieinfügen.getImage();
		Image mauziresize = mauzigetter.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
		ImageIcon mauzi = new ImageIcon(mauziresize);

		ImageIcon monkeyeinfügen = new ImageIcon(path+"007-mankey.png");
		Image monkeygetter = monkeyeinfügen.getImage();
		Image monkeyresize = monkeygetter.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
		ImageIcon monkey = new ImageIcon(monkeyresize);

		ImageIcon venomateinfügen = new ImageIcon(path+"008.venomat.png");
		Image venomatgetter = venomateinfügen.getImage();
		Image venomatresize = venomatgetter.getScaledInstance(90, 90, java.awt.Image.SCALE_SMOOTH);
		ImageIcon venomat = new ImageIcon(venomatresize);

		ImageIcon ratfratzeinfügen = new ImageIcon(path+"009-rattata.png");
		Image ratfratzgetter = ratfratzeinfügen.getImage();
		Image ratfratzresize = ratfratzgetter.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
		ImageIcon ratfratz = new ImageIcon(ratfratzresize);

		ImageIcon taubsieinfügen = new ImageIcon(path+"010-pidgey.png");
		Image taubsigetter = taubsieinfügen.getImage();
		Image taubsiresize = taubsigetter.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
		ImageIcon taubsi = new ImageIcon(taubsiresize);

		ImageIcon meweinfügen = new ImageIcon(path+"011-sqirtle.png");
		Image mewgetter = meweinfügen.getImage();
		Image mewresize = mewgetter.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
		ImageIcon mew = new ImageIcon(mewresize);

		ImageIcon evolieinfügen = new ImageIcon(path+"012-eevee.png");
		Image evoligetter = evolieinfügen.getImage();
		Image evoliresize = evoligetter.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
		ImageIcon evoli = new ImageIcon(evoliresize);

		ImageIcon puffeinfügen = new ImageIcon(path+"013-jigglypuff.png");
		Image puffgetter = puffeinfügen.getImage();
		Image puffresize = puffgetter.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
		ImageIcon puff = new ImageIcon(puffresize);

		ImageIcon[] sammlung = { schiggi, glumander, relaxo, bisasam, pikachu, puff, evoli, taubsi, venomat, monkey,
				mew, ratfratz, mauzi };

		// Dropdown Menüs
		JComboBox<Object> dropdowns1 = new JComboBox<Object>(sammlung);
		JComboBox<Object> dropdowns2 = new JComboBox<Object>(sammlung);
		JComboBox<Object> dropdowns3 = new JComboBox<Object>(sammlung);
		JComboBox<Object> dropdowns4 = new JComboBox<Object>(sammlung);

		JPanel dropdown = new JPanel(new GridLayout(4, 1));
		dropdown.add(dropdowns1);
		dropdown.add(dropdowns2);
		dropdown.add(dropdowns3);
		dropdown.add(dropdowns4);

		// Buttons für Start/Reset
		JButton reset = new JButton("Reset");
		reset.setBackground(Color.RED);
		reset.setFont(new Font("MS Gothic", Font.BOLD, 20));

		JButton start = new JButton("Spiel starten!");
		start.setBackground(Color.GREEN);
		start.setFont(new Font("MS Gothic", Font.BOLD, 20));

		// Panel für Buttons für Start/Reset
		JPanel buttons = new JPanel(new GridLayout(1, 2));
		buttons.add(reset);
		buttons.add(start);

		// Anordnung im Hauptmenue
		hauptmenue.setJMenuBar(m);
		hauptmenue.add(schwierigkeit, BorderLayout.WEST);
		hauptmenue.add(spieler, BorderLayout.CENTER);
		hauptmenue.add(dropdown, BorderLayout.EAST);
		hauptmenue.add(buttons, BorderLayout.SOUTH);

		// Weitere Einstellungen für das Hauptmenue
		hauptmenue.setVisible(true);
		hauptmenue.setBounds(400, 50, 1100, 750);
		hauptmenue.setResizable(true);

	}
}