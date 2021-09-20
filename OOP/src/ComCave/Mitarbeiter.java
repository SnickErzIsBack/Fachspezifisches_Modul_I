package ComCave;

public class Mitarbeiter
{
	protected String name;
	private int nr;
	
	public void macheUrlaub()
	{
		System.out.println("Mitarbeiter " + this.name + " ist im Urlaub");
	}
	
	public Mitarbeiter()
	{}
	
	public Mitarbeiter(String name, int nr)
	{
		this.name = name;
		this.nr = nr;
	}

	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public int getNr()
	{
		return nr;
	}
	
	public void setNr(int nr)
	{
		this.nr = nr;
	}
}

class Angestellte extends Mitarbeiter
{
	private double gehalt;
	
	public Angestellte()
	{}
	
	public Angestellte(double gehalt)
	{
		this.gehalt = gehalt;
	}

	public void macheUrlaub()
	{
		System.out.println("Angestellte/r " + this.name + " ist im Urlaub");
	}

	public double getGehalt()
	{
		return gehalt;
	}

	public void setGehalt(double gehalt)
	{
		this.gehalt = gehalt;
	}
}

class Arbeiter extends Mitarbeiter
{
	private double stundenLohn;
	private int arbeitsStunden;
	
	public Arbeiter()
	{}
	
	public Arbeiter(double stundenLohn, int arbeitsStunden)
	{
		this.stundenLohn = stundenLohn;
		this.arbeitsStunden = arbeitsStunden;
	}
	
	public void macheUrlaub()
	{
		System.out.println("Arbeiter " + this.name + " ist im Urlaub");
	}
	
	public double getStundenLohn()
	{
		return stundenLohn;
	}
	
	public void setStundenLohn(double stundenLohn)
	{
		this.stundenLohn = stundenLohn;
	}
	
	public int getArbeitsStunden()
	{
		return arbeitsStunden;
	}
	
	public void setArbeitsStunden(int arbeitsStunden)
	{
		this.arbeitsStunden = arbeitsStunden;
	}

}

