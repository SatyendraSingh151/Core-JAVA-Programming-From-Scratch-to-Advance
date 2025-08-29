package Index_Out_Of_Bounds_Exception.copy;

public class Array {

	public static void main(String[] args) {
		int arr[]= {5,4,5,6,7,6};
		try {
			System.out.println(arr[0]);
			System.out.println(arr[2]);
			System.out.println(arr[1]);
			System.out.println(arr[3]);
			System.out.println(arr[6]);
		}
		catch(ArrayIndexOutOfBoundsException e ) {
			System.out.println("You are trying to fetch the element which does not exists.");
		}
	}

}
