package encapusalation;
class Person{
	private long mno;
	
//	making getter
	public long getMno(){
//		returning the value
		return mno;
		
	}
	
//	making setter
	
	public void setMno(long mno) {
//		initializing the data
		
		this.mno=mno;
		
	}
}

public class PersonTest {

	public static void main(String[] args) {
		// making object
		
		Person p = new Person();
		p.setMno(800456111);
		System.out.println("Mobile no is : "+p.getMno());

	}

}
