package inheritance;

public class C extends B{
	int cc = 1233;
	static int stcc = 2342;
	
	public void nonStaticMethodFromC()
	{
		System.out.println("non Stati cMethod From C");
	}
	
	public static void staticMethodFromC()
	{
		System.out.println("Static Method From C");
	}
	public static void main(String[] args) {
		
		C cObj = new C();
		System.out.println(cObj.aa);
		System.out.println(cObj.bb);
		System.out.println(cObj.cc);
		System.out.println(cObj.staa);
		System.out.println(cObj.stbb);
		System.out.println(cObj.stcc);
		cObj.nonStaticMethodFromA();
		cObj.nonStaticMethodFromB();
		cObj.nonStaticMethodFromC();
		cObj.staticMethodFromA();
		cObj.staticMethodFromB();
		cObj.staticMethodFromC();
		
		
		
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
