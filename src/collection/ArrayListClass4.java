package collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListClass4 {
	
	public static void main(String[] args) {
		
		ArrayListClass4 obj = new ArrayListClass4();		
		
		ArrayList<Object> data = new ArrayList<>();
		String str1 = "Welcome to KTCTC";
		
		Student st1 = new Student();
		st1.rollNum = 11;
		st1.name = "Amit";
		
		Student st2 = new Student();
		st2.rollNum = 22;
		st2.name = "Salman";
		
		data.add(st2);
		data.add(st1);
		data.add(new Student());
		data.add(23);
		data.add(str1);
		
		Object sd = data.get(1);
		
		Student sdd = (Student) sd;
		System.out.println(sdd.rollNum);
		System.out.println(sdd.name);
		
		Object str2 = data.get(4);
		
		String str4 = (String)str2;
		
		System.out.println(str4);
		
		
	
		
		
		
		
	}

}
