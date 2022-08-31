package thiskeyword;

public class ThisToRefereInstanceVariable {
	int a;
	static int b = 8;
public ThisToRefereInstanceVariable()
{
	
	
	}
public ThisToRefereInstanceVariable(int a)
{
	this.a = a;
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThisToRefereInstanceVariable obj1 = new ThisToRefereInstanceVariable(23);
		
		ThisToRefereInstanceVariable obj = new ThisToRefereInstanceVariable();
		obj.a = 888;
		obj.nonstaticMethod();
		obj.staticMethod();
		ThisToRefereInstanceVariable.staticMethod();
		

	}
	
	
	public void nonstaticMethod()
	{
		int a = 90;
		System.out.println("non static Method ");
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(this.b);
	}
	
	public static void staticMethod()
	{
		System.out.println("static Method ");
		System.out.println(this.a);// if we call static method by using class name then this wont have identity of object
		System.out.println(this.b);
	}

}
