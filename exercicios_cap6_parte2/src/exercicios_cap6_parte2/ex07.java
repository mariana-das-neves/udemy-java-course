package exercicios_cap6_parte2;

import java.util.Locale;
import java.util.Scanner;

public class ex07 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for (int i = 1; i<=N; i++) {
			System.out.println(i + " " + Math.pow(i, 2) + " " + Math.pow(i,3));
		}
		
		sc.close();

	}

}
