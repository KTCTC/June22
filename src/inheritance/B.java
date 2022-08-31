package inheritance;

public class B extends A{
	int bb = 890;
	static int stbb = 820;
	
	public void nonStaticMethodFromB()
	{
		System.out.println("non Stati cMethod From B");
	}
	
	public static void staticMethodFromB()
	{
		System.out.println("Static Method From B");
	}
	
	public static void main(String[] args) {
		A.staa = 77;
		A.staticMethodFromA();
		
		B.staa = 666;
		B.stbb = 345;
		B.staticMethodFromA();
		B.staticMethodFromB();
		
		A aObj = new A();
		aObj.aa = 78;
		aObj.staa  = 66;
		aObj.staticMethodFromA();
		aObj.nonStaticMethodFromA();
		
		B bObj = new B();		
		System.out.println(bObj.aa);
		System.out.println(bObj.bb);
		System.out.println(bObj.staa);
		System.out.println(bObj.stbb);
		bObj.nonStaticMethodFromA();
		bObj.nonStaticMethodFromB();
		bObj.staticMethodFromA();
		bObj.staticMethodFromB();
		
		
	}

}
