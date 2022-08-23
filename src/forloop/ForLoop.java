package forloop;

public class ForLoop {

	public static void main(String[] args) {
		System.out.println("Before for loop");
		int a = 7;

		boolean flag = true;
		
		for (int j=5;j>=0;j--)
		{
			System.out.println(j);
			System.out.println("inside for loop with j");
		}

		for (int i = 2; i<5;i++) {
			System.out.println("Inside for loop 1");
			System.out.println("Inside for loop 2");
		}
		
		

		System.out.println("After for loop");

	}

}
