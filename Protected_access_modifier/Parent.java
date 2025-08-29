package Protected_access_modifier;

public class Parent {
	protected static long phno=1456789945;
	
	protected String name = "Satya";
	protected void details() {
		System.out.println("The student is from Varanasi and the  name is : "+name);
	}

	public static void main(String[] args) {
		System.out.println("The phone no is : "+phno);
		
		Parent p = new Parent();
		System.out.println("The given name is : "+p.name);
		p.details();

	}

}
