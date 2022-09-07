package accessB;

import accessA.AccessClassAA;

public class AccessCLassBB extends AccessClassAA{
	
	public AccessCLassBB()
	{
		super("Inside child const");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessClassAA priva = new AccessClassAA(34);
		AccessClassAA protec = new AccessClassAA("Protected String");
		AccessClassAA defaul = new AccessClassAA(true);
		
		AccessCLassBB obj = new AccessCLassBB();
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
