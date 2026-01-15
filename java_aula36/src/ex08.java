import java.util.Locale;
import java.util.Scanner;

public class ex08 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		double x, renda,imposto;
		x = sc.nextDouble();
		
		if ( x>=0.00 && x<=2000) {
			System.out.println("Isento");
		}
		else if (x>=2001 && x<=3000 ) {
			renda = x - 2000;
			imposto = renda * 0.08;
			System.out.println(imposto);
		}
		else if (x>=3001 && x<=4500 ) {
			renda = x - 3000;
			imposto = renda * 0.18 + 1000 * 0.08;
			System.out.println(imposto);
		}
		else {
			renda = x - 4500;
			imposto = 1000 * 0.08 + 1500 * 0.18 + renda * 0.28;
			System.out.println(imposto);
		}
		
		sc.close();
	}
}
