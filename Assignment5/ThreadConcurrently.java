package Assignment5;


class MultiThreaded implements Runnable {

	public void run() {
		
		for(int i=0;i<=100;i++) {
			System.out.println("Current thread name: " + Thread.currentThread().getName() + " " + i);
		}
	}
	
}
public class ThreadConcurrently {
	
	public static void main(String[] args) {
		
		MultiThreaded multiThread = new MultiThreaded();
		Thread thread1 = new Thread(multiThread, "Thread1");
		Thread thread2 = new Thread(multiThread, "Thread2");
		Thread thread3 = new Thread(multiThread, "Thread3");
		
		thread1.start();
		thread2.start();
		thread3.start();
		
	}

}

