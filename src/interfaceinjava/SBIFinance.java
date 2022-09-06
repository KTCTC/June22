package interfaceinjava;

public class SBIFinance extends SBI{

	public static void main(String[] args) {

		
		ReserveBank rSBIF = new SBIFinance();
		
		rSBIF.currentAccountCharges();
		rSBIF.savingAccountCharges();
	
		
		
       SBI sb = new SBIFinance();
       sb.currentAccountCharges();
       sb.savingAccountCharges();
       sb.janDhanAccount();
       
       
       
		SBIFinance oo = new SBIFinance();
		oo.currentAccountCharges();
		oo.savingAccountCharges();
		oo.janDhanAccount();
		oo.bikeLoan();

	}
public void bikeLoan()
{
	System.out.println("SBI finance charges 9% interest on bike loan");}
}
