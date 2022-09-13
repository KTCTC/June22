package stringclass;

public class StringClass {

	public static void main(String[] args) {

    String str1 = "Welcome";    
    String str2 = new String("Welcome");
    String str3 = "Welcome";    
    String str4 = new String("Welcome");
    String str5 = new String("Welcome to");
    
    String str6 = "Welcome to";
    
    boolean f1 = str1==str2;
    System.out.println(f1);
    boolean f2 = str1==str3;
    System.out.println(f2);
    boolean f3 = str2==str4;
    System.out.println(f3);
    
   boolean f4 = str1.equals(str4);
   System.out.println(f4);
    
    
	}

}
