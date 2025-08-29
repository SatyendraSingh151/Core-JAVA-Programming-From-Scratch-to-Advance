package MultiThreading_Concept;

public class ThreadClass_Demo extends Thread {
	
	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println(i);
			
			
			try {
				Thread.sleep(600);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		
		ThreadClass_Demo n =new ThreadClass_Demo();
		
		n.start();
		
		
	}

}
