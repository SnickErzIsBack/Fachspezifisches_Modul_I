package ComCave;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;


public class ButtonKlick implements ActionListener{
	// 1. Datenbank-Server, Connector/Klassenbibliothek einbinden
			// Projekt Rechtsklick -> Build Path -> Configure Build Path -> Libraries -> Add external Jars
	// 2. Verbindung aufbauen
	// 3. Statement einfügen, SQL Statements/Befehle an den DB-Server senden 
	// 4. Verbindung schließen
	ArtikelNeuWindow w;
	
	public ButtonKlick(ArtikelNeuWindow w)
		{
			this.w = w;
		}
	
	@Override
	public void actionPerformed(ActionEvent e)
		{
			String bez = w.tfBezeichnung.getText();
			double preis = Double.parseDouble( w.tfPreis.getText() );
			int anz = Integer.parseInt( w.tfAnzahl.getText() );
			
			String[] d = w.tfDatum.getText().split("\\.");
			
			Date datum = new Date(
					Integer.parseInt( d[2] ) - 1900, 
					Integer.parseInt( d[1] ) - 1, 
					Integer.parseInt( d[0] )
			); // tag.monat.jahr / tt.mm.jjjj / 20.09.2021
			
			Artikel artikel = new Artikel(bez, preis, anz, datum);
			Datenbank.artikelSpeichern(artikel);
			System.out.println("Saving successful!");
			
			//Datenbank.artikelSpeichern( new Artikel(w.tfBezeichnung.getText(), Double.parseDouble( w.tfPreis.getText() ), Integer.parseInt( w.tfAnzahl.getText() )) );
	}
	
}
