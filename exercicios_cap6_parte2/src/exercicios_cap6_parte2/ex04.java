package exercicios_cap6_parte2;

import java.util.Locale;
import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		double y1, y2;
		
		for (int i = 0; i<x; i++) {
			y1 = sc.nextDouble();
			y2 = sc.nextDouble();
			
			if (y2==0) { 
				System.out.println("Divisão Impossível");
			}
			
			else if (y1 == 0) {
				System.out.println("0");
			}
			else {
				double div = y1 / y2;
				System.out.println(div);
			}
		}
		sc.close();

	}
		
}
