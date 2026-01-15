package application;

import java.util.Locale;
import java.util.Scanner;

import entities.product;

public class program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		product triangle = new product();
		
		System.out.println("Enter rectangle width and height: ");
		triangle.width = sc.nextInt();
		triangle.height = sc.nextInt();
		
		System.out.println("AREA: " + triangle.area());
		System.out.println("PERIMETER: " + triangle.perimeter());
		System.out.println("DIAGONAL: " + triangle.diagonal());

		
		sc.close();

	}

}
