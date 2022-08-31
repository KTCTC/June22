package inheritance;

public class A {
	int aa = 89;
	static int staa = 23;
	
	public void nonStaticMethodFromA()
	{
		System.out.println("non Stati cMethod From A");
	}
	
	public static void staticMethodFromA()
	{
		System.out.println("Static Method From A");
	}
	public static void main(String[] args) {
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
