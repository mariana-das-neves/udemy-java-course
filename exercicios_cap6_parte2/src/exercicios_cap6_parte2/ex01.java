package exercicios_cap6_parte2;

import java.util.Locale;
import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		for (int i = 1; i<x; i=i+2) {
			System.out.println(i);
		}
		
		sc.close();
	}

}
