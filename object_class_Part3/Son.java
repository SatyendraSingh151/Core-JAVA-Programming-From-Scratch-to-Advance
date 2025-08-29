package object_class_Part3;

// here the Object class is imported by default from java.lang package

public class Son { //here the default parent is Object class by default
	
	String name;
	long pNo ;
	
//	 parameterized constructor
	
	Son(String name, long pNo){
		this.name=name;
		this.pNo=pNo;
	}
	
//	overriding the parent toString()
	
	@Override
	public String toString() {
		return "Name : "+name+"\nPhone no : "+pNo; 
		
	}

	public static void main(String[] args) {
		
		Son f = new Son("Satya",800456046);
		
		System.out.println("Details are :\n"+f); //here it takes the f.toString() by default
		
		System.out.println("\nThe details are :\n"+f.toString()); // toString is done explicitly
	
	}

}
