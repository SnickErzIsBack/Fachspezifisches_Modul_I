package ComCave;

import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.UIManager;

public class MainWindow extends JFrame{

	JPanel contentPane;
	
	JMenuBar menuBar;
	JMenu menuArtikel;
	JMenuItem menuItemArtikelNeu;
	JMenuItem menuItemArtikelAnzeigen;
	
	//JMenu menuTest;
	
	public MainWindow() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(800, 600);
		setTitle("Artikelveraltung V1.0");
		setLayout(null);
		
		contentPane = new JPanel();
		setContentPane(contentPane);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		menuArtikel = new JMenu("Artikel");
		menuBar.add(menuArtikel);
		
		menuItemArtikelNeu = new JMenuItem("Neuen Artikel");
		menuItemArtikelAnzeigen = new JMenuItem("Alle Artikel anzeigen");
		
		menuArtikel.add(menuItemArtikelNeu);
		menuArtikel.add(menuItemArtikelAnzeigen);
		
		MenuKlick klick = new MenuKlick(this);
		menuItemArtikelNeu.addActionListener(klick);
		menuItemArtikelAnzeigen.addActionListener(klick);
		
		/*
		menuTest = new JMenu("Test");
		menuArtikel.add(menuTest);
		*/
		//contentPane.setBackground(Color.blue);
		// Bild auf JPanel
		try {
			JLabel lblBackground = new JLabel( new ImageIcon( ImageIO.read( 
					new File(".\\images\\bild.png") )
			));
			contentPane.add(lblBackground);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Style not applied");
		}
		
		setIconImage( new ImageIcon(".\\images\\icon.jpg").getImage() );
		
	}
	
	public static void main(String[] args) {
		
		// Look And Feel
			String lookAndFeel = "com.jtattoo.plaf.graphite.GraphiteLookAndFeel";
			try {
				UIManager.setLookAndFeel(lookAndFeel);
			}catch(Exception e) {
				System.out.println("LookAndFeel-Error");
			}
				
		new MainWindow().setVisible(true);
	}

}
