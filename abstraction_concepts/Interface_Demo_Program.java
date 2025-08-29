package abstraction_concepts;

// importing the Scanner class
import java.util.Scanner;


// declaring an interface

interface Parent5{
//	this can also have a default prefixed methods
	default void detail() {
		System.out.println("This is the default method in the interface");
	}
	
	void mul(int ...n);  // here compiler has added public abstract by default
}

public class Interface_Demo_Program  implements Parent5{
	
//	now we will override the abstract method
	@Override
	public void mul(int ...n) {
		int temp=1;
		for(int i : n) {
			temp = temp*i; 
		}
		System.out.println("\nThe multiplicatio of the passed digits are = "+ temp);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.print("Give the size of the no of digits you want to find the multiplication = ");
		int size =  sc.nextInt();
		int arr[]= new int[size];
		
//		giving the inputs for which we want to find the multiplication
		System.out.println("give the inputs for which we want to find the multiplication : ");
		for(int i= 0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		
//		the given elements are
		System.out.print("The given elements to perform the multiplication are : ");
		for(int i= 0; i<arr.length; i++) {
			System.out.print(arr[i]+", ");
		}
		
		Interface_Demo_Program m = new Interface_Demo_Program();
		
//		m.mul(7); // this was the direct value passed type
		
//		now passing the array elements to perform the multiplication
		m.mul(arr);

	}

}
