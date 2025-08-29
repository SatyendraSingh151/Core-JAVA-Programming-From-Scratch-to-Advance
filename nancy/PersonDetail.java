package nancy;


class Person3{
	
	private double mno;
	
	public double getMno()
	{
		return mno;
		
	}
	
	public void setMno(double mno)
	{
		this.mno=mno;
	}

}
	public class PersonDetail {

		public static void main(String[] args) {
		
			Person3 p=new Person3();
			p.setMno(102939930);
			System.out.println("mno :"+p.getMno());
			
			
		   
		    
		}

}
