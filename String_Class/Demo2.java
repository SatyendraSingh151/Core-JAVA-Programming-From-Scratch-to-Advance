package String_Class;

public class Demo2 {

	public static void main(String[] args) {
		String s = "Good Morning";
//		 getting the part of the String
		
		System.out.println(s.substring(5));
		System.out.println(s.substring(2));
		System.out.println(s.substring(1));
		System.out.println(s.substring(8));
		System.out.println(s.substring(0, 8));
		System.out.println(s.substring(2,5));
		System.out.println(s.substring(0, 3));
		System.out.println("\n**************\n");
		
//		concat()

		
		System.out.println(s.concat(" Satya"));
		String s1="Nancy";
		System.out.println(s1.concat(s));
		
		System.out.println("\n**************\n");
		
//		equals(); it checks based on the state
//		equalsIgnoreCase(); it ignores the case 
		
		String s2 = "nancy";
	
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		
		System.out.println("\n**************\n");
		
//		replace(); to replace a character or the set of chararcter
		
		String s3 = "Jammu Kashmir";
		System.out.println(s3.replace('m', 'o'));
		System.out.println(s3.replace("Jammu", "India's"));
		
		System.out.println("\n**************\n");
//		reverse a String
		
		for(int i=s3.length()-1; i>=0; i--) {
			System.out.print(s3.charAt(i) +" ");
		}
		
		System.out.println();
//		printing the characters of the String
		for(int i=0; i<s3.length();i++) {
			System.out.print(s3.charAt(i)+" ");
		}
		
		
		System.out.println("\n*******************\n");
		
//		convert String in array format
//		toCharArray(); this converts the given String into the array format
		
		String s4 ="JAVA Students";
		char arr[] = s4.toCharArray();
//		using for loop to fetch the array elements
		for(int i=0; i<=arr.length-1;i++) {
			System.out.print(arr[i] +" ");
		}
		System.out.println();
		
		
//		using forEach loop to fetch the array elements
		for(char x : arr) {
			System.out.print(x+" ");
		}
		
		System.out.println("\n********************\n");
		String s5 = "Hello students you all have to do your own work";
		System.out.println(s5.split(" "));
		
		String words[] = s5.split(" ");
		for(String x : words) {
			System.out.println(x);
		}
		
		System.out.println("*********");
		System.out.println(s5.split(" "));
		
		String words2[] = s5.split("a");
		for(String x : words2) {
			System.out.println(x);
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
		

}
