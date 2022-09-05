package superkeyword;

public class A {
	
	int ab = 89;
	static int stAB = 78;
	int pqr = 90;
	static int stPQR = 67;
	

	
	public A(int a)
	{
		System.out.println("This is As Constructor");
	}
	
	public void nonStaticMethodFromA()
	{
		System.out.println("non Static Method From A");
	}
	
	public static void staticMethodFromA()
	{
		System.out.println("Static Method From A");
	}
	
	public void sm()
	{
		System.out.println("non static sm from A");
	}
	
	public static void smStatic()
	{
		System.out.println("static sm from A");
	}

}
