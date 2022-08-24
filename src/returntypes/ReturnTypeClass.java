package returntypes;

public class ReturnTypeClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		int aa[] = {34,45,67};
		int bb[] = {304,22,21};
		ReturnTypeClass obj = new ReturnTypeClass();
		
		int[] result = obj.addArrays(aa, bb);

         for (int each:result)
         {
        	 System.out.println(each);
         }
		
		
		String ss = obj.concateMethod("Welcome to ", "KTCTC ", 2022);
		System.out.println(ss);
		
		float fl = obj.substraction(23.4f, 22);
		System.out.println(fl);

		int a = addition();
		System.out.println(a);

	}
	
	public int[] addArrays(int[] a, int[] b)
	{
		int[] add = new int[a.length];
		for (int i = 0; i<add.length;i++)
		{
			add[i] = a[i] + b[i];
		}
		
		return add;
	}

	public static int addition() {
		int c = 22 + 33;
		System.out.println("addition is = " + c);
		return 34;

	}

	public float substraction(float a, int b) {
		float c = a - b;

		return c;
	}
	
	public String concateMethod(String str1, String str2, int a)
	{
		String data = str1+str2+a;
		return data;
	}

	public char multiplication() {

		return 'A';
	}
}
