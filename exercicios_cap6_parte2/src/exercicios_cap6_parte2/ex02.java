package exercicios_cap6_parte2;

import java.util.Locale;
import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int soma1 = 0;
		int soma2 = 0;
		
		for (int i = 0; i<x; i=i+1) {
			int y = sc.nextInt();
			if (y>=10 && y<=20) {
				soma1 = soma1 + 1;
			}
			else {soma2 = soma2 + 1;
			}
		}
			
		System.out.println(soma2 + " out " + soma1 + " in ");

		sc.close();
	}
}
