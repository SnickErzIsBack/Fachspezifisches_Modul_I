package ComCave;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuKlick implements ActionListener{

	MainWindow w;
	
	public MenuKlick(MainWindow w)
	{
		this.w = w;
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource().equals(w.menuItemArtikelNeu)){
			new ArtikelNeuWindow().setVisible(true);
		}else if(e.getSource().equals(w.menuItemArtikelAnzeigen)){
			new ArtikelAnzeigenWindow().setVisible(true);
		}
	}
}
