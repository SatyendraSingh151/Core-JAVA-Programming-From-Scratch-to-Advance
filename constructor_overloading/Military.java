package constructor_overloading;
class Army{
	Army(){
		System.out.println("Yes you can join the Indian Army");
		
	}
	Army(int age){
		System.out.println("Yes you can join the Indian Army, and the minimum age should be 18 and you are of "+age+" years.");
		
	}
}

public class Military {

	public static void main(String[] args) {
		// This is the main block
		new Army();
		System.out.println("***************************");
		new Army(22);
		

	}

}
