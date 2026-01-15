package exercicios_cap6_parte2;

import java.util.Locale;
import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int fatorial = 1;
		
		for (int i = x; i>1; i--) {			
			fatorial = fatorial * i;
		}
		
		System.out.println(fatorial);
		
		sc.close();
	}

}
