import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double A,B,C;
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		double c = Math.pow(C, 2);
		double pi = 3.14159;
		
		System.out.printf("Triangle: %.3f%n", A * C / 2);
		System.out.printf("Círculo: %.3f%n", pi * c);
		System.out.printf("Trapézio: %.3f%n", (A + B) / 2 * C);
		System.out.printf("Quadrado: %.3f%n", Math.pow(B, 2));
		System.out.printf("Retângulo: %.3f%n", A * B);
		
		sc.close();

	}

}
