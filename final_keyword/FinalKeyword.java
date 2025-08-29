package final_keyword;

public class FinalKeyword {
	
	final int sin_0=0;


	public static void main(String[] args) {
		FinalKeyword f = new FinalKeyword();
		
//		sin_0=1;   it will give CTE, we cannot change the final value
		System.out.println("The value of sin 0 is : "+f.sin_0);
		

	}

}
