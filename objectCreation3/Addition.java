package objectCreation3;
//declaring  the static method in different class
class Sum{
	public static void sum() {
		System.out.println("This is the static method in different class");
		int x=5,y=10;
		System.out.println("The sum is = "+(x+y));
	}
}


public class Addition {

	public static void main(String[] args) {
		//calling the static method
		Sum.sum();
		

	}

}
