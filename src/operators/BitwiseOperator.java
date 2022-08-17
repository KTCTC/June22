package operators;

public class BitwiseOperator {

	public static void main(String[] args) {
		// Bitwise Operators
		//   &,^,|
		
		int a = 5; // 0000 0000 0000 0000 0000 0000 0000 0101
        int b = 7; // 0000 0000 0000 0000 0000 0000 0000 0111 
        
        int d =a&b;// 0000 0000 0000 0000 0000 0000 0000 0101
        System.out.println(d);
        
        int e = a|b;//0000 0000 0000 0000 0000 0000 0000 0111
        System.out.println(e);
        
        int f = a^b;// 0000 0000 0000 0000 0000 0000 0000 0010
        System.out.println(f);
	}

}
