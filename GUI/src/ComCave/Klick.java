package ComCave;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Klick implements ActionListener
{

	Window w;
	
	public Klick(Window w)
	{
		this.w = w;
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		double eingabe = Double.parseDouble( w.textFeld.getText() );
		double berechnung = eingabe * 365;
		
		w.textFeld.setText(String.valueOf(berechnung));
	}
}
