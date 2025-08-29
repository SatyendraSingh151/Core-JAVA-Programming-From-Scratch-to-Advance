package Exception_Handeling_Concept;

import java.util.Scanner;
//this is the example of the IOException program

public class IO_Exception_For_StringIndexOutOfBoundsException {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Now give the String = ");
		String name = sc.nextLine();
		
		for(int i=0; i<name.length();i++) {
			System.out.print(name.charAt(i)+" ");
		}
		
//		from here trying to access the out of bounds index 
		try {
			System.out.println(name.charAt(name.length()));
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println("\nHey! you are trying to access the index which is not there. The exception is handled here. Now you can relax.");
		}		
	}

}
