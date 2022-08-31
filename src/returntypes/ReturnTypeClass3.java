package returntypes;

public class ReturnTypeClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		

		int aa = sub(22);
		System.out.println(aa);
		
	}
	
	public int add()
	{
		int c = 90+45;
		
		return c;
		
	}
	
	
	public static int sub(int a)
	{
		if (a>10)
		{
			return 2;
		}
		else
		{
			return 4;
		}
		
		return 3;
		
	}
}
