package encapusalation;

class Emp{
	private double sal;
	private String joinMonth;
	
//	making getter for sal and joinMonth
	public double getSal() {
		return sal;
		
	}
	public String getjoinMonth() {
		return joinMonth;
		
	}
	
//	making setter for sal and joinMonth
	
	public void setSal(double sal) {
		this.sal=sal;
	}
	public void setJoinMonth(String joinMonth) {
		this.joinMonth=joinMonth;
	}
}

public class EmpTest {

	public static void main(String[] args) {
		//making object of the Emp class here
		
		Emp e = new Emp();
//		giving the value
		e.setSal(90000);
		e.setJoinMonth("January");
		System.out.println("The salary is : "+e.getSal());
		System.out.println("The joining month is : "+e.getjoinMonth());

	}

}
