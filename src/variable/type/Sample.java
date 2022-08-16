package variable.type;

public class Sample {

	public static void main(String[] args) {
		VariableTypesClass.z = 90;
		VariableTypesClass obj = new VariableTypesClass();
		obj.z = 67;
		
		obj.a =89;
		obj.b = 3445;
		VariableTypesClass.a = 34;
		VariableTypesClass.b = 340;
		
		obj.c = 777;
		VariableTypesClass.c = 444;
		
		obj.nonStaticMethod();
		VariableTypesClass.nonStaticMethod();
		obj.staticMethod();
		VariableTypesClass.staticMethod();

	}

}
