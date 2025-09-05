package constructor_Topics;
class Father{
//	declaration of the non static variable
	int rollNo;
	String name;
	long phNo;
	String course;
	
//	making the parent constructor
	Father(){
		System.out.println("This is the default constructor of the parent class.");
	}
	
//	making the parameterized constructor
	Father(int rollNo){
		this.rollNo = rollNo;
	}
	
//	making the parameterized constructor
	Father(int rollNo,String name){
		this(rollNo);
		this.name = name;
	}
	
//	making the parameterized constructor
	Father(int rollNo, String name, long phNo){
		this(rollNo,name);
		this.phNo=phNo;
		
	}
	
//	making the parameterized constructor
	Father(int rollNo,String name,long phNo,String course){
		this(rollNo,name,phNo);
		this.course=course;
	}
	
//	making a  non static method
	public void details() {
		System.out.println("Roll no : "+rollNo+", Name : "+name+", Phone No :"+phNo+" and the course : "+course);
	}
	
}

public class Constructor_Methodloading_Example extends Father{
	
//	calling the parent constructor by the help of child constructor
	Constructor_Methodloading_Example(){
//		using the super() call method to call the parent constructor
		super(151,"Satya Yadav",8004560467l,"B.Tech");
		System.out.println("Calling the parent constructor from the child constructor");

	}
	

	public static void main(String[] args) {
		// constructor overloading 
		
//		making the object of the Father class showing the parent and the child relationship
		Constructor_Methodloading_Example c1 = new Constructor_Methodloading_Example();
		
		c1.details();
		
	}

}
