package abstractclassinjava;

public abstract class AbstractClass extends ParentAbstractClass{
	
	int abcd = 88;
	static int pqrs = 76;
	public static final int zzz = 67;
	
	public AbstractClass()
	{
		System.out.println("This is default constructor");
	}

	public static void main(String[] args) {
		
     
	}
	
	public abstract void sample();
	
	public  void parentClassAbstractMethod()
	{
		System.out.println("parent abstract method is implemented by child abstract class");
		
	}
	
	public void sampleNonStaticMethod()
	{
		System.out.println("This is non static method from Abstract class");
	}
	
	public static void staticMethodFromAbstractClass()
	{
		
		System.out.println("This is static method from Abstract class");
	}
	

}
