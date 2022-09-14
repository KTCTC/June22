package exception;

public class ExceptionHandling4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 2;
		int b =2;
		int c=0;
		
		try
		{
			c= a/b;
		}
		
		catch(Exception e)
		{
			c = 33;
		}
		finally {
			System.out.println("This is finally block");
		}

	}

}
