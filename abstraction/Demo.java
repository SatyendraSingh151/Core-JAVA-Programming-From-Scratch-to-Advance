package abstraction;

abstract class Test{
//	non static variable
	String color;
	
//	abstract non static method
	abstract void t();
	
//	Parent constructor
	Test(String color){
		this.color= color;
		System.out.println("The updated color of the parent constructor  is : "+color);
	}
	
//	static block of the Parent
	static{
		System.out.println("This is the static block of the abstract class.");
	}
	
}

public   class Demo extends Test{
	@Override
	 void t() {
		System.out.println("This is the overriden methood of the abstract class.");
	}
	
	
//	child constructor
	Demo(){
		super("Green");
		System.out.println("This is the child constructor");
	}
	
//	non static block of the child
	{
		System.out.println("This is the Non- Static block of the abstract class.");
	}
	
	
	public static void main(String[] args) {
//		making the child class object reference
		Demo d = new Demo();
		d.t();
		
		

	}

}
