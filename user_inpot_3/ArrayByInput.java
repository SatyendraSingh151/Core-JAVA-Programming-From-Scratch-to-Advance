package user_inpot_3;
import java.util.Scanner;

public class ArrayByInput {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the size of an array to get the percentage.");
		int size = sc.nextInt();
		
//		array
		float arr[] = new float[size];
//		taking the user input
		System.out.println("Please enter the percentages of the students");
		for(int i =0;i<=size-1;i++) {
			arr[i] = sc.nextFloat();
		}
		System.out.println("The percentages of the students are :");
		for(float per : arr) {
			System.out.println(per);
		}
	}

}
