package abstraction_concepts;

// importing the Scanner class to take the user input
import java.util.Scanner;


// making a interface
interface Calculator_Parent{
	
//	declaration of the abstract methods in the interface
	void sum(int ...n); // here compiler writes the  method as public abstract void sum(int ...n);
	void sub(int ...n);
	void mul(int ...n);
	void div(double a,double b);
	void mod(double a, double b);
	
}



public class Interface_Switch_Case_Child implements Calculator_Parent{
	
//	overriding the abstract methods declared in the interface in the child class implemented the interface
	@Override
	public void sum(int ...n) {
		int temp=0;
		for(int x : n) {
			temp=temp+x;
			}
		System.out.println("The sum is = "+temp);
		}
		
		@Override
		public void sub(int ...n) {
			int temp=0;
			for(int x : n) {
				temp=temp+x;
				}
			System.out.println("The substraction is = "+temp);
			}
		
		@Override
		public void mul(int ...n) {
			int temp=1;
			for(int x : n) {
				temp= temp*x;
				
			}
			System.out.println("the multiplication is = "+ temp);
		}
		
		@Override
		public void div(double a,double b) {
			double temp;
			temp=a/b;
			System.out.println("the division is = "+ temp);
		}
		
		@Override
		public void mod(double a,double b) {
			double temp;
			temp=a%b;
			System.out.println("the remainder is = "+ temp);
		}
		
		
	

	public static void main(String[] args) {
//		making the Scanner class object and the reference to take the user input
		Scanner sc = new Scanner(System.in);
		
		System.out.println("you need to give the input for performing the operations of the calculator.");
		
		
//		declaration for the division and the remainder must be only two elements
		System.out.println("\n\nNOTE : For performing division and to find the remainder please pass only 2 elements in the data required");
		
//		asking the user to give the size of the element user is going to give
		System.out.print("\n\nNow give the size of no of element you are going to give = ");
//		now giving the size of the elements user is going to give
		int size = sc.nextInt();
		
		
//		declaration of the array
		int arr[]= new int[size];
		System.out.println("\nNow you need to give your elements you want to perform the operation.");
		for (int i=0; i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
//		fetching the elements of the array elements given
		System.out.print("The elements you gave to perform the operation are : ");
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		
//		asking the user the choice to perform the operation
		System.out.println("\nNow you need to pass the input from 1 to 5 to perform the calculator operations as mentioned below.");
		
		
		
		System.out.println("\n1 -> for addition\n2 -> for substraction\n3 -> for multiplication\n4 -> for division\n5 -> for remainder\n6 -> for  addition, substraction and multiplication together\n7 -> for division and remainder together");
		
//		asking the choice
		System.out.print("\nChoose the option from the direction given above  = ");
		int n=sc.nextInt();
		
//		making the object reference of the child class to call the calculator methods
		Interface_Switch_Case_Child c = new Interface_Switch_Case_Child();
		
//		now giving the switch case for the choice
		switch(n) {
				
				case 1 :{
					c.sum(arr);
					break;
				}
				case 2 :{
					c.sub(arr);
					break;
				}
				case 3 :{
					c.mul(arr);
					break;
					
				}
				
				case 4 :{
					double a=arr[0];
					double b =arr[1];
					c.div(a,b);
					break;
				}
				case 5 :{
					double a=arr[0];
					double b =arr[1];
					c.mod(a,b);
					break;
				}
				case 6:{
					c.sum(arr);
					c.sub(arr);
					c.mul(arr);
					break;
				}
				case 7 :{
					double a=arr[0];
					double b =arr[1];
					c.div(a, b);
					c.mod(a, b);
				}
				default:{
					System.out.println("\nSorry! you did wrong. Please try again and give the correct input.");
					}
				
				
				}

		
	}

	
		
}
