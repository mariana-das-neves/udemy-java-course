package application;

import java.util.Locale;
import java.util.Scanner;

import entities.product02;

public class program02 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		product02 employee = new product02();
		System.out.println("Name: ");
		employee.name = sc.nextLine();
		System.out.println("Gross Salary: ");
		employee.salary = sc.nextInt();
		System.out.println("Tax: ");
		employee.tax = sc.nextInt();
		
		System.out.println("Employee: " + employee.name + " , €" + employee.liquid());
		
		System.out.println("Which percentage to increase salary?");
		employee.percentage = sc.nextInt();
		
		System.out.println("Updated Data: " + employee.name + " , €" + employee.updated());
		
		
		
		
		sc.close();
		
	}

}
