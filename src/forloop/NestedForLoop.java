package forloop;

public class NestedForLoop {

	public static void main(String[] args) {
		System.out.println("Before for loop");
		
		outer:for (int i=0;i<2;i++)
		{
			System.out.println("outer for loop");
			
			INNER:for (int j=0; j<2;j++)
			{
				System.out.println("Inner for loop");
				
				ABC:for (int k=0;k<3;k++)
				{
					System.out.println("Inside K");
					System.out.println(i + " "+j+ " "+k);
				}
			}
		}
		
		System.out.println("After for loop");

	}

}
