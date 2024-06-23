package pack2;

public class Switchcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * switch (expression) 
		 * { case 1: // statement to execute
		 *  break;
		 * 
		 * case 2 :
		 *  // statement to execute
		 *   break;
		 * 
		 * default: 
		 * // statement to execute 
		 * break;
		 *  }
		 */
		
		
		int monthNumber = 6;
		String monthName;
		
		switch (monthNumber)
		{
		case 1: 
			System.out.println("january");
			break;
		case 2 :
			System.out.println("feb");
			break;
		case 3 :
			System.out.println("Mar");
			break;	
		case 4 :
			System.out.println("April");
			break;
		case 5 :
			System.out.println("May");
			break;
		case 6:
			System.out.println("June");
			break;
		case 7 :
			System.out.println("July");
			break;
		default:
			System.out.println("None of case is matching so default value has came ");
			break;
			}
		
		System.out.println("the switch case has been over");
	}

}
