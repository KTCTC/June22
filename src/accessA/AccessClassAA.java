package accessA;

public class AccessClassAA {
	
	public int publicInt = 45;
	private int privateInt = 567;
	protected int protectedInt = 345;
	 int defaultInt = 2345;
	 
	 public AccessClassAA()
	 {
		 System.out.println("Public constructor");
	 }
	 private AccessClassAA(int privateVariable)
	 {
		 System.out.println("private constructor");
	 }
	 protected AccessClassAA(String protectedVariable)
	 {
		 System.out.println("protected constructor");
	 }
	  AccessClassAA(boolean defaultVari)
	 {
		 System.out.println("default constructor");
	 }

	public static void main(String[] args) {
		
	AccessClassAA priva = new AccessClassAA(34);
	AccessClassAA protec = new AccessClassAA("Protected String");
	AccessClassAA defaul = new AccessClassAA(true);

    AccessClassAA obj = new AccessClassAA();
    System.out.println(obj.publicInt);
    System.out.println(obj.privateInt);
    System.out.println(obj.protectedInt);
    System.out.println(obj.defaultInt);
    obj.publicMethod();
    obj.privateMethod();
    obj.protectedMethod();
    obj.defaultMethod();

	}
	
	public void publicMethod()
	{
		System.out.println("public method");
	}
	private void privateMethod()
	{
		System.out.println("private method");
	}
	
	protected void protectedMethod()
	{
		System.out.println("protected method");
	}
	
	 void defaultMethod()
	{
		System.out.println("default method");
	}

}
