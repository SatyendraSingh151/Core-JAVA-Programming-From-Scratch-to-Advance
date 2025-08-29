package operators;

public class PostDecrement {
	public static void main(String[] args) {
		int a= 4;
		int b = 9;
		int c = ++a + --a + ++b + b--;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
	}
	

}
