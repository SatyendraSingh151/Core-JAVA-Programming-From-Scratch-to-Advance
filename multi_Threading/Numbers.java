package multi_Threading;
// there is a runnable interface

public class Numbers implements Runnable {
	
//	we need to Override the run method
	@Override
	public void run() {
		for(int i=1; i<=10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		
		Numbers n= new Numbers();
//		start() is available in the Thread class
		Thread t = new Thread(n);
		t.start();

	}

}
