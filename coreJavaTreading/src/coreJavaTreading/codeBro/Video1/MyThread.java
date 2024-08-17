package coreJavaTreading.codeBro.Video1;

public class MyThread  extends Thread{
	@Override
	public void run()
	{
//		System.out.println("This Thread is running..");
  ///////////////////////////////////////////////////////
		if(this.isDaemon())
		{
			System.out.println("DeamonThread");
		}
		else
		{
			System.out.println("UserThread");
		}
	}



}
