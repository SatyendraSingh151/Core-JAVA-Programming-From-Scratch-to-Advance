// This is multi-level inheritance

package multi_level_inheritance;
class GrandFather{
	String prop1="Purchased Land";
}

class Father extends GrandFather{
	String prop2="Build home";
	public void garden() {
		System.out.println("Build my own house.");
	}
}


public class Son extends Father{
	String prop3="Purchased Bike";
	public void business() {
		System.out.println("Established my own business.");
	}

	public static void main(String[] args) {
		// making this Son class object
		Son s = new Son();
		System.out.println("Property is : "+s.prop1);
		System.out.println("Property is : "+s.prop2);
		System.out.println("Property is : "+s.prop3);
		s.garden();
		s.business();

	}

}
