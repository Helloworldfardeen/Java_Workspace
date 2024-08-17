package coreJavaTreading.codeBro.Video1;

public class DeamonThread {
	public static void main(String[] args) {
		MyThread t2 = new MyThread();
		t2.setDaemon(false);
		System.out.println(t2.isDaemon());
		t2.start();
	}

}
