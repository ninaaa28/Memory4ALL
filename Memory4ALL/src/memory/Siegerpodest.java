package memory;

import java.awt.*;
import javax.swing.*;

public class Siegerpodest extends JFrame {
	
	private JFrame podest;
	private JMenu m1, m2;
	private JMenuBar m;
	private JPanel zentrale, seitelinks, seiterechts, buttons;
	private JButton rgame, ngame, close;
	
	
	public Siegerpodest (){
		
		super ("Siegerpodest");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());

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

		// Bildbearbeitung des Podest
		ImageIcon schiggieinfuegen = new ImageIcon("C:/Users/LennartanDeMeulen/Pictures/Pokemon/001-squirtle.png");
		Image schiggigetter = schiggieinfuegen.getImage();
		Image schiggiresize = schiggigetter.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
		ImageIcon schiggi = new ImageIcon(schiggiresize);
		JLabel schiggibild = new JLabel(schiggi);

		ImageIcon glumandereinfuegen = new ImageIcon("C:/Users/LennartanDeMeulen/Pictures/Pokemon/003-charmander.png");
		Image glumandergetter = glumandereinfuegen.getImage();
		Image glumanderresize = glumandergetter.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
		ImageIcon glumander = new ImageIcon(glumanderresize);
		JLabel glumanderbild = new JLabel(glumander);

		ImageIcon bisasameinfuegen = new ImageIcon("C:/Users/LennartanDeMeulen/Pictures/Pokemon/002-bullbasaur.png");
		Image bisasamgetter = bisasameinfuegen.getImage();
		Image bisasamresize = bisasamgetter.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
		ImageIcon bisasam = new ImageIcon(bisasamresize);
		JLabel bisasambild = new JLabel(bisasam);

		ImageIcon podestpiceinfuegen = new ImageIcon("/Memory4ALL/src/memory/Podest.PNG");
		Image podestpicgetter = podestpiceinfuegen.getImage();
		Image podestpicresize = podestpicgetter.getScaledInstance(900, 650, java.awt.Image.SCALE_SMOOTH);
		ImageIcon podestpic = new ImageIcon(podestpicresize);
		JLabel podestbild = new JLabel(podestpic);

		zentrale = new JPanel(new GridLayout(1, 1));
		zentrale.add(podestbild);
		zentrale.setBackground(Color.cyan);

		// Seitenfarben
		seitelinks = new JPanel();
		seitelinks.setBackground(Color.CYAN);
		seiterechts = new JPanel();
		seiterechts.setBackground(Color.CYAN);

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

		// Anordnung im Frame
		add(m, BorderLayout.NORTH);
		add(seitelinks, BorderLayout.WEST);
		add(zentrale, BorderLayout.CENTER);
		add(seiterechts, BorderLayout.EAST);
		add(buttons, BorderLayout.SOUTH);

		// Weitere Einstellung fuer das Podest Frame
		setVisible(true);
		setBounds(400, 50, 1100, 750);
		setResizable(true);

	}
	
	
	public static void main(String[] args) {
		
		new Siegerpodest ();
	}

}
