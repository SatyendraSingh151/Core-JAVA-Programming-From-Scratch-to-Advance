package encapusalation;
class Product{
	
	private double price;
	
//	getter for price
	public double getPrice() {
		return price;
	}
	
//	setter for price
	public void setPrice(double price) {
		if(price>0) {
			this.price=price;
		}
		else {
			System.out.println("you have given the invald price kindly try again.");
		}
	}
}

public class ProductTest  {

	public static void main(String[] args) {
		// making the object
		
		Product p = new Product();
		p.setPrice(8000000);
		System.out.println("The price is : "+p.getPrice());

	}

}
