package scanner.pack;

import java.util.Scanner;

public class ScannerClass3 {

	public static void main(String[] args) {
		int pass = 4567;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter password");
		int a = sc.nextInt();
		
		if (pass==a)
		{
			System.out.println("Logged in successfully");
		}
		else
		{
			System.out.println("Password is incorrect!!");
		}

	}

}
