package finalkeyword;

public class AA extends FinalClass{
	public AA()
	{
		super(23);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public  void nonstaticMethod()
	{
		System.out.println("non static method from class");
		int c = 78+45;
		System.out.println(c);
	}
	public  static void staticMethod()
	{
		System.out.println("static method from class");
	}

}
