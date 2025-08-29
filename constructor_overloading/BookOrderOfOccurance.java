package constructor_overloading;

public class BookOrderOfOccurance {

	BookOrderOfOccurance(String name,double price,int publishYear) {
		// This is the body of the constructor
		System.out.println("Book Name : "+name);
		System.out.println("Book Price : "+price);
		System.out.println("Book Publication Year : "+publishYear);
	}
	BookOrderOfOccurance(double price,String name,int publishYear) {
		// This is the body of the constructor
		System.out.println("Book Name : "+name);
		System.out.println("Book Price : "+price);
		System.out.println("Book Publication Year : "+publishYear);
	}
	BookOrderOfOccurance(double price,int publishYear,String name) {
		// This is the body of the constructor
		System.out.println("Book Name : "+name);
		System.out.println("Book Price : "+price);
		System.out.println("Book Publication Year : "+publishYear);
	}
	
	

	public static void main(String[] args) {
		// This is the main method
		new BookOrderOfOccurance("Devine",1502,1999);
		System.out.println("***********************");
		new BookOrderOfOccurance(1802,2002,"Verse");
		System.out.println("***********************");
		new BookOrderOfOccurance(1502,"Devine",1999);

	}

}
