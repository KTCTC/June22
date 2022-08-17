package variable.type;

import java.io.PrintStream;

public class ObjectAsVariable {
	int a = 89;
	static int b = 78;
	ArithMaticCalculations obj = new ArithMaticCalculations();
	
	 static ArithMaticCalculations obj1 = new ArithMaticCalculations();
	static PrintStream oo = new PrintStream(System.out);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ObjectAsVariable.oo.println("Sample");
		
		ObjectAsVariable.b = 88;
		ObjectAsVariable.obj1.addition();
		System.out.println();
	

	}
	public static void substractionOfObjectAsVariablerClass()
	{
		ObjectAsVariable oo = new ObjectAsVariable();
		
		oo.a = 45;
		oo.b = 88;
		
		oo.obj.addition();
		oo.obj1.substraction();
		
		System.out.println(a);
		System.out.println(b);
		obj.addition();
		obj.substraction();
		obj1.addition();
		obj1.substraction();
		
	}
	public void additionOfObjectAsVariablerClass()
	{
		System.out.println(a);
		System.out.println(b);
		obj.addition();
		obj.substraction();
		obj1.addition();
		obj1.substraction();
		
	}

}
