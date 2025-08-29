package multi_Threading;

public class MultiThreading_Demo2 extends Thread {

	@Override
	public void run() {
		for(int i=1; i<=10;i++) {
			System.out.println(i);
			try {
				Thread.sleep(450);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		for ( char c='A';c<='E';c++ ) {
			System.out.println(c);
//			calling the sleep() -> static method which is present in Thread class
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
				System.out.println("Some exception occured");
			}
		}
	}
	public static void main(String[] args) {
		
		MultiThreading_Demo2 m = new MultiThreading_Demo2();
		m.start();
		
	}

}
