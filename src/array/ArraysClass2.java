package array;

import java.util.Arrays;

public class ArraysClass2 {

	public static void main(String[] args) {

		char chArr[] = {'a','b','f','r','3','D','$'};
		
		String[] arStr = {"Hi", "Welcome to KCTCT", "Hello!"};
		
		float[] arFl = {23.4f,44.5f};
		
		System.out.println(arStr[1]);
		System.out.println(chArr.length);
		Arrays.sort(chArr);
		sm(arStr);

	}
	
	public static void sm(String[] ab)
	{
		System.out.println(ab[0]);
	}

}
