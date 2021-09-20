package ComCave;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Program
{

	public static void main(String[] args)
	{
		// Reguläre Ausdrücke - Regular Expressions - RegEx
		// Zum Durchsuchen von Zeichenketten/Strings auf ein bestimmtes Suchmuster
		
		/*
			. irgendein beliebiges Zeichen
			[abc!0123] Liste von Zeichen, 1 Zeichen aus der Liste
			[0-9] \\d alle Ziffern \\D keine Ziffern
			\\w alle alphanumerische Zeichen inkl. _
			\\p{Alpha} alphan
			\\p{Punct} alle Satzzeichen
			\\s alle White-Space Zeichen, Leerzeichen/Tab/Zeilenumbrüche
			
			[^abc] kein Zeichen aus der Liste
			| oder
			() Zeichen-Gruppe
			(\\1) Referenz auf vorhergehende Gruppe / 1. Gruppe hat Ziffer 1
			
			Quantifizierer:
			* beliebig oft, 0 mal bis unendlich
			+ mindestens 1 Vorkommen bis beliebig oft
			? 0 oder 1 Vorkommen
			{n} genau n-mal 
			{n,} mindestens n-mal
			{n,m} mindestens n-mal und maximal m-mal
			
		*/
		
		String text = "Java ist easy. Ich lerne zum 1., mal Java Programmierung.";
		//System.out.println( text.matches("Java[a-zA-Z 0-9.,]*Programmierung\\.") );
		//System.out.println( text.matches(".?Java.*") );
		String plz = "D-012345";
		//System.out.println( plz.matches("(D-)|(CH-)|(A-)?[0-9]{5}") );
		String telefon = "+491236554";
		//System.out.println( Pattern.matches("((\\+)|(00))[0-9]{4,15}", telefon) );
		String datum = "29.02.2020";
		//System.out.println( datum.matches("(0[1-9]|[12][0-9]|3[0-1])(\\.)(0[1-9]|1[0-2])(\\.)(19|20)(\\d\\d)") );
		System.out.println( datum.matches("(0[1-9]|[12][0-9]|3[0-1])(\\.|/|-)(0[1-9]|1[0-2])(\\2)(19|20)(\\d\\d)" ));
		/*
		System.out.println( datum.matches(
				"((0?[1-9])|([1-2][0-9])|(3[0-1]))" + "((\\.)|(-)|(/))" + // Tag
				"((0?[1-9])|(1[0-2]))" + "((\\.)|(-)|(/))" + // Monat
				"(((19)?[0-9][0-9])|((20)?[0-9][0-9]))")); // Jahr
		*/
		
		if(checkDatum(datum))
		{
			String[] d = datum.split("\\.|/|-");
			int tag = Integer.parseInt( d[0] );
			int monat = Integer.parseInt( d[1] );
			int jahr = Integer.parseInt( d[2] );
			
			int maxTag = 30;
			if(monat != 2)
			{
				// Prüfen ob 30 oder 31 Tage
				switch(monat)
				{	case 1:	case 3: case 5: case 7: case 8: case 10: case 12:
						maxTag = 31;
						break;
				}
			}else {
				// Schaltjahr
				// (Jahr durch 4 teilbar UND NICHT durch 100 teilbar) ODER durch 400 teilbar
				if( (jahr % 4 == 0) && (jahr % 100 != 0) || (jahr % 400 == 0))
					maxTag = 29;
				else
					maxTag = 28;
			}
			
			if(tag <= maxTag)
				System.out.println("Datum ist korrekt");
			else
				System.out.println("Datum fehlerhaft");
			
			
			// RegEx für Email
			
			String email = "max@mustermann.com";
			String url ="http://www.google.de";
			
			System.out.println("email: " +  Pattern.matches("([a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])", email) );
			
			System.out.println( email.matches(
					"[a-zA-Z0-9\\.!#$%&'*+-/=?^_`{|}~]{1,64}" + "@" // local-part
					+ "([a-zA-Z0-9\\.!#$-]{1,63}\\.){1,3}"			// Sublevel Domain
					+ "[a-zA-Z][a-zA-Z0-9-]{0,61}[a-zA-Z]"));		// Toplevel Domain
			
			System.out.println("url: " + url.matches(
					"(https?://)?(w{3}\\.)?" + 		// Protokoll + Hostname
					"([a-zA-Z0-9\\.!#$-]{1,63}\\.){1,3}" + 			// Sublevel Domain
					"[a-zA-Z][a-zA-Z0-9-]{0,61}[a-zA-Z]"));			// Toplevel Domain
			
			//System.out.println(url.matches("(https://)?(www\\.)?" + "([a-z0-9]([a-z0-9\\.!#$-]){0,62})"));
		
			// Vorkommen einer Zeichenfolge/Sequenz im Text suchen
			String zeichenkette = "Java Programmierung. java ist einfach. Javascript ist nicht Java.";
			Pattern p = Pattern.compile("Java[a-z]*", Pattern.CASE_INSENSITIVE);
			Matcher m = p.matcher(zeichenkette);
			while(m.find())
			{
				System.out.println(m.group() + " Start-Index: " + m.start() + " End-Index: " + m.end());
			}
			
		}
	}

	public static boolean checkDatum(String datum)
	{
		return datum.matches("(0[1-9]|[12][0-9]|3[0-1])(\\.|/|-)(0[1-9]|1[0-2])(\\2)(19|20)(\\d\\d)" );
	}
}
