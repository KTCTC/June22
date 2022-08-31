package scanner.pack;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		System.out.println("KTCTC");

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter next message");

		String str = sc.nextLine();

		System.out.println(str);

		int a = sc.nextInt();
		System.out.println(a);
		System.out.println("enter float value");
		float fl = sc.nextFloat();
		System.out.println(fl);

	}

}
