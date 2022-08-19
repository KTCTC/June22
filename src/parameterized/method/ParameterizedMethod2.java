package parameterized.method;

public class ParameterizedMethod2 {
	static int abcd = 89;
	int pqr = 90;

	public static void main(String[] args) {
		Student st = new Student();
		st.rollNum = 2;
		st.name = "Amit";
		sampleMethod(st);
		int z = 90;
		ss(z);
		System.out.println(st.name);
		ParameterizedMethod2 obj = new ParameterizedMethod2();
		ss(abcd);
		ss(obj.pqr);
		
	}
	
	public static void sampleMethod(Student obj)
	{
	System.out.println(obj.rollNum);
	System.out.println(obj.name);
	obj.rollNum = 777;
	obj.name = "KTCTC";
	}
	
	public static void ss(int a)
	{
		System.out.println(a);
	}
	
	
	

}
