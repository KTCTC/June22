package ifstatements;

public class IfElseClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Before if statement");
		int b = 7;
		int age = 40;

		
		if(age>=18)
			System.out.println("You can vote");
		else
			System.out.println("you can not vote");
		System.out.println("RRR");
		
		
		if (age >= 18) 
			if (b > 67) 
				System.out.println("Hi");
			
		
		System.out.println("Hello");

		if (age >= 18) {
			System.out.println("You can vote in India");
		} else {
			System.out.println("You can not vote in India");
		}

		if (b > 200) {
			System.out.println("Inside if statement");
		} else {
			System.out.println("Inside else ");
		}

		System.out.println("After if statement");

	}

}
