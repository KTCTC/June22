package interfaceinjava;

public interface ReserveBank extends WorldBank{
	

	
	public final static int abc = 89;
	
	public abstract void savingAccountCharges() ;
	
	public abstract  void currentAccountCharges();
	public abstract int m();
	
	public default void sampleImplementedMethod()
	{
		System.out.println("This is default method from interface");
	}
	
	public static void staticMethodFromInterface()
	{
		System.out.println("This is static method from Interface");
	}

}
