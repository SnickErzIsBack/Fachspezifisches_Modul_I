package ComCave;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Window extends JFrame{

	// 1. Deklaration Formular-Elemente
	JTextField textFeld;
	JLabel läbel;
	JButton button;
	
	public Window()
	{
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(250, 200);
		this.setTitle("GUI");
		this.setLayout(null);
		
		// 2. Formular-Elemente initialisieren
		läbel = new JLabel("number entered times 365");
		textFeld = new JTextField();
		button = new JButton("Klick");
		
		// 3. Formular-Elemente dem Fenster/Window hinzufügen
		this.add(läbel);
		this.add(textFeld);
		this.add(button);
		
		// 4. Formular-Elemente positionieren und Größeangaben
		läbel.setBounds(20, 70, 150, 25);
		textFeld.setBounds(20, 40, 150, 25);
		button.setBounds(20, 100, 150, 25);
		
		button.addActionListener(new Klick(this));
		
		this.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		 new Window();
	}

}
