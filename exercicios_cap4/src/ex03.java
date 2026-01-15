import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A,B,C,D;
		A = sc.nextInt();
		// System.out.println(A);
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		int d =  A * B - C * D ; 
		// System.out.println(d); // aqui está certo
		
		System.out.printf("Difference: " + d);
		
		sc.close();

	}

}
