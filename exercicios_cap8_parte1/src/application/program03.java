package application;

import java.util.Locale;
import java.util.Scanner;

import entities.product03;

public class program03 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		product03 student = new product03();
		
		System.out.println("Name: ");
		student.name = sc.nextLine();
		
		System.out.println("Grade 1: ");
		student.nota1 = sc.nextDouble();
		
		System.out.println("Grade 2: ");
		student.nota2 = sc.nextDouble();
		
		System.out.println("Grade 3: ");
		student.nota3 = sc.nextDouble();
		
		System.out.println("FINAL GRADE: " + student.nota_final());
		
		if (student.nota_final() >= 60) {
			System.out.println("PASS");
		} else {
			System.out.println("FAILED");
			System.out.printf("MISSING: %.2f points",  60 - student.nota_final());
		}
		
		sc.close();
		
	}

}
