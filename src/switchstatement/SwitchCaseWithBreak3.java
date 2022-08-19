package switchstatement;

public class SwitchCaseWithBreak3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String str = "firstyear";
	
	switch(str)
	{

	case "FirstYear":
		System.out.println("Your subjects are BEE, AM, BME");
		break;

	case "SecondYear":
		System.out.println("Your subjects are DT,Survey,Database, EY");
		break;
	case "ThirdYear":
		System.out.println("Your subjects are Hydrology, Ecad, Java,TOM,TOC");
		break;
	case "ForthYear":
		System.out.println("Your subjects are STQA, Project, ML, IT,CND");
		break;
	
		default:
			System.out.println("You are YD student");
	break;
	}

	}

}
