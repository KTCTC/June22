package exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CheckedOrCompileTimeException {

	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, SQLException {
		
		sample1();
		sample2();
		sample3();

	}
	
	
	public static void sample1() throws FileNotFoundException
	{
		File f = new File("C:\\Users\\91992\\June22\\FirstJavaProject\\KTCTC.xlsx");		
		FileInputStream fis = new FileInputStream(f);
		System.out.println("After file not found exception line");
		
	}
	
	public static void sample2() throws ClassNotFoundException
	{
		Class.forName("exception.UncheckedExceptionOrRunTImeException");
		System.out.println("After class not foung exception");
	}
	
	public static void sample3() throws SQLException
	{
		DriverManager.getConnection("120.2.3.4.5:330", "root", "ABCD");
		System.out.println("After sql exception");
		
	}
	
	public static void sample4() throws FileNotFoundException, ClassNotFoundException, SQLException
	{
		File f = new File("C:\\Users\\91992\\June22\\FirstJavaProject\\KTCTC.xlsx");		
		FileInputStream fis = new FileInputStream(f);
		System.out.println("After file not found exception line");
		Class.forName("exception.UncheckedExceptionOrRunTImeException");
		System.out.println("After class not foung exception");
		DriverManager.getConnection("120.2.3.4.5:330", "root", "ABCD");
		System.out.println("After sql exception");
	}
	public static void sample5() throws Exception
	{
		File f = new File("C:\\Users\\91992\\June22\\FirstJavaProject\\KTCTC.xlsx");		
		FileInputStream fis = new FileInputStream(f);
		System.out.println("After file not found exception line");
		Class.forName("exception.UncheckedExceptionOrRunTImeException");
		System.out.println("After class not foung exception");
		DriverManager.getConnection("120.2.3.4.5:330", "root", "ABCD");
		System.out.println("After sql exception");
	}
	

}
