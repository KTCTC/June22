package wrapper;

public class CharWrapper {

	public static void main(String[] args) {

Character ch = new Character('A');

 boolean f1 =  Character.isDigit(ch);
System.out.println(f1);
boolean f2 = Character.isLowerCase(ch);
System.out.println(f2);

boolean f3 = Character.isUpperCase(ch);
System.out.println(f3);

boolean f4 = Character.isLetter(ch);
System.out.println(f4);
		  
	}

}
