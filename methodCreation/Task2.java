package methodCreation;

public class Task2 {
	public static void detail(String name, long pNo, String location) {
		System.out.println("Name : "+name);
		System.out.println("Phone no : "+pNo);
		System.out.println("Location : "+location);
		
	}

	public static void main(String[] args) {
		// calling method
		System.out.println("Here firstly JVM has called the main method and then the method is called here\n");
		detail("Satyendra Singh", 8004560467l, "Varanasi U.P.");

	}

}
