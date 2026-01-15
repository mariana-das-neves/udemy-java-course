import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		double horas;
		
		if ( x==y ) {
			System.out.println("O Jogo durou 24 horas");
		}
		else {
			if ( x>y ) {
				horas = 24-x+y ;
				System.out.printf("O jogo durou %.0f horas", horas);
				}
			else {
				horas = y-x ;
				System.out.printf("O jogo durou %.0f ", horas);
			}
		}
		
		sc.close();

	}

}
