package switchstatement;

public class NestedSwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "SecondYear";
		int a = 2;

		switch (str) {

		case "FirstYear":
			System.out.println("Your subjects are BEE, AM, BME");

			switch (a) {

			case 3:
				System.out.println("Inside case 3");

				break;
			case 100:
				System.out.println("Inside case 1");

				break;
			case 2:
				System.out.println("Inside case 2");

				break;

			default:
				System.out.println("Case is not matched");
                break;
			}
			break;

		case "SecondYear":
			System.out.println("Your subjects are DT,Survey,Database, EY");
			if (a>2)
			{
				System.out.println("Sample if statement");
			}
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
