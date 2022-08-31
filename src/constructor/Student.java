package constructor;

public class Student {
	int rollNum;
	String name;
	char div;

	public Student() {
		System.out.println("This is default constructor");
	}

	public Student(int a) {
		rollNum = a;
	}

	public Student(int aa, String nn) {
		rollNum = aa;
		name = nn;
	}

	public Student(int aa, char nn) {
		rollNum = aa;
		div = nn;
	}

	public Student(String nn, int aa) {
		rollNum = aa;
		name = nn;
	}

	public Student(int a, String nn, char ch) {
		rollNum = a;
		name = nn;
		div = ch;
	}

	public static void main(String[] args) {

		Student obj = new Student();
		obj.Student();
		obj.Student();
		

		Student obj2 = new Student(23);

		Student obj3 = new Student(222, "Ajay");
		Student obj4 = new Student(3424, "Salman", 'A');

		Student obj5 = new Student(333, "Sunil", 'B');
	}

	public void Student() {
		System.out.println("This is method with same name as class name");
	}

}
