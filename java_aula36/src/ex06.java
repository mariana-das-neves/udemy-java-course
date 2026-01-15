import java.util.Scanner;
import java.util.Locale;

public class ex06 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		
		if ( x<0.00 || x>100.00) {
			System.out.println("Fora de Intervalo");
		}
		else if (x<=25.00 ) {
			System.out.println("Intervalo (0,25]");
		}
		else if (x<=50.00) {
			System.out.println("Intervalo (25,50]");
		}
		else if (x<=75.00) {
			System.out.println("Intervalo (50,75]");
		}
		else {
			System.out.println("Intervalo (75,100]");
		}
		
		sc.close();
	}

}
