package ComCave;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class Datenbank {
	
	public static void artikelSpeichern(Artikel artikel)
	{
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		
		try {
			String conString = "jdbc:mysql://localhost/javadb";
			String user = "muster";
			String password = "muster";
			
			Connection con = DriverManager.getConnection(conString, user, password);
			Statement stat = con.createStatement();
			
			String sqlString = "INSERT INTO artikel (bezeichnung, preis, anzahl, datum) VALUES('" 
					+ artikel.getBezeichnung() + "', " + artikel.getPreis() + ", " + artikel.getAnzahl() + 
					",'" + df.format(artikel.getDatum()) + "');";
			
			stat.execute(sqlString);
			
			con.close();
		} catch (Exception e2) {
			e2.printStackTrace();
		}
	}
	
	public static ArrayList<Artikel> artikelAbrufen() {
		ArrayList<Artikel> artikelListe = new ArrayList<Artikel>();
		try {
			String conString = "jdbc:mysql://localhost/javadb";
			String user = "muster";
			String password = "muster";
			
			Connection con = DriverManager.getConnection(conString, user, password);
			Statement stat = con.createStatement();
						
			String sqlString = "SELECT bezeichnung, preis, anzahl, datum FROM artikel;";
			ResultSet rs = stat.executeQuery(sqlString);
			while(rs.next()) {
				 artikelListe.add( new Artikel( rs.getString(1), rs.getDouble(2), rs.getInt(3) , rs.getDate(4)) );
			}
			
			con.close();
		} catch (Exception e2) {
			e2.printStackTrace();
		}
		
		return artikelListe;
	}
}
