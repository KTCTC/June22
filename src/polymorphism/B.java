package polymorphism;

public class B extends A{
	
	int abc = 340;
	static int stABC = 330;
	
	public void nonstaticMethod()
	{
		System.out.println("This is non static method from B");
		float c = 67.4f+34+234;
		System.out.println(c);
	}
	public static void staticMethod()
	{
		System.out.println("This is static method from B");
	}
	
	public static void main(String[] args) {
		
		A ab = new B();
		System.out.println(ab.abc);
		System.out.println(ab.stABC);
		System.out.println(ab.pqr);
		System.out.println(ab.stPQR);
		ab.nonstaticMethod();
		ab.staticMethod();
		ab.sm();
		ab.smStatic();
		
		
		
		
		
		B bb = new B();
		System.out.println(bb.abc);
		System.out.println(bb.pqr);
		System.out.println(bb.stABC);
		System.out.println(bb.stPQR);
		bb.nonstaticMethod();
		bb.staticMethod();
		bb.sm();
		bb.smStatic();
		
		A aa = new A();
		System.out.println(aa.abc);
		System.out.println(aa.stABC);
		System.out.println(aa.pqr);
		aa.sm();
		aa.smStatic();
		aa.nonstaticMethod();
		aa.staticMethod();
		
	}
}
