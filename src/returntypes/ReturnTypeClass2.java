package returntypes;

import parameterized.method.Student;

public class ReturnTypeClass2 {
	int z ;

	public static void main(String[] args) {
		
		ReturnTypeClass2 obj = new ReturnTypeClass2();
		ReturnTypeClass2 newObj = obj.getCurrentCLassInstance();
		
		ReturnTypeClass2 nn = obj.getCurrentCLassInstanceTwo(newObj);
		
		
		Student oo = obj.getStudentInstance();
		
		System.out.println(oo.name);

	}
	
	public Student getStudentInstance()
	{
		
		Student st = new Student();
		st.name = "KTCTC";
		st.rollNum = 444;
		
		return st;
	}
	
	public ReturnTypeClass2 getCurrentCLassInstance()
	{
		ReturnTypeClass2 ooo = new ReturnTypeClass2();
		ooo.z = 999;
		
		return ooo;
	}
	
	public ReturnTypeClass2 getCurrentCLassInstanceTwo(ReturnTypeClass2 rtObj)
	{
		rtObj.z = 7878;
		
		return rtObj;
	}
	
}
