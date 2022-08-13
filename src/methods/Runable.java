package methods;

public class Runable {

	public static void main(String[] args) {	
		String arr[] = {"Hi","Hello"};
	SampleClass.main(arr);	
   SampleClass.sampleMethod();
   sampleMethodFromRunableClass();
   int a = 90;
   System.out.println(a);
   
	}
	
	public static void sampleMethodFromRunableClass()
	{
		int bcd = 67;
		System.out.println(bcd);
		System.out.println("sample Method From Runable Class");
	}
	
	public  void sampleNonStaticMethod()
	{
		char ch = 'a';
		System.out.println(ch);
		System.out.println("sample Non Static Method");
	}

}
