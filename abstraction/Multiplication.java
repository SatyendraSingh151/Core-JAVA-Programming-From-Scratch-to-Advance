package abstraction;

 abstract class Calc{
//		defining the abstract method
	 abstract void mul(int a, int b);
	 abstract void div(int a, int b);
	 abstract void mod(int a, int b);
	 abstract void add(int a, int b);
	 abstract void sub(int a, int b);
	 
 }

	 
// making the abstract class
public  class Multiplication extends Calc{
	
	@Override
	 void mul(int a, int b) {
		System.out.println("The multiplication of "+a+ " and "+b+" is : "+(a*b));
	}
	
	@Override
	 void div(int a, int b) {
		System.out.println("\nThe division of "+a+ " and "+b+" is : "+(a/b));
	}
	@Override
	 void mod(int a, int b) {
		System.out.println("\nThe modulos of "+a+ " and "+b+" is : "+(a%b));
	}
	@Override
	 void add(int a, int b) {
		System.out.println("\nThe addition of "+a+ " and "+b+" is : "+(a+b));
	}
	@Override
	 void sub(int a, int b) {
		System.out.println("\nThe substraction of "+a+ " and "+b+" is : "+(a-b));
	}

	public static void main(String[] args) {
		
		Multiplication m = new Multiplication();
		m.mul(5, 4);
		m.add(45, 50);
		m.sub(50, 40);
		m.mod(52, 10);
		m.div(72, 4);


	}

}
