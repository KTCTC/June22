package objectclass;

public class HumanBeing {
	int height;
	String name = "KTCTC";
	float weight;

	public static void main(String[] args) {
		
		HumanBeing obj = new HumanBeing();
		HumanBeing obj2 = new HumanBeing();
		
		obj.name = "Ganesh";
		obj.weight = 72.23f;
		obj.height = 169;
		
		
		System.out.println(obj.name);
		System.out.println(obj.weight);
		
		System.out.println(obj2.name);
		System.out.println(obj2.height);
		obj2.name = "Amit";
		
		obj2.weight = obj.weight;
		System.out.println(obj2.name);
		System.out.println(obj2.weight);
		
		obj.humanBeingEats();
		obj2.humanBeingPlaysSport();

	}

	public void humanBeingEats() {
		System.out.println("Human being eats pizza");
	}

	public void humanBeingPlaysSport() {
		System.out.println("Human plays different sports");
	}
}
