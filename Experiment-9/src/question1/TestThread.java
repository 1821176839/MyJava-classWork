package question1;

public class TestThread
{
	public static void main (String []args) throws InterruptedException
	{
		ReceiveMailRunnable receiveTest = new ReceiveMailRunnable();
		SendMailRunnable sendTest = new SendMailRunnable();
		
		Thread receiveTest1 = new Thread(receiveTest);receiveTest1.start();
		Thread receiveTest2 = new Thread(receiveTest);receiveTest2.start();
		Thread receiveTest3 = new Thread(receiveTest);receiveTest3.start();
		Thread sendTest1 = new Thread(sendTest);sendTest1.start();
		Thread sendTest2 = new Thread(sendTest);sendTest2.start();
		Thread sendTest3 = new Thread(sendTest);sendTest3.start();
		
		receiveTest1.join();
		receiveTest2.join();
		receiveTest3.join();
		sendTest1.join();
		sendTest2.join();
		sendTest3.join();
		
		System.out.println("foxmail任务结束");
	}
}
class ReceiveMailRunnable implements Runnable
{

	@Override
	public void run()
	{
		// TODO Auto-generated method stub
		Thread thread = Thread.currentThread();
		int randomNumber = (int)(10+Math.random()*(20-10+1));
		for( int i = 0 ; i < randomNumber ; i++ )
		{
			System.out.printf("I am receiving emails ((%d/%d)-%s-) \n",i,randomNumber,thread.getName());
			try 
			{
				Thread.sleep(1000);
			} catch (InterruptedException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.printf("========当前线程-%s-正在退出========\n", thread.getName());
	}
}
class SendMailRunnable implements Runnable
{

	@Override
	public void run()
	{
		// TODO Auto-generated method stub
		Thread thread = Thread.currentThread();
		int randomNumber = (int)(10+Math.random()*(20-10+1));
		for( int i = 0 ; i < randomNumber ; i++ )
		{
			System.out.printf("I am sending emails   ((%d/%d)-%s-) \n",i,randomNumber,thread.getName());
			try 
			{
				Thread.sleep(1000);
			} catch (InterruptedException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.printf("========当前线程-%s-正在退出========\n", thread.getName());
	}
}
class EndMail implements Runnable
{

	@Override
	public void run(){};

	public void join() {
		// TODO Auto-generated method stub
		System.out.printf("========foxmail任务结束========\n");
	}
	
}