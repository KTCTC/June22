package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class LinkedListCLass {

	public static void main(String[] args) {

		LinkedList<Integer> data = new LinkedList<>();
		LinkedList<Integer> data1 = new LinkedList<>();	
		Integer a = new Integer(33);
		Integer b = new Integer(12);
		
		data1.add(a);
		data1.add(b);
		data1.add(new Integer(5));
		data1.add(1);
		data1.add(a);
		data1.add(b);
				
		data.add(a);
		data.add(b);
		data.add(new Integer(5));
		data.add(1);
		data.add(a);
		data.add(b);
		//data.add(null);
		
		Collections.sort(data);		
		
		int lng = data.size();
		System.out.println(lng);
		
		boolean ff = data.equals(data1);
		
		System.out.println(ff);
		
		data.remove(a);
		
		data.remove(4);
		
		System.out.println(data);		
		Integer ab = data.get(2);
		System.out.println(ab);
		
		
		for (int i=0; i<data.size();i++)
		{
			System.out.println(data.get(i));
		}
		
		for(Integer each:data)
		{
			System.out.println(each);
		}
		

	}

}
