package breakcontinue;

public class BreakWithForLoop {

	public static void main(String[] args) {
		
		char arr[] = {'q','o','a','b','e','u'};
		
		
		
		for (char ch:arr)
		{
			if (ch=='a' || ch=='o' || ch=='u' || ch=='i' || ch=='e')
			{
				System.out.println("This array contains Vovel");
				break;
			}
		}
		
		
		
		for (int i=0;i<arr.length;i++)
		{
			if (arr[i]=='a' || arr[i]=='o' || arr[i]=='u' || arr[i]=='i' || arr[i]=='e')
			{
				System.out.println("This array contains Vovel");
				break;
			}
			
		}

		
		for(int i = 0; i<5;i++)
		{
			System.out.println(i);
			System.out.println("inside for loop");
			
			if (i==3)
			{
				break;
				
			}
			System.out.println("HI");
		}

		for(int i = 0; i<5;i++)
		{
			System.out.println(i);
			System.out.println("inside for loop");			
			break;
			
		}
		
		System.out.println("After for loop");

	}

}
