package ComCave;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ArtikelNeuWindow extends JFrame{
	
	JLabel lblBezeichnung;
	JLabel lblPreis;
	JLabel lblAnzahl;
	
	JTextField tfBezeichnung;
	JTextField tfPreis;
	JTextField tfAnzahl;
	
	JButton btnSpeichern;
	
	JPanel contentPane;
	JTextField tfDatum;
	
	public ArtikelNeuWindow()
	{
		setDefaultCloseOperation(DISPOSE_ON_CLOSE); // Dispose on Close, NUR das Sub-Fenster schlieﬂen
		setSize(600, 500);
		
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblBezeichnung = new JLabel("Bezeichnung");
		lblPreis = new JLabel("Preis");
		lblAnzahl = new JLabel("Anzahl");
		tfBezeichnung = new JTextField();
		tfPreis = new JTextField();
		tfAnzahl = new JTextField();
		btnSpeichern = new JButton("speichern");
		
		contentPane.add(lblBezeichnung);
		contentPane.add(lblPreis);
		contentPane.add(lblAnzahl);
		contentPane.add(tfBezeichnung);
		contentPane.add(tfPreis);
		contentPane.add(tfAnzahl);
		contentPane.add(btnSpeichern);
		
		lblBezeichnung.setBounds(20, 20, 100, 25);
		lblPreis.setBounds(20, 55, 100, 25);
		lblAnzahl.setBounds(20, 90, 100, 25);
		tfBezeichnung.setBounds(142, 20, 150, 25);
		tfPreis.setBounds(142, 55, 100, 25);
		tfAnzahl.setBounds(142, 89, 100, 25);
		btnSpeichern.setBounds(142, 160, 100, 25);
		
		Font font = new Font("Calibri", Font.BOLD, 16);
		
		lblBezeichnung.setFont(font);
		lblPreis.setFont(font);
		lblAnzahl.setFont(font);
		tfBezeichnung.setFont(font);
		tfPreis.setFont(font);
		tfAnzahl.setFont(font);
		btnSpeichern.setFont(font);
		
		Color color = new Color(0, 0, 255);
		lblBezeichnung.setForeground(color);
		lblPreis.setForeground(color);
		lblAnzahl.setForeground(color);
		
		JLabel lblDatum = new JLabel("Datum");
		lblDatum.setForeground(Color.BLUE);
		lblDatum.setFont(new Font("Calibri", Font.BOLD, 16));
		lblDatum.setBounds(20, 125, 100, 25);
		contentPane.add(lblDatum);
		
		tfDatum = new JTextField();
		tfDatum.setFont(new Font("Calibri", Font.BOLD, 16));
		tfDatum.setBounds(142, 124, 156, 25);
		contentPane.add(tfDatum);
		tfDatum.setColumns(10);
		
		btnSpeichern.addActionListener( new ButtonKlick(this) );
	}
}
