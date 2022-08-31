package thiskeyword;

public class ThisAsReturnType {
	int a;
	static int b = 8;

	public static void main(String[] args) {
		ThisAsReturnType obj = new ThisAsReturnType();
		obj.a = 56;
		ThisAsReturnType oo = obj.nonstaticMethod();
		System.out.println(oo.a);
	}

	public ThisAsReturnType nonstaticMethod() {
		int a = 90;
		System.out.println("non static Method ");
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(this.b);
		this.a = 9090;
		return this;
	}

	public static void staticMethod(ThisAsMethodPAram ost) {
		System.out.println("static Method ");
		System.out.println(ost.a);

	}

	public void sm(ThisAsMethodPAram oo) {
		System.out.println("This is second nonstatic method");
		System.out.println(this.a);
		System.out.println(oo.a);
	}

}
