package collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetClass {

	public static void main(String[] args) {
// get() method is not present
		HashSet<Integer> data = new HashSet<>();
		Integer a = new Integer(33);
		Integer b = new Integer(12);
		data.add(new Integer(22));
		data.add(a);
		data.add(b);
		data.add(new Integer(22));
		data.add(a);
		data.add(b);
		data.add(null);
		data.add(null);
		System.out.println(data);
		data.remove(a);
		System.out.println(data.size());

		Iterator<Integer> itr = data.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());

		}

		for (Integer each : data) {
			System.out.println(each);
		}

	}

}
