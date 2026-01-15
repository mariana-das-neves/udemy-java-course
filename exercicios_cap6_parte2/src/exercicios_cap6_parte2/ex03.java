package exercicios_cap6_parte2;

import java.util.Locale;
import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		double y1, y2, y3;
		
		for (int i = 0; i<x; i++) {
			y1 = sc.nextDouble();
			y2 = sc.nextDouble();
			y3 = sc.nextDouble();
			
			System.out.printf("%.1f", y1*0.2+y2*0.3+y3*0.5);
		}
		
		sc.close();

	}

}
