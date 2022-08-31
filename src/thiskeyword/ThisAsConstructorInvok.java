package thiskeyword;

public class ThisAsConstructorInvok {
	int a;
	static int b = 8;
	
	public ThisAsConstructorInvok()
	{
		this(2);
		System.out.println("This is default constructor");
	}
	
	public ThisAsConstructorInvok(int a)
	{
		this(22,33);
		this.a=a;
		System.out.println("This is param constructor");
		
	}
	public ThisAsConstructorInvok(int a, int b)
	{
		
		this.a=a;
		this.b = b;
		System.out.println("This is param constructor");
	}
	
	public static void main(String[] args) {
		ThisAsConstructorInvok obj = new ThisAsConstructorInvok();
		System.out.println(obj.a);

	}
	public void nonstaticMethod()
	{
		
		int a = 90;
		System.out.println("non static Method ");
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(this.b);
		
	}

}
