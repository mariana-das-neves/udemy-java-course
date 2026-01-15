import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int code = sc.nextInt();
		double quant = sc.nextDouble();
		
		
		if (code == 1) {
			System.out.printf("Total: %.2f", 4 * quant);
		}
		else if (code == 2) {
			System.out.printf("Total: %.2f", 4.5 * quant);
		}
		else if (code == 3) {
			System.out.printf("Total: %.2f", 5 * quant);
		}
		else if (code == 4) {
			System.out.printf("Total: %.2f", 2 * quant);
		}
		else {
			System.out.printf("Total: %.2f", 1.5 * quant);
		}
		
		sc.close();

	}

}
