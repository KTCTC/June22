package superkeyword;

public class C extends B{
	
	public C()
	{
		super(23);
	}

	public static void main(String[] args) {
		

	}
	
	public void nonStaticMethodFromA()
	{
		System.out.println("non Static Method From A");
		super.nonStaticMethodFromA();
		super.nonStaticMethodFromB();
		super.sm();
		super.smStatic();
		System.out.println(super.ab);
		System.out.println(super.pqr);
		System.out.println(super.zzz);
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
