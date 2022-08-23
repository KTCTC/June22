package whileloop;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 6;
		int arr[] = {34,45,6,88,6};
		
		int j=arr.length-1;
		while(j>=0)
		{
			System.out.println(arr[j]);
			j--;
		}
		
		int i=0;
		while(i<arr.length)
		{
			System.out.println(arr[i]);
			i++;
		}
		
		
		while(a<10)
		{
			System.out.println("Inside while loop");
			a++;
		}
		
		
System.out.println("After while loop");
	}

}
