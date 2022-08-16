package variable.type;

public class StaticKeyword {
	int a = 90;
	
	
	public void nonStaticMethod1()
	{
		System.out.println("non Static Method1");
		staticMethod2();
		nonStaticMethod2();
	}
	public void nonStaticMethod2()
	{
		System.out.println("non Static Method2");
	}
	
	public static void staticMethod1()
	{
		System.out.println("static Method1");
		staticMethod2();
		nonStaticMethod2();
	}
	public static void staticMethod2()
	{
		System.out.println("static Method2");
	}

}
