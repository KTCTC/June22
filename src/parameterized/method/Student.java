package parameterized.method;

public class Student {
	public int rollNum ;
	public String name;
	
	public void displayStudentInfo()
	{
		Student oo = new Student();
		System.out.println("Roll number = "+rollNum);
		System.out.println("Name of student = "+name);
		System.out.println(oo.rollNum);
	}
	
	public static void main(String[] args) {
		byte b = 88;
		
		Student st = new Student();
		st.rollNum = 44;
		st.name = "Salman";
		
		st.displayStudentInfo();
	}

}
