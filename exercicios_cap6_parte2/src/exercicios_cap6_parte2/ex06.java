package exercicios_cap6_parte2;

import java.util.Locale;
import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for (int i = N; i>=1; i--) {
			if (N%i == 0){
				System.out.println(i);
			}
		}
		
		sc.close();
	}

}
