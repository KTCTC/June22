package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class TreeSetClass2 {
	
	public static void main(String[] args) {
		
		
		TreeSet<Student> data = new TreeSet<>();
		
		Student st1 = new Student();
		st1.rollNum = 11;
		st1.name = "Amit";
		
		Student st2 = new Student();
		st2.rollNum = 22;
		st2.name = "Salman";
		
		data.add(st2);
		data.add(st1);
		data.add(new Student());
		
		
		
		for (Student each:data)
		{
			System.out.println(each.rollNum);
			System.out.println(each.name);
			each.displayStudentInfo();
		}
		
		
		
		
	}

}
