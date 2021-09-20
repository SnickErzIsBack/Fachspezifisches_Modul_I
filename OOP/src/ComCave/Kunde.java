package ComCave;

public class Kunde
{

	// Daten: Name, Alter, geschlecht, telefon
	private String name;
	private String geschlecht;
	private String telefon;
	private int alter;
	private double guthaben;
	
	public Kunde()
	{
		System.out.println("Konstruktor");
		this.guthaben = 50;
	}
	
	public Kunde(String name)
	{
		this();
		this.name = name;
	}
	
	/**
	 * @param name
	 * @param geschlecht
	 * @param telefon
	 * @param alter
	 * @param guthaben
	 */
	public Kunde(String name, String geschlecht, String telefon, int alter, double guthaben)
	{
		this.name = name;
		this.geschlecht = geschlecht;
		this.telefon = telefon;
		this.alter = alter;
		this.guthaben = guthaben;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getGeschlecht()
	{
		return geschlecht;
	}

	public void setGeschlecht(String geschlecht)
	{
		this.geschlecht = geschlecht;
	}

	public String getTelefon()
	{
		return telefon;
	}

	public void setTelefon(String telefon)
	{
		this.telefon = telefon;
	}

	public int getAlter()
	{
		return alter;
	}

	public void setAlter(int alter)
	{
		this.alter = alter;
	}

	public double getGuthaben()
	{
		return guthaben;
	}

	public void setGuthaben(double guthaben)
	{
		this.guthaben = guthaben;
	}

}
