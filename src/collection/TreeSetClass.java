package collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreeSetClass {

	public static void main(String[] args) {
// get() method is not present
		TreeSet<Integer> data = new TreeSet<>();
		Integer a = new Integer(33);
		Integer b = new Integer(12);
		data.add(new Integer(22));
		data.add(a);
		data.add(b);
		data.add(new Integer(22));
		data.add(a);
		data.add(b);
		System.out.println(data);
		data.remove(a);
		System.out.println(data.size());
		
		for (Integer each: data)
		{
			System.out.println(each);
		}
		
		

	}

}
