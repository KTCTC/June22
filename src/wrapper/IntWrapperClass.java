package wrapper;

public class IntWrapperClass {

	public static void main(String[] args) {
		
		
		System.out.println(Integer.BYTES);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		String str = "45";
		
		int gh = Integer.parseInt(str);
		System.out.println(gh);
		
		Integer val = new Integer(str);
		
		System.out.println(val);

     Integer a = new Integer(23);
     
     Integer b = new Integer(44);
     Integer d = 89;
     
     int x = b;
     
     System.out.println(x);
     System.out.println(b);
     
     
     b = 777;
     
     System.out.println(b);
     
    
		int z = a.intValue();
		System.out.println(z);
		
		a = a.valueOf(67);
		
		

	}
	
	
	

}

/*
class Integer
{
	private final int value;
	
	public Integer(int a)
	{
		value=a;
	}
		
	public int  intValue()
	{		
		return this.value;
	}
	
	
	public Integer valueOf(int a)
	{
		Integer ob = new Integer(a);
		
		return ob;
	}
	
}
*/

