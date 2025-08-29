package object_class_Part3;

public class Person {
	String name;
	long mNo;
	long aadharNo;
	
	Person(String name, long aadharNo,long mNo){
		this.aadharNo=aadharNo;
		this.name=name;
		this.mNo=mNo;
		}
	@Override
	public boolean equals(Object o) {
//		doing the down-casting
		Person  p =  (Person)o;
		return (this.name==p.name) && (this.aadharNo==p.aadharNo) && (this.mNo==p.mNo);

		
	}
	
	@Override
	public String toString() {
		
		return "the address has been visited";
		
	}

	public static void main(String[] args) {
		Person  p1 = new Person("Satya", 564789,80456546);

		Person  p2 = new Person("Satya", 564789,80456546);

		System.out.println("Comparing both the persons, same or not : "+p1.equals(p2));
		
//		we can also get the address of the reference variable
//		we can also override the toString()
		System.out.println("\nAddress of first reference variable : "+p1);
		System.out.println("Address of second reference variable : "+p2);
		
//		we can also override the toString()

		
		
	}

}
