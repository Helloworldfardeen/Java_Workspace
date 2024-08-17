package coreJavaTreading.codeBro.Video2;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		// create a subclass of thread
		MyThread thread1 = new MyThread();
		// OR ||
		// Implement Runnable interface and pass instance as an argument to thread
		// class.
		MyRunnable runnable1 = new MyRunnable();
		Thread thread2 = new Thread(runnable1);
//		thread1.setDaemon(true); if we set deamon thread than it will not execute fully 
//		thread2.setDaemon(true); because JVM does not care at all they execute or not because 
		// they are no more user thread thats why
		thread1.start();
//	    thread1.join();// used for wait until will we complete
		thread1.join(5000);
		thread2.start();
		System.out.println(1 / 0);// Thread will Continue To Execute

	}

}
