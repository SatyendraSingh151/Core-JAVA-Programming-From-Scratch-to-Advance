package MultiThreading_Concept;



// it needs to extend the Thread class as the methods are present in the Thread class which needs to be override
public class Thread_Creation extends Thread {

//	overriding the run() non static method of the Thread class
	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println(i);
			System.out.println((char)i);
			
//			now making the screen delay by calling the sleep() which is the static method present in Thread class
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	

	public static void main(String[] args) {
		
		
//		creating the object reference of the child class
		Thread_Creation c = new Thread_Creation();
		
//		now calling the start() method of Thread class which will call the run() internally
		c.start();
		

	}

}
