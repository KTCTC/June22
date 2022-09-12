package encapsulation;

public class Runable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Encap oo = new Encap();
		
		oo.setMarks(100.15f);
		System.out.println(oo.getMarks());
		
		
		oo.setRollNum(-33);
		
		
		int z = oo.getRollNum();
		System.out.println(z);

	}

}
