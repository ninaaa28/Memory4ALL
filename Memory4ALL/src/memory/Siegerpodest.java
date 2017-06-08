package memory;

import java.awt.*;
import javax.swing.*;

public class Siegerpodest {
	public static void main(String[] args) {

		JFrame podest = new JFrame("Siegerpodest");
		podest.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		podest.setLayout(new BorderLayout());

		// Menüelemente für den oberen Rand
		JMenu m1 = new JMenu("Anleitung");
		m1.add("Ansehen");
		m1.add("Punkte ergänzen");
		m1.setBackground(Color.lightGray);

		JMenu m2 = new JMenu("Impressum");
		m2.add("Ansehen");
		m2.add("Kontakt aufnehmen");
		m2.setBackground(Color.lightGray);

		// Zusammenfassung der Menüleiste
		JMenuBar m = new JMenuBar();
		m.add(m1);
		m.add(m2);
		m.setBackground(Color.lightGray);

		// Bildbearbeitung des Podest
		ImageIcon schiggieinfügen = new ImageIcon("C:/Users/LennartanDeMeulen/Pictures/Pokemon/001-squirtle.png");
		Image schiggigetter = schiggieinfügen.getImage();
		Image schiggiresize = schiggigetter.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
		ImageIcon schiggi = new ImageIcon(schiggiresize);
		JLabel schiggibild = new JLabel(schiggi);

		ImageIcon glumandereinfügen = new ImageIcon("C:/Users/LennartanDeMeulen/Pictures/Pokemon/003-charmander.png");
		Image glumandergetter = glumandereinfügen.getImage();
		Image glumanderresize = glumandergetter.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
		ImageIcon glumander = new ImageIcon(glumanderresize);
		JLabel glumanderbild = new JLabel(glumander);

		ImageIcon bisasameinfügen = new ImageIcon("C:/Users/LennartanDeMeulen/Pictures/Pokemon/002-bullbasaur.png");
		Image bisasamgetter = bisasameinfügen.getImage();
		Image bisasamresize = bisasamgetter.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
		ImageIcon bisasam = new ImageIcon(bisasamresize);
		JLabel bisasambild = new JLabel(bisasam);

		ImageIcon podestpiceinfügen = new ImageIcon("/Memory4ALL/src/memory/Podest.PNG");
		Image podestpicgetter = podestpiceinfügen.getImage();
		Image podestpicresize = podestpicgetter.getScaledInstance(900, 650, java.awt.Image.SCALE_SMOOTH);
		ImageIcon podestpic = new ImageIcon(podestpicresize);
		JLabel podestbild = new JLabel(podestpic);

		JPanel zentrale = new JPanel(new GridLayout(1, 1));
		zentrale.add(podestbild);
		zentrale.setBackground(Color.cyan);

		// Seitenfarben
		JPanel seitelinks = new JPanel();
		seitelinks.setBackground(Color.CYAN);
		JPanel seiterechts = new JPanel();
		seiterechts.setBackground(Color.CYAN);

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

		// Anordnung im Frame
		podest.add(m, BorderLayout.NORTH);
		podest.add(seitelinks, BorderLayout.WEST);
		podest.add(zentrale, BorderLayout.CENTER);
		podest.add(seiterechts, BorderLayout.EAST);
		podest.add(buttons, BorderLayout.SOUTH);

		// Weitere Einstellung für das Podest Frame
		podest.setVisible(true);
		podest.setBounds(400, 50, 1100, 750);
		podest.setResizable(true);

	}

}
