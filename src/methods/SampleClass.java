package methods;

public class SampleClass {
	public static void sampleMethod() {
		System.out.println("This is from sample method");
		System.out.println("This is second line from sample method");
		sampleMethodTwo();
	}
	
	public static void sampleMethodTwo()
	{
		System.out.println("sample Method Two");
	}

	public static void main(String[] args) {
		SampleClass.sampleMethod();
		System.out.println("Welcome to KTCTC");
		System.out.println("second line from main method");
		SampleClass.sampleMethod();	
		
		
		
	}

	

}
