package array;

import java.util.Arrays;

public class MultiDiamentionalArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a1[][] = {{3,2},{45,78}};
		int a2[][] = {{4,5},{22,9}};
		
		System.out.println(a1[0][0]+a2[0][0]);
		
		int add[][] = new int[a1.length][a1[0].length];
		
		int atr[][] = {{3+4,2+5}, {45+22,78+9}};

	}

}
