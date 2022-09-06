package interfaceinjava;

public class HDFC implements ReserveBank{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ReserveBank rhd = new HDFC();
		
		rhd.currentAccountCharges();
		rhd.savingAccountCharges();
		
		
		HDFC hd = new HDFC();
		hd.savingAccountCharges();
		hd.currentAccountCharges();
		hd.personalAccount();

	}
	
	@Override
	public void savingAccountCharges() {
		
		System.out.println("HDFC bank charges 5000 for saving account");
	}

	@Override
	public void currentAccountCharges() {
		
		System.out.println("HDFC bank charges 20000 for current account");
	}
	
	public void personalAccount()
	{
		System.out.println(" HDFC charges 50000 for personal account");
	}

	@Override
	public int m() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void currancyExchangeRate() {
		 System.out.println("Currency exchange rate of HDFC is 1.2%");
		
	}

}
