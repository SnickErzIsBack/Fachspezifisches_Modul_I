package ComCave;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class DateiManager
{
	
	public static void csvSpeichern(File file)
	{
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(file));
			String text = "";
	
			for(Kunde kunde : Kunde.kundenListe)
				{
					text += kunde.getAnrede() + ",";
					text += kunde.getVorname() + ",";
					text += kunde.getNachname() + ",";
					text += kunde.getAnschrift() + ",";
					text += kunde.getPlz() + ",";
					text += kunde.getOrt() + ",";
					text += kunde.isNeukunde() + "\n";
				}
			bw.write(text);
			bw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static boolean kundenSpeichern()
	{
		try {
			ObjectOutputStream oos = new ObjectOutputStream( new FileOutputStream("kunden.comcave") );
			oos.writeObject(Kunde.kundenListe);
			oos.close();
			return true;
			
		} catch (Exception e2) {
			e2.printStackTrace();
		}
		return false;
	}
	
	public static boolean kundenLaden() {
		try {
			ObjectInputStream ois = new ObjectInputStream( new FileInputStream("kunden.comcave") );
			Kunde.kundenListe = (ArrayList<Kunde>)ois.readObject();
			ois.close();
			return true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
}
