package ifstatements;

public class IFElseLadder {

	public static void main(String[] args) {
		int marks = 450;
		

		if (marks < 40) {
			System.out.println("You are fail");
		} 
		
		else if (marks >= 40 && marks < 50) 
		{
			System.out.println("You passed with second class");
			
		} 
		else if (marks >= 50 && marks < 66) 
		{
			System.out.println("You passed with first class");
		} 
		else if (marks>66&&marks<=100)
		{
			System.out.println("You passed with distinction");
			
		}
		else
		{
			System.out.println("Invalid marks");
		}

	}

}
