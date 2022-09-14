package exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CheckedOrCompileTimeException2 {

	public static void main(String[] args) {
		sample5();
		sample1();
		try {
			sample2();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void sample1() {
		File f = new File("C:\\Users\\91992\\June22\\FirstJavaProject\\KTCTC.xlsx");
		try {
			FileInputStream fis = new FileInputStream(f);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Please add file at mentioned location");
		}
		System.out.println("After file not found exception line");

	}

	public static void sample2() throws ClassNotFoundException {
		Class.forName("exception.UncheckedExceptionOrRunTImeException");
		System.out.println("After class not foung exception");
	}

	public static void sample5() {
		try {
			File f = new File("C:\\Users\\91992\\June22\\FirstJavaProject\\KTCTC.xlsx");
			FileInputStream fis = new FileInputStream(f);
			System.out.println("After file not found exception line");
			Class.forName("exception.UncheckedExceptionOrRunTImeException");
			System.out.println("After class not foung exception");
			DriverManager.getConnection("120.2.3.4.5:330", "root", "ABCD");
			System.out.println("After sql exception");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
