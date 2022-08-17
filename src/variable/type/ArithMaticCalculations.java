package variable.type;

public class ArithMaticCalculations {
	
	int a = 90;
	int b;
	
	public void addition()
	{
		ArithMaticCalculations oo = new ArithMaticCalculations();
		int c = a + b + oo.a;
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		ArithMaticCalculations obj = new ArithMaticCalculations();
		obj.a = 222;
		obj.b = 666;
		obj.addition();
		obj.substraction();
		ArithMaticCalculations.substraction();
		
	}
	
	public static void substraction()
	{
		ArithMaticCalculations oo = new ArithMaticCalculations();
		int c = oo.b-oo.a; // -90, 444
		System.out.println(c);
		
	}

}
