import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num, horas;
		num = sc.nextInt();
		horas = sc.nextInt();
		double salario;
		salario = sc.nextDouble();
		
		System.out.println("Number: " + num);
		System.out.printf("Salary: %.2f €", horas * salario);
		sc.close();

	}

}
