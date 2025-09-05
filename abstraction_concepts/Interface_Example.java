package abstraction_concepts;

//  declaration of a interface 
interface Superior_Parent1{
	public abstract void details();
	public abstract void task();
}

//  declaration of the second interface
interface Superior_Parent2{
	public abstract void details();
	public abstract void task();
}


// Here showing the example of the multiple inheritance which is solved by the interface

public class Interface_Example implements Superior_Parent1,Superior_Parent2{
	@Override
	public void details() {
		System.out.println("This is the details of the two interface all together.");
	}
	
	@Override
	public void task() {
		System.out.println("This is the task of the two interface.");
	}

	public static void main(String[] args) {
		// making the object of the child class who implements the interface 
		Interface_Example ref = new Interface_Example();
		
//		now here we are calling the method of the interface which shows the multiple inheritance by the help of interface
		
		ref.details();
		ref.task();
	}

}
