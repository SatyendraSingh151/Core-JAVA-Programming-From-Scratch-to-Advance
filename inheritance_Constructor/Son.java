package inheritance_Constructor;
class Father{
	Father(String name){
		System.out.println("Father's name is : "+name);
		
	}
	Father(String name ,double salary){
		this(name);
		System.out.println("The salary is : "+salary);
		
	}
	Father(String name ,double salary, String address) {
		this(name,salary);
		System.out.println("Address is : "+address);
		
	}
	Father(String name ,double salary, String address, String designation) {
		this(name,salary,address);
		System.out.println("Profession is : "+designation +"\n");
		
	}
	
}

public class Son extends Father {
	
	Son(String name, String designation){
//		super("Ramjee");
		super("Ramjee Singh", 95000,"Bihar","Hony. Captain");
		System.out.println("My name is : "+name);
		System.out.println("My profession is : "+designation );
	}

	public static void main(String[] args) {
		System.out.println("This is the controlling i.e. the main method\n");
		
		new Son("Satya","Student");

	}

}
