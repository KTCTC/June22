package variable.type;

public class VariableTypesTwo {
	
	int a = 90;
	
	static int b = 90;

	public static void main(String[] args) {
		// this code is to understatnd static keyword

		VariableTypesTwo.staticMethod();
		
		VariableTypesTwo obj = new VariableTypesTwo();
		obj.a = 777;
		obj.nonStaticMethod();
		
		System.out.println("Hello");

	}

	public void nonStaticMethod() {
		System.out.println(a);
		System.out.println(b);
	}

	public static void staticMethod() {
		System.out.println(a);// if we call static method by using class name (without creating object) then a will not be initialized
		System.out.println(b);

	}
}
