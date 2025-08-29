package MultiThreading_Concept;



public class MultiThreading_Name_Printing  extends Thread{
	
	@Override
	public void run() {
		for (int i='A';i<='Z';i++) {
//			for(int j ='A';j<='Z';j++) {
				
			
			if(i=='S'||i=='A'||i=='T'||i=='Y'||i=='D'||i=='V') {
//				System.out.println((char)i);
				if(i=='S')
					System.out.print("S ");
				else if(i=='A')
					System.out.print("a ");
				else if(i=='T')
					System.out.print("t ");
				else if(i=='Y')
					System.out.print("y ");
				else if(i=='A')
					System.out.print("a ");
//			}
		  }
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
	}
	

	public static void main(String[] args) {
		
		MultiThreading_Name_Printing ref = new MultiThreading_Name_Printing();
		ref.start();

	}

}
