package looping;

public class NameByWhile {

	public static void main(String[] args) {
		 int i=1;
         while(i<6){
             System.out.println("*");
             i++;;
		}
         
         
         int no=50;
         while(no<=100) {
        	 System.out.println(no);
        	 no++; 
         }
         
         int x=5;
         while(x>=1) {
        	 System.out.println(x);
        	 x--;
        	 
         }
         
         
//         check evenNo
         
         System.out.println("\nProgram for  even no\n ");
         
         int evenNo =1;
        
         while(evenNo<=10) {
        	 if(evenNo%2==0) {
        		 System.out.println(evenNo);
        	 }
        	 evenNo++;
         }
         
         
         

	}

}
