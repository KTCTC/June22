package forloop;

public class ForEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {34,45,6,88,6,45,34,34,345};
		
		int a1[][] = {{3,2},{45,78}};
		for (int[] each:a1)
		{
			System.out.println(each[0]);
			System.out.println(each[1]);
		}
		
		char ch[] = {'a','e','o','q'};
		
		for (char each:ch)
		{
			System.out.println(each);
		}
		
		for (int each:arr)
		{
			System.out.println(each);
		}
		
		

	}

}
