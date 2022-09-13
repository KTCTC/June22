package stringclass;

public class StringClass2 {

	public static void main(String[] args) {
		
		// charAt(), length(),endsWith(" "),startsWith(),replace(),split(" "),trim(),subString(),contains(),equals(),
				//concate(),equalsIgnoreCase(String another),toLowerCase(),toUpperCase()
        String data = "Showing 1-10 of total 3484 records";
		String str1 = "Welcome to KTCTC";
		String str2 = "    Welcome to     KTCTC     ";
		
		char[] chArr = str1.toCharArray();
		
		System.out.println(str1.split(" ")[0].toUpperCase().charAt(4));
		
		String ss8 = str1.toUpperCase();
		System.out.println(ss8);
		
		String ss7 = str1.toLowerCase();
		System.out.println(ss7);
		
		boolean f5 = str1.equalsIgnoreCase("Welcome to ktctc");
		System.out.println(f5);
		String ss6 = data.concat(str1);
		System.out.println(ss6);
		
		boolean f4 = str1.equals("Welcome to KTCTC");
		System.out.println(f4);
		boolean f3 = str1.contains("to KTCTC");
		System.out.println(f3);
		String ss5 = str1.substring(1, 8);
		System.out.println(ss5);
		String ss4 = str1.substring(8);
		System.out.println(ss4);
		
		String ss3 = str2.trim();
		System.out.println(ss3);
		String[] aarr = data.split(" ");
		int count = Integer.parseInt(aarr[4]);
		System.out.println(count);
		String[] arr = str1.split("to ");
		System.out.println(arr[0]);
		String ss2 = str1.replace("to", str2);
		System.out.println(ss2);
		str1 = str1.replace('T', '2');
		String ss1 = str1.replace('T', '2');
		System.out.println(ss1);
		
		boolean f2 = str1.startsWith(str2);
		System.out.println(f2);
		boolean f1 = str1.endsWith("to KTCTC");
		System.out.println(f1);
		
		for (int i=str1.length()-1;i>=0;i--)
		{
			System.out.println(str1.charAt(i));
		}
		
		for (int i=0;i<str1.length();i++)
		{
			System.out.println(str1.charAt(i));
		}
		
		 int lgn = str1.length();
		 System.out.println(lgn);
		  char ch = str1.charAt(8);
		  System.out.println(ch);
		
		
		
    
	}

}
