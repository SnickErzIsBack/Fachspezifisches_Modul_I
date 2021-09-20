package ComCave;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class ButtonKlick implements ActionListener
{

	Window w;
	
	public ButtonKlick(Window w)
	{
		this.w = w;
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		boolean pruefung = true;
		
		if( Check.datum( w.tfGebDatum.getText() ))
		{
			System.out.println("Datum ist korrekt");
		}else {
			pruefung = false;
			System.out.println("Datum ist fehlerhaft");
		}
		
		if(Check.email( w.tfEmail.getText() ))
		{
			System.out.println("Email ist korrekt");
		}else {
			pruefung = false;
			System.out.println("Email ist fehlerhaft");
		}
		
		if(w.tfWeb.getText().isEmpty() || Check.web( w.tfWeb.getText() ))
		{
			System.out.println("Webadresse ist korrekt");
		}else {
			pruefung = false;
			System.out.println("Webadresse ist fehlerhaft");
		}
		
		
		
		if(pruefung)
		{
			JOptionPane.showMessageDialog(w, "Daten Okay");
		}else {
			JOptionPane.showMessageDialog(w, "Daten fehlerhaft. Wird nicht gespeichert");
		}
	}
}
