package conditionalStatements;

public class SwitchCaseEx {
	public static void main(String[] args) {
		
		System.out.println("This program will tell the month if we give the input between 1 to 12 \n ");
		int matchMonth=12;
		switch(matchMonth) {
		case 1: {
			System.out.println("This is January");
			
			}break;
		case 2: {
			System.out.println("This is Feburary");
			
			}break;
		case 3: {
			System.out.println("This is March");
			
			}break;
		case 4: {
			System.out.println("This is April");
			
			}break;
		case 5: {
			System.out.println("This is May");
			
			}break;
		case 6: {
			System.out.println("This is June");
			
			}break;
		case 7: {
			System.out.println("This is July");
			
			}break;
		case 8: {
			System.out.println("This is August");
			
			}break;
		case 9: {
			System.out.println("This is September");
			
			}break;
		case 10: {
			System.out.println("This is October");
			
			}break;
		case 11: {
			System.out.println("This is November");
			
			}break;
		case 12: {
			System.out.println("This is December");
			
			}break;
			
		default:{
			System.out.println("sorry, you gave the wrong input. Try again");
			}
			
		}
	}

}
