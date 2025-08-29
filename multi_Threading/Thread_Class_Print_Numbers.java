package multi_Threading;

/* Thread is a class present in java.lang package
Thread class contains run()->this is non static method, which is @Override in child class

there is start()->this is non static method, when we call start() it calls the run() internally

there is sleep()-> this is  static method, which controls the speed in given time, time is given in milisecond
Thread.sleep()-> this will give checked exception

*/

public class Thread_Class_Print_Numbers extends Thread {

	@Override
	public void run() {
		for(int i=1; i<=10;i++) {
			System.out.println(i);
			
//			calling the sleep() -> static method which is present in Thread class

			try {
				Thread.sleep(800);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		

		Thread_Class_Print_Numbers n =new Thread_Class_Print_Numbers();
		n.start();
	}

}
