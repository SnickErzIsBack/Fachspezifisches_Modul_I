package ComCave;

import java.util.ArrayList;

import javax.swing.*;

public class Window extends JFrame{

	// 1. Formularelemente deklarieren
	JLabel lblAnrede;
	JLabel lblVorname;
	JLabel lblNachname;
	JLabel lblAnschrift;
	JLabel lblPlzOrt;
	JLabel lblTelefon;
	JLabel lblNeukunde;
	
	JComboBox cbAnrede;
	JTextField tfVorname;
	JTextField tfNachname;
	JTextField tfAnschrift;
	JTextField tfPlz;
	JTextField tfOrt;
	JTextField tfTelefon;
	JCheckBox cbxNeukunde;
	JButton btnSpeichern;
	
	JButton btnShowKunde;
	JTextArea taKundenAnzeige;
	
	JButton btnCsvExport;
	
	public Window() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(900, 700);
		setLocationRelativeTo(null); // Fenster mittig auf Monitor
		setLayout(null);
		
		// 2. Formularelemente initialisieren
		lblAnrede = new JLabel("Anrede");
		lblVorname = new JLabel("Vorname");
		lblNachname = new JLabel("Nachname");
		lblAnschrift = new JLabel("Anschrift");
		lblPlzOrt = new JLabel("PLZ/Ort");
		lblTelefon = new JLabel("Telefon");
		lblNeukunde = new JLabel("Neukunde");
		
		cbAnrede = new JComboBox();
		tfVorname = new JTextField();
		tfNachname = new JTextField();
		tfAnschrift = new JTextField();
		tfPlz = new JTextField();
		tfOrt = new JTextField();
		tfTelefon = new JTextField();
		cbxNeukunde = new JCheckBox("Ja/Nein");
		
		btnSpeichern = new JButton("Speichern");
		btnShowKunde = new JButton("Kunden anzeigen");
		taKundenAnzeige = new JTextArea();
		btnCsvExport = new JButton("CSV Export");
		
		// 3. Formularelemente dem WIndow hinzuf�gen
		add(lblAnrede);
		add(lblVorname);
		add(lblNachname);
		add(lblAnschrift);
		add(lblPlzOrt);
		add(lblTelefon);
		add(lblNeukunde);
		add(cbAnrede);
		add(tfVorname);
		add(tfNachname);
		add(tfAnschrift);
		add(tfPlz);
		add(tfOrt);
		add(tfTelefon);
		add(cbxNeukunde);
		add(btnSpeichern);
		add(btnShowKunde);
		add(taKundenAnzeige);
		add(btnCsvExport);
		
		// 4. Position und Gr��e Formular-Elemente
		lblAnrede.setBounds(20, 20, 110, 25);
		lblVorname.setBounds(20, 55, 110, 25);
		lblNachname.setBounds(20, 90, 110, 25);
		lblAnschrift.setBounds(20, 125, 110, 25);
		lblPlzOrt.setBounds(20, 160, 110, 25);
		lblTelefon.setBounds(20, 195, 110, 25);
		lblNeukunde.setBounds(20, 230, 110, 25);
		cbAnrede.setBounds(130, 20, 110, 25);
		tfVorname.setBounds(130, 55, 160, 25);
		tfNachname.setBounds(130, 90, 160, 25);
		tfAnschrift.setBounds(130, 125, 180, 25);
		tfPlz.setBounds(130, 160, 60, 25);
		tfOrt.setBounds(200, 160, 160, 25);
		tfTelefon.setBounds(130, 195, 120, 25);
		cbxNeukunde.setBounds(130, 230, 70, 25);
		taKundenAnzeige.setBounds(450, 20, 400, 600);
		btnShowKunde.setBounds(250, 265, 140, 25);
		btnSpeichern.setBounds(130, 265, 100, 25);
		btnCsvExport.setBounds(130, 300, 100, 25);
		
		// JComboBox f�llen
		cbAnrede.addItem("Herr");
		cbAnrede.addItem("Frau");
		cbAnrede.addItem("Divers");
		
		
		ButtonKlick klick = new ButtonKlick( this );
		btnSpeichern.addActionListener( klick );
		btnShowKunde.addActionListener( klick );
		btnCsvExport.addActionListener( klick );
				
		if(DateiManager.kundenLaden())
		{
			//unklar, was passiern soll => ws. besser mittels try/catch-konstruktion
		}else {
			JOptionPane.showMessageDialog(this, "Kundendaten konnten nicht geladen werden!");
			Kunde.kundenListe = new ArrayList<Kunde>();
		}
	}
	
	public static void main(String[] args)
	{
		new Window().setVisible(true);
	}
}
