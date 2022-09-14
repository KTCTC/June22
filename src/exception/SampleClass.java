package exception;

public class SampleClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int z = sampleMethod();
		System.out.println(z);

	}
	
	public static int sampleMethod()
	{
		int a = 3;
		int b = 0;
		try
		{
			int c = a/b;
			return 2;
		}
		catch(Exception e)
		{
			return 4;
		}
		
		finally
		{
			return 6;
		}
		
	}

}
