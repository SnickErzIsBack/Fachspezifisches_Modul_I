package ComCave;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		ArrayList<Anbieter> anbieterListe = new ArrayList<Anbieter>();
		
		anbieterListe.add(new Anbieter("Anbieter 1",0.27,59.95));
		anbieterListe.add(new Anbieter("Anbieter 2",0.26,19.95));
		anbieterListe.add(new Anbieter("Anbieter 3",0.30, 0.00));
		anbieterListe.add(new Anbieter("Anbieter 4",0.28,29.00));
		int verbrauch = 0;
		
		for(Anbieter anbieter : anbieterListe)
			{
				System.out.println( anbieter.getPreisProKwh() * 
					verbrauch + anbieter.getGrundGebuehr());
			}	
	}
	
	public static void berechnungArray() {
		int verbrauch;
		double ergebnis;
		double stromPreise[][] = {
			{.27, 59.95},
			{.26, 19.95},
			{.30, 0},
			{.28, 29}
		};
		
		System.out.println("Eingabe Stromverbrauch pro Jahr in kwh:");
		verbrauch = new Scanner(System.in).nextInt();
		
		double guenstigsterStrompreis = 0;
		for (int i = 0; i < stromPreise.length; i++)
			{
				ergebnis = verbrauch * stromPreise[i][0] + stromPreise[i][1];
				if(i == 0){
					guenstigsterStrompreis = ergebnis;
				}else if(guenstigsterStrompreis > ergebnis){
					guenstigsterStrompreis = ergebnis;
				}
				System.out.println("Anbieter " + (i + 1) + ": " + ergebnis);
			}
		System.out.println("Der günstigste Strompreis: " + guenstigsterStrompreis);
	}
}
