package methodCreation;

public class CalculatorReturnType {
	

	
		
		public static int sum(int a, int b) {
			return a + b;
			
		}
		public static int sub(int a, int b) {
			return a - b;
			
		}
		public static int mul(int a, int b) {
			return a * b;
			
		}
		public static int div(int a, int b) {
			return a / b;
			
		}
		public static int mod(int a, int b) {
			return a % b;
			
		}

		public static void main(String[] args) {
			//calling methods
			int x=20,y=5;
			System.out.println("The sum is = "+sum(x,y));
			System.out.println("The substraction is = "+sub(x,y));
			System.out.println("The multiplication is = "+mul(x,y));
			System.out.println("The division is = "+div(x,y));
			System.out.println("The modulos is = "+mod(x,y));
		}

	}



