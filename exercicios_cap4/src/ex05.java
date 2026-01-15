import java.util.Locale;
import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int codigo1, codigo2, num1, num2;
		// codigo1 = sc.nextInt();
		// codigo2 = sc.nextInt();
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		double preco1, preco2;
		preco1 = sc.nextDouble();
		preco2 = sc.nextDouble();
		
		System.out.printf("Total: %.2f% €", num1 * preco1 + num2 * preco2);
		
		sc.close();

	}

}
