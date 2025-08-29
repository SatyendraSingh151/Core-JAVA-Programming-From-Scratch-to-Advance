package Protected_access_modifier_Test;
import Protected_access_modifier.*;

public class Child extends Parent {

	public static void main(String[] args) {
		Child c = new Child();
		c.details();
		System.out.println("The phno is : "+c.phno);
		System.out.println("The given name was : "+ c.name);
		

	}

}
