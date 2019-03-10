package question2;

public class SumWorker implements Runnable
{
	private long m = 0;
	private long n = 0;
	private long sum = 0;
	@Override
	public  void run() {
		// TODO Auto-generated method stub
		for( long i = m ; i <= n ; i++ )
		{
			this.sum += i;
		}
	}
	public void setNumber(long m, long n)
	{
		this.m = m;
		this.n = n;
	}
	public long getSum()
	{
		return this.sum;
	}
}
