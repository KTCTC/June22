package exception;

import objectclass.Student;

public class UncheckedExceptionOrRunTImeException {
	
	static Student obj;

	public static void main(String[] args) {
		int a = 9;
		int b = 0;
		String str = "89ff";
		
		char ch = str.charAt(88);
		System.out.println(ch);
		
		int arr[] = {3,5,33,8};
		
		System.out.println(arr[22]);	
		
		int z = Integer.parseInt(str);
		System.out.println(z);
		
		String data = null;
	
		obj.studentReadsBooks();
		
		data.toLowerCase();
		
		
		
		
		int c = a/b;
		
		
		System.out.println(c);

	}

}
