package abstraction_Interface;

interface Check{
	
	public static final int rNo=151;
	int id=97; // this is also public static final by default
	
	public abstract void show();
	
	void dance(); // here public abstract is by default
	
}

public class Demo implements Check {
	
	@Override
	public void show() {
		System.out.println("The show begins now.");
	}
	
	@Override
	public void dance() {
		System.out.println("Dance is a good exercise.");
	}

	public static void main(String[] args) {
		// making the object  for the child class
		
		System.out.println("Accessing the static variable, roll no : "+rNo);
		System.out.println("Id is: "+Check.id);
		Demo d = new Demo();
		
		d.show();
		d.dance();

	}

}
