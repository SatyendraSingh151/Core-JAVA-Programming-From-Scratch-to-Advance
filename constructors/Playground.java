package constructors;

public class Playground {
	String nameOgGround;

	Playground(String n) {
		nameOgGround=n;
		
	}

	public static void main(String[] args) {
		// making object
		Playground plyg= new Playground("Bhojpur Ground");
		System.out.println("Ground name is : "+plyg.nameOgGround);

	}

}
