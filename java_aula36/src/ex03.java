import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if ((y%x==0) || (x%y==0)) {
			System.out.println("São Múltiplos");
		}
		else {
			System.out.println("Não são Múltiplos");
		}
		
		sc.close();
	}

}
