package collection;

import java.util.Stack;

public class StackCLass {

	public static void main(String[] args) {

		Stack<Integer> data = new Stack<>();
		
		Integer a = new Integer(33);
		Integer b = new Integer(12);
		data.push(a);
		data.push(b);
		data.push(new Integer(333));
		data.add(a);
		
		System.out.println(data.get(0));
		
		
		System.out.println(data.size());
		System.out.println(data.pop());
		System.out.println(data.pop());
		System.out.println(data.size());
		
		
		
		

	}

}
