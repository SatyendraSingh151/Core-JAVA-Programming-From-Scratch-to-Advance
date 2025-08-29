package MultiThreading_Concept;

public  class Runnable_Thread_Class implements Runnable {
	@Override
	public void run() {
		for(int i=1; i<=10;i++) {
			System.out.println(i);
			Thread.yield();
		}
		try {
			Thread.sleep(4000);
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws InterruptedException {

		Runnable_Thread_Class ref = new Runnable_Thread_Class();
		Thread t  = new Thread(ref);
		t.start();
		for(int i='a'; i<='j';i++) {
			System.out.println((char)i);
			Thread.sleep(3000);
		}
		

	}

}
