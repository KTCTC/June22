package scopeofvariables;

public class ScopeClass {
	int a;
	static int b=9;
	
	public void sampleMethod()
	{
		System.out.println(a);
		System.out.println(b);
		int aa = 90;
		
		if (aa>2)
		{
			int ifaa = 77;
			System.out.println(aa);
			System.out.println(ifaa);
			
			for (int i=0; i<3; i++)
			{
				int foraa = 54;
				System.out.println(foraa);
				System.out.println(aa);
				System.out.println(ifaa);
				System.out.println(i);
				
				System.out.println(a);
				System.out.println(b);
				
			}
			
			for (int i=0; i<3; i++)
			{
				System.out.println(i);
			}
			System.out.println(foraa);
			System.out.println(i);
			
			
		}
		int ifaa = 770;
		System.out.println(ifaa);
		
		
		
		System.out.println(foraa);
		int z = 77;
		
	}
	
	public static void sampleStaticMethod()
	{
		
		System.out.println(b);
		
		int aa = 90;
		if (aa>2)
		{
			int ifaa = 77;
			System.out.println(aa);
			System.out.println(ifaa);
			
			System.out.println(b);
			for (int i=0; i<3; i++)
			{
				int foraa = 54;
				System.out.println(foraa);
				System.out.println(aa);
				System.out.println(ifaa);
				System.out.println(i);
				
				
				
			}
			
			for (int i=0; i<3; i++)
			{
				System.out.println(i);
			}
			System.out.println(foraa);
			System.out.println(i);
			
		}
		int ifaa = 770;
		System.out.println(ifaa);
		
		
		
		System.out.println(foraa);
		
	}


}
