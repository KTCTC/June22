package exception;

import java.sql.SQLException;

public class ThrowClass {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		int age=8;
		
		if (age>18)
		{
			System.out.println("You can vote");
		}
		else
		{
			
			ArithmeticException obj = new ArithmeticException();
			
			throw new SQLException();
		}
		

	}

}
