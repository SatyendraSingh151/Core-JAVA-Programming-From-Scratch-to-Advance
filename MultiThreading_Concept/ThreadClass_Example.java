package MultiThreading_Concept;

//we need to extends the Thread class, and Override the run() which is void type
/*
 * Thread class has multiple methods like 
 * non static method -> run(), start(), when we call start() then it calls the run() internally
 * static method -> sleep(), this is used to control the printing on the console
 */

public class ThreadClass_Example extends Thread  {
	
	@Override
	public void run() {
		for(int i=1; i<=10;i++) {
			System.out.println(5+" * " + i+" = "+5*i);
			
//			to delay the printing statement we need to call the static method sleep available in the Thread class
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println("Error has occured");
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		
		ThreadClass_Example t = new ThreadClass_Example();
//		we need to call the start(), to run the run() internally
		
		t.start();
		

	}

}
