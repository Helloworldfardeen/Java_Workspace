package coreJavaTreading.codeBro.Video1;

public class Main {
	public static void main(String[] args) {

//		//Thread thread1 = new Thread();
//	//	System.out.println(thread1.activeCount());
		/*
		 * System.out.println(Thread.activeCount());
		 * Thread.currentThread().setName("testing");
		 * System.out.println(Thread.currentThread().getName());
		 * Thread.currentThread().setPriority(10);
		 * System.out.println(Thread.currentThread().getPriority());
		 * System.out.println(Thread.currentThread().isAlive()); for(int i =3;i>0;i--) {
		 * System.out.println(i); try { Thread.sleep(10000);//millisec. } catch
		 * (InterruptedException e) { e.printStackTrace(); } }
		 * System.out.println("You are Done!..");
		 */
//		understad the flow of program because  here the priority
//		inherite the main thread priority
//		Thread.currentThread().setPriority(10);
		MyThread t1 = new MyThread();
	

		/*
		 * System.out.println(t1.isAlive());
		 * //print false because you MyThread is not
		 * Running t1.start(); 
		 * t1.run();
		 * System.out.println(t1.isAlive());
		 */
//		t1.setName("CodeBro");
//		System.out.println(t1.getName());
//		System.out.println(t1.getPriority());// default priority 5
//		Thread.currentThread().setPriority(10);
		//Understand the flow of diagram bro...
//		System.out.println(t1.getPriority());
//		System.out.println(Thread.currentThread().getPriority());
	    t1.start();
		System.out.println(Thread.activeCount());
		
	}

}
