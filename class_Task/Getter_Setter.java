package class_Task;
class Demo{
	private double payment;
	private String bank;
	
	
//	Getter for the Bank
	public String getBank() {
		return bank;
	}
//	setter for the bank
	public void setBank(String bank) {
		this.bank = bank;
	}
	
//	getter for the payment
	public double getPayment() {
		return payment;
	}
	
//	setter for the payment
	public void setPayment(double payment) {
		this.payment = payment;
	}
	
	
}

public class Getter_Setter {
	
	public static void main(String[] args) {
//		making the object for the Demo class
		
		Demo d = new Demo();
		d.setPayment(98500);
		d.setBank("SBI");
		
		System.out.println(d.getPayment());
		System.out.println("Account exists in the : "+d.getBank());
		
	}

}
