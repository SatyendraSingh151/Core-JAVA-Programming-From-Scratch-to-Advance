package Array_concept;
import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {

//		declaration of the array by using the direct way
		int ar[] = {1,12,24};
		System.out.println("The element is : "+ar[0]);
		System.out.println("The element is : "+ar[1]);
		System.out.println("The element is : "+ar[2]+"\n");
		
//		declaration of the array by using the new keyword
		int arr[] = new int[5];
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		arr[4]=5;
		System.out.println(arr +"\n"); // this will give the address of the reference variable
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		
//		declaration of the array by taking the size from the user
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Give the desired size of the array : ");
		
		int size = sc.nextInt();
		
		int arr2[] = new int[size];
		
		System.out.println("Give the elements of the array.");
		for(int i=0; i<=arr2.length-1; i++) {
			arr2[i]=sc.nextInt();
		}
		
//		getting the array elements
		System.out.println("Getting the array elements.");
		for(int i=0; i<=arr2.length-1; i++) {
			System.out.println("Element "+i+" is = "+arr2[i]);
		}
		
		
	}

}
