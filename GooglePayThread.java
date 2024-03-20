package thread.synchronization.sleepwait;

public class GooglePayThread extends Thread
{
	
	private HSBCBank bankAccount;

	public GooglePayThread(HSBCBank bankAccount) 
	{
		
		this.bankAccount = bankAccount;
	}
	
	@Override
	public void run()
	{
		bankAccount.deposit(8000);
	}
	
}
