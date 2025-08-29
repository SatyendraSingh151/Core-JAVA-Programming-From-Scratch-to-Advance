package inheritance;

class Person{
	public void breath() {
		System.out.println("Yes, breaths oxygen.");
	}
	public void eats() {
		System.out.println("Yes, eats food.");
	}
}

public class Emp extends Person{
	public static void main(String[] args) {
//		making parent object
		Person p = new Person();
		p.breath();
		p.eats();
		
		System.out.println("*******************");
		
//		making child as object
		Emp e =new Emp();
		e.breath();
		e.eats();
	}

}
