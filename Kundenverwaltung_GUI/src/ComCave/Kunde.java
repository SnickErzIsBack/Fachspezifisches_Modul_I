package ComCave;

import java.io.Serializable;
import java.util.ArrayList;

public class Kunde implements Serializable
{
	
	public static ArrayList<Kunde> kundenListe;
	
	private String anrede; // getAnrede, setAnrede, 
	private String vorname;
	private String nachname;
	private String anschrift;
	private String plz;
	private String ort;
	private String telefon;
	private boolean neukunde; // isNeukunde(), setNeukunde()
	
	public Kunde()
	{}

	/**
	 * @param anrede
	 * @param vorname
	 * @param nachname
	 * @param anschrift
	 * @param plz
	 * @param ort
	 * @param telefon
	 * @param neukunde
	 */
	public Kunde(String anrede,
				 String vorname, String nachname,
				 String anschrift, String plz, String ort,
				 String telefon, boolean neukunde)
	{
		this.anrede = anrede;
		this.vorname = vorname;
		this.nachname = nachname;
		this.anschrift = anschrift;
		this.plz = plz;
		this.ort = ort;
		this.telefon = telefon;
		this.neukunde = neukunde;
	}

	public static ArrayList<Kunde> getKundenListe()
	{
		return kundenListe;
	}

	public static void setKundenListe(ArrayList<Kunde> kundenListe)
	{
		Kunde.kundenListe = kundenListe;
	}

	public String getAnrede()
	{
		return anrede;
	}

	public void setAnrede(String anrede)
	{
		this.anrede = anrede;
	}

	public String getVorname()
	{
		return vorname;
	}

	public void setVorname(String vorname)
	{
		this.vorname = vorname;
	}

	public String getNachname()
	{
		return nachname;
	}

	public void setNachname(String nachname)
	{
		this.nachname = nachname;
	}

	public String getAnschrift()
	{
		return anschrift;
	}

	public void setAnschrift(String anschrift)
	{
		this.anschrift = anschrift;
	}

	public String getPlz()
	{
		return plz;
	}

	public void setPlz(String plz)
	{
		this.plz = plz;
	}

	public String getOrt()
	{
		return ort;
	}

	public void setOrt(String ort)
	{
		this.ort = ort;
	}

	public String getTelefon()
	{
		return telefon;
	}

	public void setTelefon(String telefon)
	{
		this.telefon = telefon;
	}

	public boolean isNeukunde()
	{
		return neukunde;
	}

	public void setNeukunde(boolean neukunde)
	{
		this.neukunde = neukunde;
	}
	
}