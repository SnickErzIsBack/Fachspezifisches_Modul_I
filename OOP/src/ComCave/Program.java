package ComCave;

import java.util.ArrayList;

public class Program {

	public static void main(String[] args)
	{
		// Kundenverwaltung, anlegen, anzeigen, bearbeiten, suchen, löschen .... von Kunden
		// Daten: Name, Alter, geschlecht, telefon
		// Klasse Kunde
		
		// Konstruktoren, Interfaces/Schnittstellen, Vererbung, Polymorphie
		
		Kunde kunde1 = new Kunde();
		kunde1.setName("Mustermann");
		System.out.println( kunde1.getName() );
		
		Kunde kunde2 = new Kunde();
		kunde2.setName("Musterfrau");
		kunde2.setName("Muster");
		System.out.println( kunde2.getName() );
		
		Kunde kunde3 = new Kunde("Müller", "m", "03012345", 30, 0);
		System.out.println(kunde3.getName());
		
		Kunde kunde4 = new Kunde("Meier");
		System.out.println(kunde4.getName());
		System.out.println(kunde4.getGuthaben());
		
		//----------------------------------------------------------
		// Vererbung
		Angestellte m1 = new Angestellte();
		m1.setName("MusterMitarbeiter");
		m1.setNr(1);
		m1.setGehalt(2000);
		
		Arbeiter m2 = new Arbeiter();
		m2.setName("Schulze");
		m2.setNr(2);
		m2.setArbeitsStunden(200);
		m2.setStundenLohn(20);
		
		m1.macheUrlaub();
		
		Mitarbeiter m3 = new Angestellte();
		Mitarbeiter m4 = new Arbeiter();
		m3.setName("Meier");
		((Angestellte)m3).setGehalt(3000);
		
		if(m3 instanceof Angestellte)
			System.out.println("ist ein Angestellte");
		
		ArrayList<Mitarbeiter> mitarbeiterListe = new ArrayList<Mitarbeiter>();
		mitarbeiterListe.add(m1);
		mitarbeiterListe.add(m2);
		mitarbeiterListe.add(m3);
		mitarbeiterListe.add(m4);
		
		mitarbeiterListe.add( new Angestellte() );
		Angestellte m5 = (Angestellte)mitarbeiterListe.get(0);
		System.out.println( m5.getGehalt() );
		
		// Mitarbeiterliste mit For-Schleife durchlaufen
		for(Mitarbeiter mitarbeiter : mitarbeiterListe)
		{
			System.out.println(mitarbeiter.getName());
			
			if(mitarbeiter instanceof Angestellte) {
				System.out.println( ((Angestellte)mitarbeiter).getGehalt() );
			}else if(mitarbeiter instanceof Arbeiter){
				System.out.println( ((Arbeiter)mitarbeiter).getStundenLohn() );
			}	
		}
	}
}