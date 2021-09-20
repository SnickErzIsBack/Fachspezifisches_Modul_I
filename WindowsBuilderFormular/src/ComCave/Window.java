package ComCave;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.border.EmptyBorder;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Window extends JFrame{

	JPanel contentPane;
	JTextField tfVorname;
	JComboBox cbAnrede;
	JButton btnSpeichern;
	JLabel lblNewLabel_2;
	JTextField tfNachname;
	JLabel lblNewLabel_3;
	JTextField tfStrasse;
	JLabel lblNewLabel_4;
	JTextField tfPlz;
	JTextField tfOrt;
	JLabel lblNewLabel_5;
	JTextField tfTelefon;
	JLabel lblNewLabel_6;
	JTextField tfEmail;
	JLabel lblNewLabel_7;
	JTextField tfWeb;
	JLabel lblGebDatum;
	JTextField tfGebDatum;
	JLabel lblNewLabel_8;
	JTextField tfIban;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		Window frame = new Window();
		frame.setVisible(true);
	}

	/**
	 * Create the frame.
	 */
	
	public Window()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 769, 546);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Anrede");
		lblNewLabel.setBounds(10, 44, 77, 14);
		contentPane.add(lblNewLabel);
		
		cbAnrede = new JComboBox();
		cbAnrede.setModel(new DefaultComboBoxModel(new String[] {"Herr", "Frau", "Divers"}));
		cbAnrede.setSelectedIndex(0);
		cbAnrede.setBounds(112, 44, 137, 22);
		contentPane.add(cbAnrede);
		
		JLabel lblNewLabel_1 = new JLabel("Vorname");
		lblNewLabel_1.setBounds(10, 82, 77, 14);
		contentPane.add(lblNewLabel_1);
		
		tfVorname = new JTextField();
		tfVorname.setBounds(112, 83, 137, 20);
		contentPane.add(tfVorname);
		tfVorname.setColumns(10);
		
		btnSpeichern = new JButton("SPEICHERN");
		btnSpeichern.setBounds(109, 441, 107, 23);
		contentPane.add(btnSpeichern);
		
		lblNewLabel_2 = new JLabel("Nachname");
		lblNewLabel_2.setBounds(10, 123, 77, 14);
		contentPane.add(lblNewLabel_2);
		
		tfNachname = new JTextField();
		tfNachname.setColumns(10);
		tfNachname.setBounds(112, 124, 137, 20);
		contentPane.add(tfNachname);
		
		lblNewLabel_3 = new JLabel("Strasse/Hausnr");
		lblNewLabel_3.setBounds(10, 158, 89, 14);
		contentPane.add(lblNewLabel_3);
		
		tfStrasse = new JTextField();
		tfStrasse.setBounds(112, 159, 252, 20);
		contentPane.add(tfStrasse);
		tfStrasse.setColumns(10);
		
		lblNewLabel_4 = new JLabel("PLZ/Ort");
		lblNewLabel_4.setBounds(10, 193, 61, 14);
		contentPane.add(lblNewLabel_4);
		
		tfPlz = new JTextField();
		tfPlz.setBounds(112, 194, 61, 20);
		contentPane.add(tfPlz);
		tfPlz.setColumns(10);
		
		tfOrt = new JTextField();
		tfOrt.setBounds(183, 194, 275, 20);
		contentPane.add(tfOrt);
		tfOrt.setColumns(10);
		
		lblNewLabel_5 = new JLabel("Telefon");
		lblNewLabel_5.setBounds(10, 228, 77, 14);
		contentPane.add(lblNewLabel_5);
		
		tfTelefon = new JTextField();
		tfTelefon.setBounds(112, 229, 213, 20);
		contentPane.add(tfTelefon);
		tfTelefon.setColumns(10);
		
		lblNewLabel_6 = new JLabel("Email");
		lblNewLabel_6.setBounds(10, 263, 46, 14);
		contentPane.add(lblNewLabel_6);
		
		tfEmail = new JTextField();
		tfEmail.setBounds(112, 264, 257, 20);
		contentPane.add(tfEmail);
		tfEmail.setColumns(10);
		
		lblNewLabel_7 = new JLabel("Web");
		lblNewLabel_7.setBounds(10, 297, 46, 14);
		contentPane.add(lblNewLabel_7);
		
		tfWeb = new JTextField();
		tfWeb.setBounds(112, 298, 346, 20);
		contentPane.add(tfWeb);
		tfWeb.setColumns(10);
		
		lblGebDatum = new JLabel("Geburtsdatum");
		lblGebDatum.setBounds(10, 334, 89, 14);
		contentPane.add(lblGebDatum);
		
		tfGebDatum = new JTextField();
		tfGebDatum.setBounds(112, 335, 104, 20);
		contentPane.add(tfGebDatum);
		tfGebDatum.setColumns(10);
		
		lblNewLabel_8 = new JLabel("IBAN");
		lblNewLabel_8.setBounds(10, 366, 77, 14);
		contentPane.add(lblNewLabel_8);
		
		tfIban = new JTextField();
		tfIban.setBounds(112, 366, 252, 20);
		contentPane.add(tfIban);
		tfIban.setColumns(10);
		
		
		btnSpeichern.addActionListener( new ButtonKlick(this) );
		
	}
}
