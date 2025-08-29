package conditionalStatements;

public class IfElseDecisionMaking {

	public static void main(String[] args) {
		
//		even and odd no
		
		int no = 16;
		
		if(no%2!=0) {
			
			System.out.println("This is odd no.");
			
		}
		else {
			System.out.println("This is even no.");
		}
		
		
//		nagative and positive no
		
		int aa=15;
		if(aa<0) {
			System.out.println("This is negative  no.");
		}
		else {
			System.out.println("This is positive no.");
		}
		
		
//		comparing the marks
		
		int marks=37;
		if(marks>=35) {
			System.out.println("This student is pass in the examinations. Congratulations!");
		}
		else {
			System.out.println("This student is fail in the examinations.");
		}
		
//		using multiple check conditions
		int marksGrade = 99;
		if(marksGrade>=90) {
			System.out.println("Scored Grade A .");
		}
		else if(marksGrade>=70) {
			System.out.println("Scored Grade B.");
		}
		else if(marksGrade>=50) {
			System.out.println("Scored Grade C.");
		}
		else if(marksGrade>=30) {
			System.out.println("Scored Grade D.");
		}
		else{
			System.out.println("Scored Grade E, and failed .");
		}
		
		
//		comparing a b and c
		
		int a=55,b=155,c=20;
		if(a>b && a>c) {
			System.out.println(" a is greater than b and c .");
		}
		else if(b>c && b>a) {
			System.out.println(" b is greater than a and c .");
		}
		else {
			System.out.println(" c is greater than a and b .");
		}
		
		
//		now checking positive or negative no
		
		int xyz=10;
		if(xyz>0) {
			System.out.println(xyz+" is a positive no.");
		}
		else if(xyz<0) {
			System.out.println(xyz+" is a negative no.");
		}
		else {
			System.out.println(xyz+" is neither negative nor positive no.");
		}

	}

}
