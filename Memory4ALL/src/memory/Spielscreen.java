package memory;

import java.awt.*;

import javax.swing.*;

public class Spielscreen {

	public static void main(String[] args) {

		// Initialisierung des Screens
		JFrame gamepad = new JFrame("Memory");
		gamepad.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		gamepad.setLayout(new BorderLayout());

		// Menueelemente fuer den oberen Rand
		JMenu m1 = new JMenu("Anleitung");
		m1.add("Ansehen");
		m1.add("Punkte ergÃ¤nzen");
		m1.setBackground(Color.lightGray);

		JMenu m2 = new JMenu("Impressum");
		m2.add("Ansehen");
		m2.add("Kontakt aufnehmen");
		m2.setBackground(Color.lightGray);

		// Zusammenfassung der Menueleiste
		JMenuBar m = new JMenuBar();
		m.add(m1);
		m.add(m2);
		m.setBackground(Color.lightGray);

		// Bilderfassung Spieler 1
		ImageIcon schiggieinfuegen = new ImageIcon("C:/Users/LennartanDeMeulen/Pictures/Pokemon/001-squirtle.png");
		Image schiggigetter = schiggieinfuegen.getImage();
		Image schiggiresize = schiggigetter.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
		ImageIcon schiggi = new ImageIcon(schiggiresize);
		JLabel schiggibild = new JLabel(schiggi);

		// Spielerinformationen Spieler 1
		JPanel spieler1 = new JPanel(new GridLayout(3, 1));
		spieler1.add(new JLabel("Spieler 1"));
		spieler1.add(new JLabel("Zeit: 12:00"));
		spieler1.add(new Label("Spielzüge:25"));
		spieler1.setBackground(Color.red);

		// Spielerinformationen Spieler 3
		JPanel spieler3 = new JPanel(new GridLayout(3, 1));
		spieler3.add(new JLabel("Spieler 3"));
		spieler3.add(new JLabel("Zeit: 13:00"));
		spieler3.add(new Label("Spielzüge:24"));
		spieler3.setBackground(Color.cyan);

		// Bilderfassung Spieler 3
		ImageIcon glumandereinfuegen = new ImageIcon("C:/Users/LennartanDeMeulen/Pictures/Pokemon/003-charmander.png");
		Image glumandergetter = glumandereinfuegen.getImage();
		Image glumanderresize = glumandergetter.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
		ImageIcon glumander = new ImageIcon(glumanderresize);
		JLabel glumanderbild = new JLabel(glumander);

		// Zusammenfassung der Spieler 1,3
		JPanel spielerleiste13 = new JPanel(new GridLayout(4, 1));
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

		// Spielerinformation Spieler 2
		JPanel spieler2 = new JPanel(new GridLayout(3, 1));
		spieler2.add(new JLabel("Spieler 2"));
		spieler2.add(new JLabel("Zeit: 12:30"));
		spieler2.add(new Label("Spielzüge:25"));
		spieler2.setBackground(Color.green);

		// Bilderfassung Spieler 2
		ImageIcon bisasameinfuegen = new ImageIcon("C:/Users/LennartanDeMeulen/Pictures/Pokemon/002-bullbasaur.png");
		Image bisasamgetter = bisasameinfuegen.getImage();
		Image bisasamresize = bisasamgetter.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
		ImageIcon bisasam = new ImageIcon(bisasamresize);
		JLabel bisasambild = new JLabel(bisasam);
		bisasambild.setBackground(Color.green);

		// Bilderfassung Spieler 4
		ImageIcon pikachueinfuegen = new ImageIcon("C:/Users/LennartanDeMeulen/Pictures/Pokemon/005-pikachu.png");
		Image pikachugetter = pikachueinfuegen.getImage();
		Image pikachuresize = pikachugetter.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
		ImageIcon pikachu = new ImageIcon(pikachuresize);
		JLabel pikachubild = new JLabel(pikachu);
		pikachubild.setBackground(Color.yellow);

		// Spielerinformation Spieler 4
		JPanel spieler4 = new JPanel(new GridLayout(3, 1));
		spieler4.add(new JLabel("Spieler 4"));
		spieler4.add(new JLabel("Zeit: 15:00"));
		spieler4.add(new Label("Spielzüge:24"));
		spieler4.setBackground(Color.yellow);

		// Zusammenfassung Spieler 2,4
		JPanel spielerleiste24 = new JPanel(new GridLayout(4, 1));
		spielerleiste24.add(bisasambild);
		spielerleiste24.add(spieler2);
		spielerleiste24.add(spieler4);
		spielerleiste24.add(pikachubild);

		// Buttons am Ende
		JButton ngame = new JButton("Spiel neu konfigurieren?");
		ngame.setBackground(Color.YELLOW);
		ngame.setFont(new Font("MS Gothic", Font.BOLD, 20));

		JButton rgame = new JButton("Spiel erneut beginnen?");
		rgame.setBackground(Color.green);
		rgame.setFont(new Font("MS Gothic", Font.BOLD, 20));

		JButton close = new JButton("Anwendung schließen");
		close.setBackground(Color.red);
		close.setFont(new Font("MS Gothic", Font.BOLD, 20));

		// Button in ein Panel einpassen
		JPanel buttons = new JPanel(new GridLayout(1, 3));
		buttons.add(close);
		buttons.add(ngame);
		buttons.add(rgame);

		// Layout fuer das Frame
		gamepad.add(m, BorderLayout.NORTH);
		gamepad.add(spielerleiste13, BorderLayout.WEST);
		gamepad.add(tischbild, BorderLayout.CENTER);
		gamepad.add(spielerleiste24, BorderLayout.EAST);
		gamepad.add(buttons, BorderLayout.SOUTH);

		// Weitere Konfigurationen fuer das Frame
		gamepad.setVisible(true);
		gamepad.setBounds(400, 50, 1100, 750);
		gamepad.setResizable(true);

	}

}
