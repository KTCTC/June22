package polymorphism;

public class A {
	
	int abc = 34;
	static int stABC = 33;
	int pqr = 78;
	static int stPQR = 88;
	public void nonstaticMethod()
	{
		System.out.println("This is non static method from A");
		int c = 34+34;
		System.out.println(c);
	}
	public static void staticMethod()
	{
		System.out.println("This is static method from A");
	}
	
	public void sm()
	{
		System.out.println("Sm from A");
	}
	
	public static void smStatic()
	{
		System.out.println("Sm static from A");
	}
}
