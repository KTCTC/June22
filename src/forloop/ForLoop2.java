package forloop;

public class ForLoop2 {

	public static void main(String[] args) {
		System.out.println("Before for loop");
		
		int arr[] = {34,45,6,88,6,45,34,234,24,12};
		int desc[] = new int[arr.length];
		
		
		
		printReverseArray:for (int j=arr.length-1;j>=0;j-- )
		{
			System.out.println(arr[j]);
		}
		
		for (int i = 0;i<=arr.length-1;i++)
		{
			System.out.println(arr[i]);
		}
		
		
		
		
		System.out.println("After for loop");

	}

}
