package operators;

public class AssignmentOperator {

	public static void main(String[] args) {
		// Assignment Operators
		//   = ,+= ,-= ,*= ,/= ,%= , <<= ,>>= 
		
		int a = 34;
		int b = 23;
		
		b>>=2; // b = b>>2// b = b/2^2
		System.out.println(b);
		a<<=2;// a = a<<2; // a = a*2^2 
		System.out.println(a);
		a%=22;// a = a%22;
		System.out.println(a);
		
		a/=4;// a = a/4;
		System.out.println(a);
		
		
		b*=a; // b = b*a;
		System.out.println(b);
		
		
		a-=44; // a = a-44;
		System.out.println(a);
		
		b+=a;// b = b+a;
		System.out.println(b);
		
		a+=32; // a = a+32;
		System.out.println(a);

	}

}
