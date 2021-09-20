package ComCave;

public class Check {
	
	public static boolean datum(String datum)
	{
		boolean regEx = datum.matches("(0[1-9]|[12][0-9]|3[0-1])(\\.|/|-)(0[1-9]|1[0-2])(\\2)(19|20)(\\d\\d)" );
	
		if(regEx)
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
				{
					case 1:	case 3: case 5: case 7: case 8: case 10: case 12:
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
				return true;
		}
		return false;
	}
	
	public static boolean email(String email)
	{
		return email.matches("[a-zA-Z0-9\\.!#$%&'*+-/=?^_`{|}~]{1,64}@([a-zA-Z0-9\\.!#$-]{1,63}\\.){1,3}[a-zA-Z][a-zA-Z0-9-]{0,61}[a-zA-Z]");
	}
	
	public static boolean web(String web)
	{
		return web.matches("(https?://)?(w{3}\\.)?([a-zA-Z0-9\\.!#$-]{1,63}\\.){1,3}[a-zA-Z][a-zA-Z0-9-]{0,61}[a-zA-Z]");
	}
	
}
