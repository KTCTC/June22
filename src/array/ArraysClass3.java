package array;

import java.util.Arrays;

public class ArraysClass3 {

	public static void main(String[] args) {

		int[] arr = new int[7];
		int[] arr1 = new int[7];
		
		String[] stArr = new String[3];
		
		arr[0] = 88;
		arr[1] = 27;
		
		Arrays.sort(arr);
		boolean bl = Arrays.equals(arr, arr1);
		System.out.println(bl);
		System.out.println(arr1.length);
		
		

	}
	
	

}
