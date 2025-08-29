package String_Class;

public class Demo {

	public static void main(String[] args) {


		String s = "Hello World";
//		to count the length
		System.out.println("The length of the string is : "+s.length());
		
		System.out.println("\n*****************\n");
//		to convert into the upper case
		System.out.println("Upper case  : "+s.toUpperCase() );
		
		System.out.println("\n*****************\n");
//		to lower case
		System.out.println("Lower case  : "+s.toLowerCase());
		
		System.out.println("\n*****************\n");
//		string is immutable
		System.out.println("Original form of the string cannot be changed : "+s);
	
		System.out.println("\n*****************\n");
//	to print the each individual character
		for(int i=0; i<s.length(); i++) {
			System.out.print(s.charAt(i)+"  ");
		}
		
		System.out.println("\n*****************\n");
//		to print the reverse individual character
		for(int i=s.length()-1; i>=0; i--) {
			System.out.print(s.charAt(i) +" ");
		}
		
		System.out.println("\n*****************\n");
//		getting the index of the char
		System.out.println("\nGetting the index of character : "+s.indexOf('d'));

		System.out.println("\n*****************\n");
//		getting the last index of the char
		System.out.println("Getting the last index : "+s.lastIndexOf('l'));
		
		System.out.println("\n*****************\n");
//		checking whether the string starts with the given pattern
		System.out.println("Checking start with or not : "+s.startsWith("Hello"));
		
		System.out.println("\n*****************\n");
//		checking whether the string ends with the given pattern
		System.out.println("Checking ends with or not : "+s.endsWith("o"));
		System.out.println("Checking ends with or not : "+s.endsWith("ld"));

		System.out.println("\n*****************\n");
		System.out.println("converting the char to int : "+(int)'a');
		
		System.out.println("\n*****************\n");
		System.out.println("converting the char to int : "+(int)'A');
		
		System.out.println("\n*****************\n");
//		check the pattern available in the String or not
		System.out.println("Checking the pattern available or not : "+s.contains("llo"));
	}

}
