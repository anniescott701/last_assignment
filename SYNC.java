
public class SYNC implements Runnable{

	@Override
	public synchronized void run() {
		int i=0;
		// TODO Auto-generated method stub
		while(i<=1000)
		{
			System.out.println(Thread.currentThread());
			System.out.println(i);
			i++;
		}
	}

}
