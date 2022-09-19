package collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListClass2 {
	
	public static void main(String[] args) {
		
		
		ArrayList<String> data = new ArrayList<>();
		String str1 = new String("Welcome to KTCTC");
		String str2 = "June Batch 2022";
		
		data.add(str1);
		data.add(str2);
		data.add("Direct String");
		
		System.out.println(data);
		
		
		
		for (int i=0; i<data.size();i++)
		{
			System.out.println(data.get(i));
		}
		
		for(String each:data)
		{
			System.out.println(each);
		}
		
	}

}
