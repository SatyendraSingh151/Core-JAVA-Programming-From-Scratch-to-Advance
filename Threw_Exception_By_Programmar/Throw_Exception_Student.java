package Threw_Exception_By_Programmar;

class Content{
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if ( age>=18)
			this.age = age;
		else 
			throw new RuntimeException(); 
	}
	
}

public class Throw_Exception_Student {
	

	public static void main(String[] args) {
		Content s = new Content();
		s.setAge(18);
	
		System.out.println("The age given by the student is :"+s.getAge());

	}

}
