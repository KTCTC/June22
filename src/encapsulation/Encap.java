package encapsulation;

public class Encap {
	private int rollNum;
	private float marks;
	
	private String name;
	private char div;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getDiv() {
		return div;
	}

	public void setDiv(char div) {
		this.div = div;
	}
	
	
	public void setMarks(float marks)
	{
		if (marks<0)
		{
			this.marks = 0;
		}
		else if(marks>100)
		{
			this.marks = 100;
		}
		else
		{
			this.marks = marks;
		}
	}
	
	public float getMarks()
	{
		return this.marks;
	}
	
	
	public void setRollNum(int rollNum)
	{
		if (rollNum<1)
		{
			System.out.println("You have entered wrong Roll number please enter roll number greater than 1");
			this.rollNum = 0;
			
		}
		else
		{
			this.rollNum = rollNum;
		}
		
		
	}
	
	public int getRollNum()
	{
		return this.rollNum;
	}

}
