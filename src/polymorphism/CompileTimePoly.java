package polymorphism;

public class CompileTimePoly {

	public static void main(String[] args) {

		CompileTimePoly obj = new CompileTimePoly();
		obj.addition();
		obj.addition(45);
		obj.addition(45.3f, 23);

	}

	public void addition() {
		int c = 23 + 45;
		System.out.println(c);

	}

	public void addition(int a) {
		int c = 23 + a;
		System.out.println(c);

	}

	public void addition(int a, float b) {
		float c = a + b;
		System.out.println(c);

	}

	public static void addition(float b, int a) {
		float c = b + a;
		System.out.println(c);

	}

}
