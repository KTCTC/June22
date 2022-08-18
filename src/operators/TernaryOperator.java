package operators;

public class TernaryOperator {

	public static void main(String[] args) {
		// Ternery Operators (if-then-else)
		//  ? :
		
		int a = 6;
		boolean flag = true;
		boolean fl = false;
		int age = 17;
		
		String msg = age>=18?"You can vote in India":"You can not vote in India";
		System.out.println(msg);
		
		
		
		float ff = fl || flag ? 45.3f:33.2f;
		System.out.println(ff);
		
		char ch = flag && (a<8)?'Y':'N';
		System.out.println(ch);
		
		String str = flag?"Yes":"No";
		
		int c = a<2?45:23;
		System.out.println(c);

	}

}
