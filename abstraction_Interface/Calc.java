package abstraction_Interface;

interface Add{
	/* public abstract void sum(int a, int b);  or*/
	void sum(int a, int b);
}
interface Sub{
	public abstract void sub(int a , int b);
}

public class Calc implements Add,Sub {
	@Override
	public void sum(int a, int b) {
		System.out.println("The sum is : "+(a+b));
	}
	
	@Override
	public void  sub(int a, int b) {
		System.out.println("The Substraction is : "+(a-b));
		
	}
	public static void main (String [] args) {
		
		Calc c = new Calc();
		c.sum(45, 250);
		c.sub(10, 5);
	}

}
