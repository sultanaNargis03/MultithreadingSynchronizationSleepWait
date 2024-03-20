package thread.synchronization.sleepwait;

public class PhonePayThread extends Thread
{

	private HSBCBank bankAccount;

	public PhonePayThread(HSBCBank bankAccount) 
	{
		
		this.bankAccount = bankAccount;
	}
	
	@Override
	public void run()
	{
		bankAccount.checkbalance();
	}
}
