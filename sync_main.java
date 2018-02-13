
public class sync_main {
	public static void main(String[] args) throws InterruptedException
	{
		SYNC sync=new SYNC();
		
		Thread thread1=new Thread(sync);
		Thread thread2=new Thread(sync);
		
		thread1.start();
		thread2.start();
	}

}
