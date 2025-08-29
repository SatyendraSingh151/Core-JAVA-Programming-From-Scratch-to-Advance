package Threw_Exception_By_Programmar;

class OwnDeclaredException extends RuntimeException{

}
	
class Content2{
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if ( age>=18)
			this.age = age;
		else 
			throw new OwnDeclaredException(); 
	}
	
}


public class Creation_Of_Our_Own_Exception {
	
		public static void main(String[] args) {

			
			Content2 s = new Content2();
			s.setAge(19);
		
			System.out.println("The age given by the student is :"+s.getAge());

			
			Content2 s2 = new Content2();
			s2.setAge(14);
		
			System.out.println("The age given by the student is :"+s2.getAge());

		}

	}



