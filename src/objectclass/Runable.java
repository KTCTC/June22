package objectclass;

public class Runable {

	public static void main(String[] args) {
			
		
		HumanBeing oo = new HumanBeing();
		Student obj = new Student();
		
		oo.height = 45;
		oo.name = "Sanket";
		oo.weight = 67;
		
		oo.humanBeingEats();
		oo.humanBeingPlaysSport();
		
		
		obj.division ='B';
		obj.male = false;
		obj.name = "Sangita";
		obj.rollNumber = 23;
		obj.studentReadsBooks();
		obj.studentParticipateInSinging();
		Student.studentParticipateInSinging();
		
		

	}
	public void sm()
	{
		System.out.println("Thisd merthod is from Runable class");
	}

}
