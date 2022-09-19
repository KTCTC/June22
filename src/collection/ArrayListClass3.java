package collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListClass3 {
	
	public static void main(String[] args) {
		
		
		ArrayList<Student> data = new ArrayList<>();
		
		Student st1 = new Student();
		st1.rollNum = 11;
		st1.name = "Amit";
		
		Student st2 = new Student();
		st2.rollNum = 22;
		st2.name = "Salman";
		
		data.add(st2);
		data.add(st1);
		data.add(new Student());
		
		Student ss = data.get(0);
		System.out.println(ss.rollNum);
		ss.displayStudentInfo();
		
		data.get(1).displayStudentInfo();
		
		for (Student each:data)
		{
			System.out.println(each.rollNum);
			System.out.println(each.name);
			each.displayStudentInfo();
		}
		
		
		
		
	}

}
