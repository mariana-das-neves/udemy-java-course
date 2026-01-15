import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double p = 3.14159;
		double raio;
		raio = sc.nextDouble();
		double a;
		a = Math.pow(raio, 2);
		
		System.out.printf("Área = %.4f%n", p * a);
		
		sc.close();
	}

}
