package ComCave;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Program {

	public static void main(String[] args) {
		// eindimensionales Array
		String[] wochentage = new String[3];
		wochentage[0] = "Montag";
		wochentage[1] = "Dienstag";
		wochentage[2] = "Sonntag";
				
		for(int i = 0; i < wochentage.length; i++) {
			System.out.println( wochentage[i] );
		}
		
		int[] zahlen = {64, 12, 56, 83, 94, 11};
		System.out.println(zahlen[0]);
		System.out.println(zahlen.length);
		
		//----------------------------------------------------
		// mehrdimensionale Arrays
		// 0 - PLZ
		// 1 - ORT
		String[][] plzOrt = new String[3][2];
		plzOrt[0][0] = "11111";
		plzOrt[0][1] = "Berlin";
		
		plzOrt[1][0] = "22222";
		plzOrt[1][1] = "München";
		
		String[] datensatz1 = new String[2];
		datensatz1[0] = "55555";
		datensatz1[1] = "Magdeburg";
		
		plzOrt[2] = datensatz1;
		
		System.out.println(plzOrt[2][1]);
		
		String[][] x = {
				{"11111", "Berlin"}, 
				{"22222", "München"}
		};
		
		
		int alter = 100;
		String name = "Muster";
		Object test = alter;
		test = name;
		test = wochentage;
		Object[] testarray = new Object[2];
		testarray[0] = alter;
		testarray[1] = name;
		
		// ArrayList
		ArrayList<String> einkaufsListe = new ArrayList<String>();
		einkaufsListe.add("Zucker");
		einkaufsListe.add("Milch");
		einkaufsListe.add("Brot");
		
		//einkaufsListe.remove("Zucker");
		System.out.println("Größe ArrayList: " + einkaufsListe.size() );
		einkaufsListe.set(0, "Cola");
		System.out.println(einkaufsListe.get(0));
		System.out.println("ArrayList sortiert");
		Collections.sort(einkaufsListe);
		Collections.shuffle(einkaufsListe);
		
		
		Arrays.sort(wochentage);
		for(String daten : wochentage)
			System.out.println(daten);
		/*
		for(int i = 0; i < einkaufsListe.size(); i++)
			System.out.println(einkaufsListe.get(i));
		
		// foreach - Schleife / erweitertes for, ArrayList
		for(String daten : einkaufsListe) 
			System.out.println(daten);
		
		
		// foreach für Array wochentage
		for(String daten : wochentage)
			System.out.println(daten);
		
		// for 2dim Array
		for(int i = 0; i < plzOrt.length; i++)
			System.out.println(plzOrt[i][0] + " - " + plzOrt[i][1]);
		
		for(int i = 0; i < plzOrt.length; i++) {
			for(int j = 0; j < plzOrt[i].length; j++) {
				System.out.print( plzOrt[i][j] + "\t");
			}
			System.out.println();
		}
		
		// foreach 2dim Array
		for(String[] daten : plzOrt) 
			System.out.println(daten[0] + " - " + daten[1]);
		
		
		for(String[] daten : plzOrt) 
			for(String value : daten) 
				System.out.println(value);
			
		*/	
	}
}
