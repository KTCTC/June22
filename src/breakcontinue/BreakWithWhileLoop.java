package breakcontinue;

public class BreakWithWhileLoop {

	public static void main(String[] args) {
		
		
		int j=0;
		
		do
		{
			System.out.println("Inside do while loop");
			j++;
			if(j>1)
			{
				break;
				
			}
			
		}while(j<4);
		
		
		
		
		
		
		
		int i=0;
		while(i<5)
		{
			System.out.println("inside while loop");
			i++;
			if (!(i==3))
			{
			break;
			}
			
		}
		

	}

}
