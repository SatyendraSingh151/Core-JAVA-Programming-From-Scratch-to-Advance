package TypeCast;

public class ExplicitelyWidening {
	public static void main(String[] args) {
//		widening explixit
		
		int a=151;
		float f=(float)a;
		System.out.println("Changed value = "+ f);
		
//		int to double;
		int aaa=5;
		double d= (double)aaa;
		System.out.println(d);
		
		char c ='A';
		int b= (int)c;
		System.out.println(b);
		

	
		
//		char -double
		
		char cc='a';
		double dd = (double)cc;
		System.out.println("changed = " +dd);
		
//		int - float
		
		int aa= 151;
		float ff=(float)aa;
		System.out.println("changed = " +ff);
		
//		long - double
		
		long l=20000;
		double x =(double)l;
		System.out.println("changed = " +x);
		
	}

}
