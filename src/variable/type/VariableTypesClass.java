package variable.type;

public class VariableTypesClass {

	int a;
	int b = 8;
	static int c = 80;
	
	public static void main(String[] args) {
		 int d = 90;		
		System.out.println(d);
		
		VariableTypesClass obj = new VariableTypesClass();
		VariableTypesClass obj1 = new VariableTypesClass();
		obj.a = 12;
		obj1.a = 67;
		obj.c= 45;
		
		System.out.println(obj.c);
		System.out.println(VariableTypesClass.c);
		System.out.println(obj1.c);
		VariableTypesClass.c = 777;
		System.out.println(obj.c);
		System.out.println(VariableTypesClass.c);
		System.out.println(obj1.c);
		
		

	}
	
	public void nonStaticMethod()
	{
		int z = 90;
		
		System.out.println(z);
		int d = 90;
		
		System.out.println(d);
		
				
	}
	
	public static void staticMethod()
	{
		System.out.println("Static method");
	}

}
