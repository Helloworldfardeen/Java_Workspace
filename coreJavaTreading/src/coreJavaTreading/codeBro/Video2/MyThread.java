package coreJavaTreading.codeBro.Video2;

public class MyThread extends Thread {
	@Override
	public void run() {
		for (int i = 10; i > 0; i--) {
			System.out.println("Thread #1 " + i);
			try {
				Thread.sleep(3000);
				System.out.println(1/0);
			} catch (InterruptedException e) {
				e.printStackTrace();
				System.out.println("thread one not interrupt another thread");
			}
			
		}
		System.out.println("Thread1 Is Executed SuccessFully :)");
	}

}
