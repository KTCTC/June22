package polymorphism;

public class C extends B{
	
	int abc = 3455;
	static int stABC = 3334;
	int pqr = 7834;
	static int stPQR = 8834;
	public void nonstaticMethod()
	{
		System.out.println("This is non static method from C");
		int c = 34+34+45+345+23424;
		System.out.println(c);
	}
	public static void staticMethod()
	{
		System.out.println("This is static method from C");
	}
	
	public void sm()
	{
		System.out.println("Sm from C");
	}
	
	public static void smStatic()
	{
		System.out.println("Sm static from C");
	}
	
	public void ccc()
	{
		System.out.println("ccc method from c");
	}
	
	public static void main(String[] args) {
		
		
		
		B bc = new C();
		bc.nonstaticMethod();
		bc.sm();
		
		
		A ac = new C();
		ac.sm();
		ac.nonstaticMethod();
		
		
		A ab = new B();
		ab.nonstaticMethod();
		ab.sm();
		
		
	}
}
