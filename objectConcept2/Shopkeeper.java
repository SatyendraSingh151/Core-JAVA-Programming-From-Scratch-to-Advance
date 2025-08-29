package objectConcept2;

public class Shopkeeper {
	public void sugar() {
		System.out.println("Give 5 kg sugar, and this is available in the non-static method");
	}

	public static void main(String[] args) {
		// making the object for the non-static method
		Shopkeeper s1= new Shopkeeper();
		s1.sugar();

	}

}
