package memory;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;


public class Anleitung extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel text;
	private JPanel layout;
	
	public Anleitung (){
		
		super  ("Anleitung");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		text = new JLabel ("Test Test Test");
		layout = new JPanel ();
		layout.add(text);
	
		add(layout);
		setVisible(true);
		setBounds(400, 50, 1100, 750);
		setResizable(true);	

	}

	public static void main(String[] args) {

		new Anleitung ();
	
	}

}
