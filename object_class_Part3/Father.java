package object_class_Part3;

// here the Object class is imported by default from java.lang package

public class Father {
	
	String name = "Ramjee";
	long pNo = 24567847;
	
	@Override
	public String toString() {
		return "Father's name : "+name+"\nThe phone no is : "+pNo; 
		
	}

	public static void main(String[] args) {
		
		Father f = new Father();
		
		System.out.println("Details are :\n"+f); //here it takes the f.toString() by default
		
		System.out.println("\nThe details are :\n"+f.toString()); // toString is done explicitly
	
	}

}
