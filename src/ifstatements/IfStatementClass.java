package ifstatements;

public class IfStatementClass {

	public static void main(String[] args) {
		System.out.println("Before if statement");
		int a = 7;
		boolean flag = true;
		
		if(flag)
		{
		System.out.println("Inside if statement");
		int c = 23+45;
		System.out.println(c);
		}
			
		
		if (a>40)
		{
			System.out.println("Hello");
		}
		
		System.out.println("After if statement");

	}

}
