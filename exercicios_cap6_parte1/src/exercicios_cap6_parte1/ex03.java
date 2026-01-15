package exercicios_cap6_parte1;

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x, soma1, soma2, soma3;
		soma1 = 0;
		soma2 = 0;
		soma3 = 0;
		x = sc.nextInt();
		
		
		while (x!=4) {
			if (x==1) {
				soma1 += 1;
			}
			else if (x==2) {
				soma2 += 1;
			}
			else if (x==3) {
				soma3 += 1;
			}
			else {
				System.out.println("Insira novo código");
			}
			x = sc.nextInt();
		}
		
		System.out.println("Muito obrigado! Álcool: " + soma1 + " Gasolina " + soma2 + " Diesel " + soma3);
		
		sc.close();

	}

}
