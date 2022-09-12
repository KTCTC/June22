package wrapper;

public class FloatWrapper {

	public static void main(String[] args) {
		
		String str = "56.4";
		
		System.out.println(Float.BYTES);
		System.out.println(Float.MAX_VALUE);
		System.out.println(Float.MIN_VALUE);
		
   float ff = Float.parseFloat(str);
   System.out.println(ff);
   
   Float ft = new Float(str);
   
   Float f = new Float(23.4f);
   
   f = 45.34f;
   System.out.println(f);
   
	}

}
