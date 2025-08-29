package Exception_Handeling_Concept;

import java.util.Scanner;
// this is the example of the IOException program

public class IO_Exception_For_ArrayIndexOutOfBoundsException {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Give the size of the array = ");
		
		int size = sc.nextInt();
		
//		declaration of the array
		int arr[] = new int[size];
		
		System.out.println("Now give the elements of the array.");
		for(int i=0; i<arr.length;i++) {
			arr[i] = sc.nextInt();
			}
		
		
//		now accessing the array elements
		System.out.print("The elements of the given array is : ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(" "+arr[i]);
		}
		
//		from here trying to access the out of bounds index 
		try {
			System.out.println(arr[arr.length]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("\nHey! you are trying to access the index which is not there. The exception is handled here. Now you can relax.");
		}
		
//		declaration of the finally block-> this is the must execution of the code
		
		finally {
			System.out.println("\nThis is the finally block of the Exception handeling.");
		}
		
		
		
		

	}

}
