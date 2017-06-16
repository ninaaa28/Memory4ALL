package memory;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class Impressum extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel textimpress;
	private JPanel layoutimpress;
	
	public Impressum (){
		
		super  ("Impressum");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		textimpress = new JLabel ("Test Test Test");
		layoutimpress = new JPanel ();
		layoutimpress.add(textimpress);
	
		add(layoutimpress);
		setVisible(true);
		setBounds(400, 50, 1100, 750);
		setResizable(true);	

	}

	public static void main(String[] args) {

		new Impressum ();
	
	}

}
