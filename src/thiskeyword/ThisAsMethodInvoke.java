package thiskeyword;

public class ThisAsMethodInvoke {
	int a;
	static int b = 8;
	public static void main(String[] args) {
		
		ThisAsMethodInvoke obj = new ThisAsMethodInvoke();
		obj.a = 999;
		obj.nonstaticMethod();
		

	}
	
	public void nonstaticMethod()
	{
		int a = 90;
		System.out.println("non static Method ");
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(this.b);
		this.sm();
		this.staticMethod();
	}
	
	public static void staticMethod()
	{
		System.out.println("static Method ");
		
	}
	
	public void sm()
	{
		System.out.println("This is second nonstatic method");
		System.out.println(this.a);
		System.out.println(a);
	}

}
