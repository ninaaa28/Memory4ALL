package memory;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.Border;

public class Hauptmenue extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private ItemListener spieler2textfeld = new ItemListener() {
		@Override
		public void itemStateChanged (ItemEvent e) {
			if (s2.isSelected())
				name2.setEditable(true);
			else {
				name2.setEditable(false);
				name2.setText("");
			}
		}
	};
	private ItemListener spieler3textfeld = new ItemListener() {
		@Override
		public void itemStateChanged (ItemEvent e) {
			if (s3.isSelected())
				name3.setEditable(true);
			else {
				name3.setEditable(false);
				name3.setText("");
			}
		}
	};
	
	private ItemListener spieler4textfeld = new ItemListener() {
		@Override
		public void itemStateChanged (ItemEvent e) {
			if (s4.isSelected())
				name4.setEditable(true);
			else {
				name4.setEditable(false);
				name4.setText("");
			}
		}
	};
	
	private ActionListener resettip = new ActionListener () {

		@Override
		public void actionPerformed(ActionEvent e) {
			String cmd = e.getActionCommand();
			if (cmd.equals(reset))
			s1.setSelected(false);
			s2.setSelected(false);
			s3.setSelected(false);
			s4.setSelected(false);
			name1.setText("");
			name2.setText("");
			name3.setText("");
			name4.setText("");
			dropdowns1.setSelectedIndex(1);
			dropdowns2.setSelectedIndex(2);
			dropdowns3.setSelectedIndex(3);
			dropdowns4.setSelectedIndex(4);
			sehrleicht.setSelected(true); 
		}
	};
	
	//ActionListener buttonListener "Spiel starten"
	private ActionListener buttonListenerStart = new ActionListener() {

		@Override
//		TODO throw Exception
		public void actionPerformed(ActionEvent e) {
			String cmd = e.getActionCommand();
			
			if(name1.getText().equals(""))
				System.out.println("Auf Statusleiste \"Mindestens ein Spielername eintragen\" anzeigen");
			else {
				
				//Wenn für Spieler eine Name eingegeben wurde, wird ein Spieler-Objekt Spieler1 erzeugt
				if(cmd.equals("Spiel starten!"))
					if(s1.isSelected())
						if(name1.getText().equals(null))
							/*EXCEPTION*/;
						else {
						Spieler.erstelleSpieler1(name1.getText(), (Icon)dropdowns1.getSelectedItem(),  0, 0f, 0f, 0, 0);
					};

				//Wenn für Spieler 2 eine Name eingegeben wurde, wird ein Spieler-Objekt Spieler2 erzeugt
				if(cmd.equals("Spiel starten!"))
					if(s2.isSelected())
						if(name2.getText().equals(null))
							/*EXCEPTION*/;
						else {
							Spieler.erstelleSpieler2(name2.getText(), (Icon)dropdowns2.getSelectedItem(), 0, 0f, 0f, 0, 0);
						}
				//Wenn für Spieler 3 eine Name eingegeben wurde, wird ein Spieler-Objekt Spieler3 erzeugt
				if(cmd.equals("Spiel starten!"))
					if(s3.isSelected())
						if(name3.getText().equals(null))
							/*EXCEPTION*/;
						else {
						Spieler.erstelleSpieler3(name3.getText(), (Icon)dropdowns4.getSelectedItem(), 0, 0f, 0f, 0, 0);
					}
		
				//Wenn für Spieler 4 eine Name eingegeben wurde, wird ein Spieler-Objekt Spieler4 erzeugt
				if(cmd.equals("Spiel starten!"))
					if(s4.isSelected())
						if(name4.getText().equals(null))
							/*EXCEPTION*/;
						else {
						Spieler.erstelleSpieler4(name4.getText(), (Icon)dropdowns4.getSelectedItem(), 0, 0f, 0f, 0, 0);
					}
				
				if(cmd.equals("Spiel starten!")) {
					Spielscreen screen = new Spielscreen(32);
					screen.setVisible(true);
//					TODO Hauptmenue muss beendet werden
				}
			}	
		}
	};
	
	private JMenu m1, m2;
	private JMenuBar m;
	private JPanel schwierigkeit, spieler1, spieler2, spieler3, spieler4, spieler, buttons;
	private JComboBox <Object> dropdowns1, dropdowns2, dropdowns3, dropdowns4;
	private JRadioButton sehrleicht, leicht, mittel, schwer, sehrschwer;
	private JCheckBox s1, s2, s3, s4;
	private JLabel spielerlabel1, spielerlabel2, spielerlabel3, spielerlabel4;
	private JTextField name1, name2, name3, name4;
	private JButton reset, start;
	private ImageIcon schiggi, glumander, relaxo, pikachu, mauzi, monkey, venomat, ratzfratz, pidget, mew, puff, evoli ;
	
	
	
public Hauptmenue (){
	
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

	m2 = new JMenu("Impressum");
	m2.add("Ansehen");
	m2.add("Kontakt aufnehmen");
	m2.setBackground(Color.yellow);

	// Zusammenfassung der Menüleiste
	m = new JMenuBar();
	m.add(m1);
	m.add(m2);
	m.setBackground(Color.lightGray);

	// Schwierigkeitsbereich anpassen
	
	ButtonGroup schwierigkeitsgrad = new ButtonGroup (); 
	
	schwierigkeit = new JPanel(new GridLayout(5, 1));
	sehrleicht = new JRadioButton("Sehr Leicht (16 Karten)");
	sehrleicht.setBackground(Color.cyan);
	sehrleicht.setSelected(true); 								//sehrleicht ist default
	schwierigkeitsgrad.add(sehrleicht);
	schwierigkeit.add(sehrleicht);
	leicht = new JRadioButton("Leicht (32 Karten)");
	leicht.setBackground(Color.cyan);
	schwierigkeitsgrad.add(leicht);
	schwierigkeit.add(leicht);
	mittel = new JRadioButton("Mittel (48 Karten)");
	mittel.setBackground(Color.cyan);
	schwierigkeitsgrad.add(mittel);
	schwierigkeit.add(mittel);
	schwer = new JRadioButton("Schwer(64 Karten)");
	schwer.setBackground(Color.cyan);
	schwierigkeitsgrad.add(schwer);
	schwierigkeit.add(schwer);
	sehrschwer = new JRadioButton("Sehr Schwer (72 Karten)");
	sehrschwer.setBackground(Color.cyan);
	schwierigkeitsgrad.add(sehrschwer);
	schwierigkeit.add(sehrschwer);
	schwierigkeit.setBorder(rahmenschwierigkeit);
	schwierigkeit.setBackground(Color.cyan);

	// Textfeld fuer die Spieler
	s1 = new JCheckBox ();
	s1.setBackground(Color.yellow);;
	s1.setSelected(true);
	s1.setEnabled(false);
	if(Spieler.getListe().contains(Spieler.getSpieler1()))	//Falls bereits ein Objekte spieler1 der Klasse Spieler erzeugt wurde
	{
		name1.setText(Spieler.getSpieler1().getName());
	}
	else {
			name1 = new JTextField(30);
			name1.setFont(new Font("Serif", Font.PLAIN, 25));
	}	

	s2 = new JCheckBox ();
	s2.addItemListener(spieler2textfeld);
	s2.setBackground(Color.orange);
	if(Spieler.getListe().contains(Spieler.getSpieler2()))	//Falls bereits ein Objekte spieler2 der Klasse Spieler erzeugt wurde
	{
		name2.setText(Spieler.getSpieler2().getName());
	}
	else {
		name2 = new JTextField(30);
		name2.setFont(new Font("Serif", Font.PLAIN, 25));
	}
	name2.setEditable(false);

	s3 = new JCheckBox ();
	s3.addItemListener(spieler3textfeld);
	s3.setBackground(Color.pink);
	if(Spieler.getListe().contains(Spieler.getSpieler3()))	//Falls bereits ein Objekte spieler3 der Klasse Spieler erzeugt wurde
	{
		name3.setText(Spieler.getSpieler3().getName());
	}
	else {
		name3 = new JTextField(30);
		name3.setFont(new Font("Serif", Font.PLAIN, 25));
	}
	name3.setEditable(false);

	s4 = new JCheckBox ();
	s4.addItemListener(spieler4textfeld);
	s4.setBackground(Color.magenta);
	if(Spieler.getListe().contains(Spieler.getSpieler4()))	//Falls bereits ein Objekte spieler4 der Klasse Spieler erzeugt wurde
	{
		name4.setText(Spieler.getSpieler4().getName());
	}
	else {
		name4 = new JTextField(30);
		name4.setFont(new Font("Serif", Font.PLAIN, 25));
	}
	name4.setEditable(false);
	
	// Label fuer Spieler
	spielerlabel1 = new JLabel("Spieler 1");
	spielerlabel1.setFont(new Font("Serif", Font.BOLD, 40));

	spielerlabel2 = new JLabel("Spieler 2");
	spielerlabel2.setFont(new Font("Serif", Font.BOLD, 40));

	spielerlabel3 = new JLabel("Spieler 3");
	spielerlabel3.setFont(new Font("Serif", Font.BOLD, 40));

	spielerlabel4 = new JLabel("Spieler 4");
	spielerlabel4.setFont(new Font("Serif", Font.BOLD, 40));

	// Panel fuer Spieler1
	spieler1 = new JPanel(new FlowLayout(0));
	spieler1.add (s1);
	spieler1.add(spielerlabel1);
	spieler1.add(name1);
	spieler1.setBackground(Color.yellow);

	// Panel fuer Spieler2
	spieler2 = new JPanel(new FlowLayout(0));
	spieler2.add (s2);
	spieler2.add(spielerlabel2);
	spieler2.add(name2);
	spieler2.setBackground(Color.orange);

	// Panel fuer Spieler3
	spieler3 = new JPanel(new FlowLayout(0));
	spieler3.add (s3);
	spieler3.add(spielerlabel3);
	spieler3.add(name3);
	spieler3.setBackground(Color.pink);

	// Panel fuer Spieler 4
	spieler4 = new JPanel(new FlowLayout(0));
	spieler4.add (s4);
	spieler4.add(spielerlabel4);
	spieler4.add(name4);
	spieler4.setBackground(Color.magenta);

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

    schiggi = new ImageIcon(new ImageIcon(path+"001-squirtle.png").getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT));
    glumander = new ImageIcon(new ImageIcon(path+"002-bullbasaur.png").getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT));
    relaxo = new ImageIcon(new ImageIcon(path+"004-snorlax.png").getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT));
    pikachu = new ImageIcon(new ImageIcon(path+"005-pikachu.png").getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT));
    mauzi = new ImageIcon(new ImageIcon(path+"006-avatar.png").getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT));
    monkey = new ImageIcon(new ImageIcon(path+"007-mankey.png").getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT));
    venomat = new ImageIcon(new ImageIcon(path+"008-venomat.png").getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT));
    ratzfratz = new ImageIcon(new ImageIcon(path+"009-rattata.png").getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT));
    pidget = new ImageIcon(new ImageIcon(path+"010-pidgey.png").getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT));
    mew = new ImageIcon(new ImageIcon(path+"011-sqirtle.png").getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT));
    evoli = new ImageIcon(new ImageIcon(path+"012-eevee.png").getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT));
    puff = new ImageIcon(new ImageIcon(path+"013-jigglypuff.png").getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT));


	ImageIcon[] sammlung = { schiggi, glumander, relaxo, pikachu, puff, evoli, pidget, venomat, monkey,
			mew, ratzfratz, mauzi };
	
	// Dropdown Menues
	dropdowns1 = new JComboBox<Object>(sammlung);
	dropdowns1.setSelectedIndex(1);
	dropdowns2 = new JComboBox<Object>(sammlung);
	dropdowns2.setSelectedIndex(2);
	dropdowns3 = new JComboBox<Object>(sammlung);
	dropdowns3.setSelectedIndex(3);
	dropdowns4 = new JComboBox<Object>(sammlung);
	dropdowns4.setSelectedIndex(4);

	JPanel dropdown = new JPanel(new GridLayout(4, 1));
	dropdown.add(dropdowns1);
	dropdown.add(dropdowns2);
	dropdown.add(dropdowns3);
	dropdown.add(dropdowns4);

	// Buttons fuer Start/Reset
	reset = new JButton("Reset");
	reset.setBackground(Color.RED);
	reset.setFont(new Font("MS Gothic", Font.BOLD, 20));
	reset.addActionListener(resettip);

	start = new JButton("Spiel starten!");
	start.addActionListener(buttonListenerStart );
	start.setBackground(Color.GREEN);
	start.setFont(new Font("MS Gothic", Font.BOLD, 20));
	
	// Panel fuer Buttons fuer Start/Reset
	buttons = new JPanel(new GridLayout(1, 2));
	buttons.add(reset);
	buttons.add(start);

	// Anordnung im Hauptmenue
	setJMenuBar(m);
	add(schwierigkeit, BorderLayout.WEST);
	add(spieler, BorderLayout.CENTER);
	add(dropdown, BorderLayout.EAST);
	add(buttons, BorderLayout.SOUTH);

	// Weitere Einstellungen fuer das Hauptmenue
	setVisible(true);
	setBounds(400, 50, 1100, 750);
	setResizable(true);	

	}
	

public static void main(String[] args){
	
	Hauptmenue hm = new Hauptmenue ();
	hm.setVisible(true);
}
}