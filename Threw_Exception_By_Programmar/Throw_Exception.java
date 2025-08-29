package Threw_Exception_By_Programmar;

class Check{
	private double price;
	private String brand;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if(price>0) {
			this.price = price;
		}
		else {
			throw new RuntimeException ();
		}
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	
	

}

public class Throw_Exception {

	public static void main(String[] args) {
		
		Check ref = new Check();
		ref.setBrand("Samsung");
		ref.setPrice(48759.45);
		
		System.out.println("The mobile phone is of "+ref.getBrand()+" brand and it's price is "+ref.getPrice());
	
		

	}

}
