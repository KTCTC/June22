package exception;

public class ExceptionHandling {

	public static void main(String[] args) {

		int a = 9;
		int b = 3;		
		int c;
		String str = "ABCD";
		
		
		try {
			char ch = str.charAt(30);
			System.out.println(ch);
		} catch (StringIndexOutOfBoundsException e1) {
			
			e1.printStackTrace();
			System.out.println("Please use index which is present in String");
		}
		
			
		
		try
		{
		c = a/b;
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();			
			c = 999;
		}
		
		System.out.println(c);
		System.out.println("After all line of code");

	}

}
