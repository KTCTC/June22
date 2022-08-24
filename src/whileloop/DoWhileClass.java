package whileloop;

public class DoWhileClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		
		char chArr[] = {'a','b','f','r','3','D','$'};
		
		int j = chArr.length-1;
		do
		{
			System.out.println(chArr[j]);
			j--;
			
		}while(j>=0);
		
		
		int i=0;
		do
		{
			System.out.println(chArr[i]);
			i++;
		}while(i<chArr.length);
		
		
		int a = 7;
		
		do
		{
			System.out.println("Inside do while loop");
			a++;
			
		}while(a<10);
		

	}

}
