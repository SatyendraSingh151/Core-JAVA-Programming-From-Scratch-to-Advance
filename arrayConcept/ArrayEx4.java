package arrayConcept;

public class ArrayEx4 {

	public static void main(String[] args) {
		// declaring an array without using the new keyword
		
		String names[] = {"Satyendra", "Nancy", "Satya","Ram","Sita"};
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i]);
		}
		System.out.println("\nNow the loop has ended.");
	}

}
