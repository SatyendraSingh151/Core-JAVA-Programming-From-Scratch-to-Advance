package nancy;

class Person{
	
	private double mobilenumber;
//	getter for mobile number
    public double getMobilenumber()
    {
    	return mobilenumber;
    }
    

//    setter for mobile number
    public void setMobilenumber(double mobilenumber) {
    this.mobilenumber=mobilenumber;
    
    }


	
	
}

public class Person_DEtail {

	public static void main(String[] args) {
    Person n=new Person();
    
//    यहा पर बिना value दिए print कर रहे हो 
    
    System.out.println("mobilenumber :"+n.getMobilenumber());
    
//    अब यहा वैल्यू पास किए गया है 
    n.setMobilenumber(734889439);
    
//    now printing  the passed value 
    System.out.println("The updated mobile no is : "+n.getMobilenumber());
    
	}

}