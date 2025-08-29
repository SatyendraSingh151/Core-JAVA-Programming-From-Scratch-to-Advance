package Index_Out_Of_Bounds_Exception;

public class String_Exception {

	public static void main(String[] args) {
		String str = "Satya Yadav";
		
		try {
			System.out.println(str.charAt(0));
			System.out.println(str.charAt(5));
			System.out.println(str.charAt(4));
			System.out.println(str.charAt(15));
			
		}
		catch(StringIndexOutOfBoundsException e ) {
			System.out.println("You are trying to fetch the character which does not exists.");
		}

	}

}
