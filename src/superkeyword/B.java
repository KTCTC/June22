package superkeyword;

public class B extends A{
	
	int ab = 890;
	static int stAB = 780;
	int zzz = 345;
	
	static int stZZZ = 789;
	
	public B()
	{
		super(23);
		System.out.println("This is B constructor");
	}
	
	public B(int a)
	{
		this();
		
	}
	
	public B(String nn)
	{
		super(2);
	}
	
	public void nonStaticMethodFromB()
	{
		System.out.println("non Static Method From B");
		System.out.println(this.ab);
		System.out.println(super.ab);
		System.out.println(this.stAB);
		System.out.println(super.stAB);
		System.out.println(super.pqr);
		System.out.println(super.stPQR);
		System.out.println(zzz);
		System.out.println(stZZZ);
		
		super.nonStaticMethodFromA();
		super.staticMethodFromA();
		super.sm();
	}
	
	public static void staticMethodFromB()
	{
		System.out.println("Static Method From B");
		
	}
	public void sm()
	{
		System.out.println("non static sm from A");
	}
	
	public static void smStatic()
	{
		System.out.println("static sm from A");
	}
  public static void main(String[] args) {
	B bb = new B();
	bb.nonStaticMethodFromB();
}
}
