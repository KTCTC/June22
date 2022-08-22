package array;

import java.util.Arrays;

public class MultiDiamentionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[][] = {{3,2,4},{45,78,90}};
		int arr1[][] = {{3,2,4},{45,78,90}};
		
		System.out.println(arr.length);
		System.out.println(arr[0].length);
		
		Arrays.sort(arr[0]);
		
		boolean f = Arrays.equals(arr[0], arr1[0]);
		System.out.println(f);
		
		int[] ab = arr[1];
		
		System.out.println(ab[2]);
		
		int z = arr[0][2];
		System.out.println(z);
		arr[1][1] = 88;
		

	}

}
