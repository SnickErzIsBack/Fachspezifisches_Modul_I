package ComCave;

public class Anbieter {
	private String name;
	private double preisProKwh;
	private double grundGebuehr;
	
	public Anbieter()
		{}

	/**
	 * @param name
	 * @param preisProKwh
	 * @param grundGebuehr
	 */
	public Anbieter(String name, double preisProKwh, double grundGebuehr)
		{
			this.name = name;
			this.preisProKwh = preisProKwh;
			this.grundGebuehr = grundGebuehr;
		}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public double getPreisProKwh()
	{
		return preisProKwh;
	}

	public void setPreisProKwh(double preisProKwh)
	{
		this.preisProKwh = preisProKwh;
	}

	public double getGrundGebuehr()
	{
		return grundGebuehr;
	}

	public void setGrundGebuehr(double grundGebuehr)
	{
		this.grundGebuehr = grundGebuehr;
	}
	
	

	
}