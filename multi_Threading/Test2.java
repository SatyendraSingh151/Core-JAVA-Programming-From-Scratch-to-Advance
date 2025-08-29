package multi_Threading;
//there is a runnable interface


class Number2 implements Runnable {
	
//	we need to Override the run method
	@Override
	public void run() {
		for(int i=1; i<=10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
}
class Alpha implements Runnable {
	
//	we need to Override the run method
	@Override
	public void run() {
		for(char ch='A'; ch<='J'; ch++) {
			System.out.println(ch);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
 }

class EvenNo implements Runnable {
	
//	we need to Override the run method
	@Override
	public void run() {
		for(int i=1; i<=20;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
 }


public class Test2 {

	public static void main(String[] args) {

		Number2 n = new Number2();
		Alpha a = new Alpha();
		EvenNo e = new EvenNo();
		
		Thread t1 = new Thread(n);
		Thread t2 = new Thread(a);
		Thread t3 = new Thread(e);
		
		t1.start();
		t2.start();
		t3.start();

	}

}
