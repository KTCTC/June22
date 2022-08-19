package parameterized.method;

public class ParameterizedMethod {

	public static void main(String[] args) {
		sampleMethod(23,44);
		sampleMethod(5567, 234);
		ParameterizedMethod obj = new ParameterizedMethod();
		obj.concateString("KTCTC", 2022, 'A', 22.2f, true);
		
		obj.substractionMethod(23.2f,23);
		obj.substractionMethod(34.33f, 2);
		obj.sampleM("How are you?");
		
	}
	public void ss()
	{
		int a =90;
		int b = 88;
		int c = a+b;
		System.out.println("SSS method");
	}
	
	public static void sampleMethod(int a, int b)
	{
		int c = a +b;
		System.out.println("Addition is = "+c);
		System.out.println("Sample method");
	}
	
	public void substractionMethod(float a, int b)
	{
		
		int d = 88;
		float c = a - b +d;
		System.out.println("Substraction is = "+c);
	}
	
	public void sampleM(String str)
	{
		String dd = "Hello "+str;
		
		System.out.println(dd);
	}
	
	public void concateString(String ss, int b, char ch, float ff, boolean flg)
	{
		String dd = ss+b+ch+ff;
		System.out.println(dd);
	}
	

}
