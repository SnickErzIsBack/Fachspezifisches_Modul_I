package ComCave;

import java.util.Scanner;

public class Formen {
	void rechteckBerechnen()
	{
		double a, b, U, A;
		
		System.out.println("Rechteck berechnen");
		System.out.println("Eingabe Seite a:");
		a = new Scanner(System.in).nextDouble();
		System.out.println("Eingabe Seite b:");
		b = new Scanner(System.in).nextDouble();
		
		U = (a+b) * 2;
		A = a*b;
		
		System.out.println(
			"Der Umfang beträgt " + U + ". Der Flächeninhalt beträgt " + A + ".");
	}
	
	void kreisBerechnen()
	{
		double r, U, A;
		System.out.println("Kreis berechnen");
		System.out.println("Eingabe Radius r:");
		r = new Scanner(System.in).nextDouble();
		
		U = 2*r*Math.PI;
		A = Math.PI*r*r;
		
		System.out.println(
				"Der Umfang beträgt " + U + ". Der Flächeninhalt beträgt " + A + ".");
	}
	
	void oktagonBerechnen()
	{
		double a, b, U, A;
		System.out.println("Oktagon berechnen");
		System.out.println("Eingabe Seitenlänge a:");
		a = new Scanner(System.in).nextDouble();
		
		b = 2;
		U = a*8;
		A = a*a*2*(1+ Math.sqrt(b));
		
		System.out.println(
				"Der Umfang beträgt " + U + ". Der Flächeninhalt beträgt " + A + ".");
	}
}
