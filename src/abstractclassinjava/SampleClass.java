package abstractclassinjava;

public class SampleClass extends AbstractClass{

	public static void main(String[] args) {
		
		ParentAbstractClass pref = new SampleClass();
		pref.parentClassAbstractMethod();
		

		AbstractClass as = new SampleClass();
		as.parentClassAbstractMethod();
		as.sample();
		as.staticMethodFromAbstractClass();
		as.sampleNonStaticMethod();
		
		
     SampleClass oo = new SampleClass();
     
     System.out.println(oo.abcd);
     System.out.println(oo.pqrs);
     System.out.println(oo.zzz);
         
     oo.sample();
     oo.sampleNonStaticMethod();
     oo.staticMethodFromAbstractClass();

	}

	@Override
	public void sample() {

  System.out.println("This is implemented by child class");
		
	}
	
	public  void parentClassAbstractMethod()
	{
		System.out.println("parent abstract method is implemented by sample class");
		
	}
	
	public  void asiaCupWinner()
	{
		System.out.println("INDIA");
	}

}
