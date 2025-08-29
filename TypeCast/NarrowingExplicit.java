package TypeCast;

public class NarrowingExplicit {
	public static void main(String[] args) {
//		float - int
		float f= 15.1f;
		int i = (int)f;
		System.out.println("changed value = "+ i);
		
//		double -int
		double d = 124.8996;
		int x=(int)d;
		System.out.println("changed value = "+ x);
		
		
//		char - byte
		char c ='a';
		byte b= (byte)c;
		System.out.println("changed value = "+ b);
		
//		double - char
		
		double dd= 69.298654;
		char bb =(char) dd;
		System.out.println("changed value = "+ bb);
	}

}
