package ComCave;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Arrays;

public class Program {

	public static void main(String[] args) {
		textDateiSchreiben();
		//textDateiLesen();
		//binaerDateiSchreiben();
		//binaerDateiLesen();
		//objekteSchreiben();
		//objekteLesen();
		//csvSchreiben();
		//csvLesen();
		//fileKlasse();
	}
	
	private static void fileKlasse() {
		File file = new File("verzeichnis\\java\\dateiname.txt");
		File dir = new File("verzeichnis\\java");
		
		try {
			if(dir.mkdirs()) {
				file.createNewFile();
			}
		} catch (Exception e) {
			System.out.println("Exception");
		}
		
		System.out.println("existiert?: " + file.exists());
		System.out.println("ist eine Datei? " + file.isFile() );
		System.out.println("ist ein Verzeichnis? " + dir.isDirectory());
		
		// aktuelles Verzeichnis ermitteln
		File datei = new File("virtual.txt");
		System.out.println( datei.getAbsolutePath() );
		File datei2 = new File(datei.getAbsolutePath());
		System.out.println( datei2.getParent());
		
		//System.out.println( new File(new File("name").getAbsolutePath()).getParent() );
	}
	
	private static void csvLesen() {
		try {
			BufferedReader br = new BufferedReader(new FileReader("kunden.csv"));
			String zeile = "";
			while( (zeile = br.readLine()) != null ) {
				String[] kunden = zeile.split(",");
				for(String daten : kunden) {
					System.out.println(daten);
				}
				System.out.println("");
				//System.out.println(Arrays.toString(kunden));
			}
			br.close();
		} catch (Exception e) {
			System.out.println("Fehler beim CSV lesen");
		}
	}
	
	private static void csvSchreiben() {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("kunden.csv"));
			bw.write("Max,Mustermann,012345678\n");
			bw.write("Maxi,Musterfrau,98523654\n");
			bw.close();
		} catch (Exception e) {
			System.out.println("Fehler beim CSV schreiben");
		}
	}
	
	private static void objekteLesen() {
		ArrayList<Artikel> liste = null;
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("artikel.com"));
			liste = (ArrayList<Artikel>)ois.readObject();
			ois.close();
		} catch (Exception e) {
			System.out.println("Kann Artikel Daten nicht einlesen");
		}
		
		System.out.println( liste.get(0).getBezeichnung() + liste.get(0).getPreis() );
	}
	
	private static void objekteSchreiben() {
		// Serialisierung
		Artikel artikel = new Artikel("IPhone", 1200.95);
		ArrayList<Artikel> artikelListe = new ArrayList<Artikel>();
		artikelListe.add(artikel);
		
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("artikel.com"));
			oos.writeObject(artikelListe);
			oos.close();
		} catch (IOException e) {
			System.out.println("Datei Fehler");
		}
		
	}
	
	private static void binaerDateiLesen() {
		try {
			RandomAccessFile file = new RandomAccessFile("binaerdatei.bin", "r");
			System.out.println( file.readInt() );
			System.out.println( file.readDouble() );
			System.out.println( file.readBoolean() );
			System.out.println( file.readUTF() );
			file.close();
		} catch (IOException e) {
			System.out.println("Kann Datei nicht lesen");
		}
	}
	
	private static void binaerDateiSchreiben() {
		int i = 100;
		double d = 99.99;
		boolean b = true;
		String s = "Java";
		
		try {
			RandomAccessFile file = new RandomAccessFile("binaerdatei.bin", "rw"); // r-read, rw - write
			file.writeInt(i);
			file.writeDouble(d);
			file.writeBoolean(b);
			file.writeUTF(s);
			file.close();
			System.out.println("Schreibvorgang fertig");
		} catch (IOException e) {
			System.out.println("Datei - Fehler");
		}
	}
	
	private static void textDateiLesen() {
		try {
			BufferedReader br = new BufferedReader(new FileReader("datei.txt"));
			String zeile;
			while( (zeile = br.readLine()) != null ) {
				System.out.println(zeile);
			}
			br.close();
		} catch (IOException e) {
			System.out.println("Datei konnte nicht gelesen werden");
		}
	}
	
	private static void textDateiSchreiben() {
		BufferedWriter bw = null;
		try {
			FileWriter fw = new FileWriter("datei.txt", true); // Datenstrom erzeugen, Datei öffnen
			bw = new BufferedWriter(fw); // stellt Methoden bereit zum Schreiben, Schreibvorgang wenn Schreibpuffer voll
			bw.write("Daten mit Java geschrieben\n");
			bw.newLine();
			bw.write("neue Zeile\n");
			bw.flush(); // schreibvorgang erzwingen
			System.out.println("Daten gespeichert");
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Daten konnten nicht gespeichert werden");
		}finally { // wird immer ausgeführt
			try {
				bw.close(); // Datei schließen
				System.out.println("Datei geschlossen");
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
	}

}
