package scanner.pack;

import java.util.Scanner;

public class ScannerClass2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first integer number");
		int a = sc.nextInt();
		System.out.println("Enter second integer  number");
		int b = sc.nextInt();
		
		int c = a+b;
		
		System.out.println("Addition is = "+c);

	}

}
