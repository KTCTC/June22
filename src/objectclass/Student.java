package objectclass;

public class Student {
	int rollNumber;
	String name;
	char division;
	boolean male;

	public static void main(String[] args) {
		
		Student st1 = new Student();
		st1.rollNumber = 1;
		st1.name = "Amit";
		st1.division = 'A';
		st1.male = true;
		
		st1.studentReadsBooks();
		System.out.println(st1.rollNumber);
		st1.studentParticipateInSinging();
		
	}
	
	public void studentReadsBooks()
	{
		System.out.println("Student reads english books");
	}
	public static void studentParticipateInSinging()
	{
		System.out.println("Student participate in singing competation at University level");
	}

}
