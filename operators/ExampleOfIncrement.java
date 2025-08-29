package operators;

public class ExampleOfIncrement {
	public static void main(String[] args) {
		int n=5;
		int x=2;
		int m=n++ + x++;
		System.out.println("n = " + n);
		System.out.println("x = " + x);
		System.out.println("m = " + m);
		
		int a=4;
		int b= 7;
		int c = a++ +  10 + b++;
		int d = c++;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println("d = " + d);
		
		
		int e=4;
		int f= e++ + e++;
		System.out.println("e = " + e);
		System.out.println("f = " + f);
	}

}
