package ifstatements;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 4;
		int b = 88;
		
		if (a>20)
		{
			System.out.println("Inside outer if");
			
			if (b<5)
			{
				System.out.println("Inside inner if");
			}
			else
			{
				System.out.println("Inside inner else");
			}
		}
		else
		{
			System.out.println("inside outer else");
			if (b<5)
			{
				System.out.println("Inside inner if");
			}
			else
			{
				System.out.println("Inside inner else");
			}
		}

	}

}
