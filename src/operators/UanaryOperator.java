package operators;

public class UanaryOperator {

	public static void main(String[] args) {
		// Unary operator
		//   exp++,exp--,++exp,--exp,~,!
		
		int a = 5;//4,3
		int b = 7;//6,5,4
		boolean fl = !(a<b);
		System.out.println(fl);
		
		
		boolean flag = false;
		
		boolean flag2 = !flag;
		System.out.println(flag2);
		System.out.println(flag);
		
		
		int j = ~a; // a*-1 -1
		System.out.println(j);
		
		int h = --a+--b+a--+b--+b--;//4+6+4+6+5
		System.out.println(h);//25
		
		int g = a++-b--+a--+b--;
		System.out.println(g);
		
		
		int f = --a;
		System.out.println(f);
		System.out.println(a);
		
		int e = a--;
		System.out.println(e);
		System.out.println(a);
		
		int d = ++a;
		System.out.println(d);
		System.out.println(a);
		
		int c = a++;
		System.out.println(c);
		System.out.println(a);
		
		
		

	}

}
