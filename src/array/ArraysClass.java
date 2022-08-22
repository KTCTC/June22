package array;

import java.util.Arrays;

public class ArraysClass {

	public static void main(String[] args) {

		int a = 89;
		int b = 89;
		boolean ff = a==b;
		System.out.println(ff);
		System.out.println(a);
		a = 77;
		System.out.println(a);

		int[] arr = { 23, 34, 56, 8 , 56, 78};
		
		int[] arr2 = { 23, 34, 56, 8 , 56, 78};
		
		int[] arr3 = {4,3,2,5,1};
		Arrays.sort(arr3);
		
		boolean fgh = arr[0]==arr2[0];
		System.out.println(fgh);
		
		boolean flag = Arrays.equals(arr, arr2);
		System.out.println(flag);
		
		
		boolean f = arr==arr2;// it gives false. Bcoz, relational operators compares address locations not values
		System.out.println(f);
		
		int lng = arr.length;
		System.out.println(lng);
		
		int z = arr[2];
		System.out.println(z);
		
		arr[0] = 44;
		
		System.out.println(arr);
		ArraysClass obj = new ArraysClass();
		System.out.println(obj);

	}

}
