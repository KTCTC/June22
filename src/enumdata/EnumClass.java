package enumdata;

public class EnumClass {
	
	public enum WorkingDays {MON,TUE,WED,THE,FRI};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		YearsOfEngg.sample();// we can also have method inside enum data type
		System.out.println(YearsOfEngg.FORTHYEAR);
		
		System.out.println(WorkingDays.MON);
		
		WorkingDays a;
		
		a = WorkingDays.WED;
		
		System.out.println(a);
		
		
		String str = "firstyear";
		
		YearsOfEngg yer = YearsOfEngg.FIRSTYEAR;
		
		switch(YearsOfEngg.THIRDYEAR)
		{

		case FIRSTYEAR:
			System.out.println("Your subjects are BEE, AM, BME");
			break;

		case SECONDYEAR:
			System.out.println("Your subjects are DT,Survey,Database, EY");
			break;
		case THIRDYEAR:
			System.out.println("Your subjects are Hydrology, Ecad, Java,TOM,TOC");
			break;
		case FORTHYEAR:
			System.out.println("Your subjects are STQA, Project, ML, IT,CND");
			break;
		
			default:
				System.out.println("You are YD student");
		break;
		}

		

	}

}
