package Encapsulation_Concept;


// making a class having private members which cannot be accessed in other class other than using the getter and the setter
class Superior{
	private String bankName;
	private String customerName;
	private long accountNo;
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public long getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}
	
}


public class Encapsulation_Of_Bank_Account_Example {

	public static void main(String[] args) {
		
//		making the object of the class in which the private members are available
		Superior sr = new Superior();
		
/*		setting the values of the private non static variables by the help of the setter made in the class 
 * 		having the non static members by the help of object reference
 */
		sr.setAccountNo(4561234);
		sr.setBankName("SBI");
		sr.setCustomerName("Satya Yadav");
		
/*		getting the values of the private non static variables by the help of the setter made in the class 
 * 		having the non static members by the help of object reference
 */
		System.out.println("The customers name is : "+sr.getCustomerName());
		System.out.println("Account available in the bank is : "+sr.getBankName());
		System.out.println("Thw account no of the customer is : "+sr.getAccountNo());
	}

}
