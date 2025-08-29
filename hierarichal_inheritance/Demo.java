package hierarichal_inheritance;
class Mobile{
	public void call() {
		System.out.println("I am able to connect to different peoples by my properties.");
	}
	
}

class Samsung extends Mobile{
	double price1=1502252;
	public void color() {
		System.out.println("Black colour with water format ,stylish look");
	}
	
}
class Iphone extends Mobile{
	public void security() {
		System.out.println("I have the best security features.");
		
	}
	public void brand() {
		System.out.println("High demanding brand phone.");
	}
	
	
}

public class Demo {

	public static void main(String[] args) {
		Samsung s =new Samsung();
		s.call();
		s.color();
		System.out.println("The price is :"+s.price1);
		
		System.out.println("\n************************\n");
		
		Iphone i = new Iphone();
		i.call();
		i.security();
		i.brand();

		
	}

}
