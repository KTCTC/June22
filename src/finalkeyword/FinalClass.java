package finalkeyword;

public  class FinalClass extends BCD{
	
	final int ABC ;
	static final int PQR ;
	
	final int ASD = 89;
	final static int FGH = 444;
	
	public FinalClass(int a)
	{
		ABC =a;
	}
	
	
	static {
		PQR = 898;
		System.out.println("This is static block");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(FinalClass.PQR);
		FinalClass ob = new FinalClass(44);
		System.out.println(ob.ABC);
		//ob.ABC = 545;
		
		FinalClass obj = new FinalClass(22);
		System.out.println(obj.ABC);
		System.out.println(obj.PQR);
		//FinalClass.PQR = 777;
		//obj.ABC = 123;
		//obj.PQR = 333;

	}
	
	public final void nonstaticMethod()
	{
		System.out.println("non static method from class");
	}
	public final static void staticMethod()
	{
		System.out.println("static method from class");
	}

	@Override
	public void abMethod() {
		System.out.println("Abstract method implemented by Final class");
		
	}
	
	
	
	

}
