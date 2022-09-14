package exception;

public class ExceptionHandling3 {

	public static void main(String[] args) {

		int a = 9;
		int b = 0;		
		int c =0;
		String str = "ABCD";
		char arr[] = {3,4,6};
		
		
		try {
			
			char ch = ' ';
			
			try {
				ch = str.charAt(30);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			c = a/b;
			System.out.println(arr[8]);
			System.out.println(ch);
		} 
				
			
		catch(Exception e)
		{
			
			   try {
				c = a/b;
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				c=76;
			}
			   
			   
			   
			e.printStackTrace();
		}
				
		
		
		System.out.println(c);
		System.out.println("After all line of code");

	}

}
