package exception;

public class ExceptionHandling2 {

	public static void main(String[] args) {

		int a = 9;
		int b = 0;		
		int c =0;
		String str = "ABCD";
		char arr[] = {3,4,6};
		
		
		try {
			
			char ch = str.charAt(30);
			c = a/b;
			System.out.println(arr[8]);
			System.out.println(ch);
		} 
				
		catch (StringIndexOutOfBoundsException e1) {
			
			e1.printStackTrace();
			System.out.println("Please use index which is present in String");
		}
		catch(ArithmeticException e2)
		{
			e2.printStackTrace();
			
			c = 999;
		}		
		catch(Exception e)
		{
			e.printStackTrace();
		}
				
		
		
		System.out.println(c);
		System.out.println("After all line of code");

	}

}
