package Polymorphism_Whole_Concept;

// declaration of the class
class Factory{
	
//	declaration of the non static method to calculate the sum of the data passed by user
	public void sum() {
		int a =5,b=10;
		System.out.println("The default sum of fixed default value "+a+" and "+b+" is = "+(a+b));
	}
	
	public void sum(int a, int b) {
		
		System.out.println("The sum of "+a+" and "+b+" is = "+(a+b));
	}
	
	public void sum(int a, int b, int c) {
			
			System.out.println("The sum of "+a+", "+b+" and "+c+" is = "+(a+b+c));
		}
//	taking multiple formal arguments
	public void sum(int ... a) {
		int temp = 0;
		for(int i=0;i<a.length;i++) {
			temp = temp+a[i];
		}
		System.out.println("The sum of the data given is = "+temp);
	}
	
}
 
public class Method_Overloading_Having_Same_Name {

	public static void main(String[] args) {
		
//		making the object of the class having the multiple methods having the same name
		Factory f  =new Factory();
		f.sum();
		f.sum(4,2);
		f.sum(4,4,4);
		f.sum(2,2,2,2,2,2,2,2,2,2,2);

	}

}
