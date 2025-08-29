package constructor_overloading;

public class Employee {

	Employee() {
		System.out.println("This is the group of Employees."); 
		
	}
	Employee(int size) {
		System.out.println("This is the group of "+size +"Employees.");
			
		}
	Employee(int size, double budget) {
		System.out.println("This is the group of "+size+ " Employees, having the overall budget as "+budget);
		
	}


	public static void main(String[] args) {
		Employee emp = new Employee();
			new Employee(15);
			new Employee(45,80000000);
	

	}

}
