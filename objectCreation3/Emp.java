package objectCreation3;
class Per{
	static void detail(){
		System.out.println("Satya is from Varanasi");
	}
}

public class Emp {

	public static void main(String[] args) {
		// accessing static method
		Per.detail();
		
//		now by object creation
		Per p1 = new Per();
		p1.detail();

	}

}
