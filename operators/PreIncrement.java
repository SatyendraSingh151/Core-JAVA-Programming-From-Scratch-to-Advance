package operators;

public class PreIncrement {
	public static void main(String[] args) {
		int n=6;
		int x=++n + ++n;
		
		System.out.println("n = " + n);
		System.out.println("x = " + x);
		
		
		int a=7;
		int b= 5;
		int c = ++a +  a++ + ++b + b++;
		int d = c++ + 2;

		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println("d = " + d);
		
//		
//		
//		int e=4;
//		int f= e++ + e++;
//		System.out.println("e = " + e);
//		System.out.println("f = " + f);
	}

}
