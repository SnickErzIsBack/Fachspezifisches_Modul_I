package ComCave;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Formatter;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ArtikelAnzeigenWindow extends JFrame{
	
	JPanel contentPane;
	JTable table;
	JScrollPane scrollPane;
	DefaultTableModel model;
	
	public ArtikelAnzeigenWindow()
	{
		setDefaultCloseOperation(DISPOSE_ON_CLOSE); // Dispose on Close, NUR das Sub-Fenster schließen
		setSize(600, 500);
		
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		table = new JTable();
		scrollPane = new JScrollPane(table);
		
		contentPane.add(scrollPane);
		scrollPane.setBounds(0, 0, 580, 460);
		
		// JTable mit Daten füllen
		ArrayList<Artikel> artikelListe = Datenbank.artikelAbrufen();
	
		// 1. Vector für Spalten-Überschriften
		Vector<String> kopf = new Vector<String>();
		kopf.add("Bezeichnung");
		kopf.add("Preis");
		kopf.add("Anzahl");
		kopf.add("Datum");
		kopf.add("Gesamtpreis");
		
		// 2. Vector für Daten
		Vector<Vector<String>> daten = new Vector<Vector<String>>();
		
		for(Artikel artikel : artikelListe)
		{
			Vector<String> zeile = new Vector<String>();
			zeile.add(artikel.getBezeichnung());
			zeile.add(Double.toString( artikel.getPreis() ));
			zeile.add(Integer.toString( artikel.getAnzahl() ));
			if(artikel.getDatum() != null)
				zeile.add( new SimpleDateFormat("dd.MM.yyyy").format(artikel.getDatum()) );
			else
				zeile.add("Artikel verfügbar");
			zeile.add(Double.toString( artikel.getAnzahl() * artikel.getPreis()) );
			daten.add(zeile);
		}
		
		model = new DefaultTableModel(daten, kopf);
		table.setModel(model);
		
	}
	
}
