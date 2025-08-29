package objectConcept2;

public class Book {
	String author;
	double price;
	

	public static void main(String[] args) {
	  
		Book b1 = new Book();
		b1.author="Satya";
		b1.price=1500;
		System.out.println("The author of this book is "+b1.author +"and the price is "+b1.price);
		System.out.println("******************************");
	}

}
