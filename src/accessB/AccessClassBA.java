package accessB;

import accessA.AccessClassAA;

public class AccessClassBA {

	public static void main(String[] args) {
		
		AccessClassAA priva = new AccessClassAA(34);
		AccessClassAA protec = new AccessClassAA("Protected String");
		AccessClassAA defaul = new AccessClassAA(true);
		
		 AccessClassAA obj = new AccessClassAA();
		    System.out.println(obj.publicInt);
		    System.out.println(obj.privateInt);
		    System.out.println(obj.protectedInt);
		    System.out.println(obj.defaultInt);
		    obj.publicMethod();
		    obj.privateMethod();
		    obj.protectedMethod();
		    obj.defaultMethod();
	}

}
