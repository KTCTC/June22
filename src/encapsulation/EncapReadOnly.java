package encapsulation;

public class EncapReadOnly {
	private int rollNum  = 12;
	private float marks = 45.5f;
	
	private String name = "KTCTC";
	private char div = 'A';
	
	public String getName() {
		return name;
	}


	public char getDiv() {
		return div;
	}
	
	public float getMarks()
	{
		return this.marks;
	}
		
	public int getRollNum()
	{
		return this.rollNum;
	}

}
