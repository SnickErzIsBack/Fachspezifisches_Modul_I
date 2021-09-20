package ComCave;

import java.util.Scanner;

public class Program {
	
	public static void main(String[] args)
	{
		int menu;
		
		do {
			System.out.println("1-Berechnung Rechteck");
			System.out.println("2-Berechnung Kreis");
			System.out.println("3-Berechnung Oktagon");
			System.out.println("4-Programm Ende");
			
			menu = new Scanner(System.in).nextInt();
			Formen f = new Formen();
	
			switch(menu)
			{
				case 1:
					f.rechteckBerechnen();
					break;
				case 2:
					f.kreisBerechnen();
					break;
				case 3:
					f.oktagonBerechnen();
					break;
			}
		}while(menu != 4);
	}
}
