package thread.synchronization.sleepwait;

public class ATMThread extends Thread
{
	
	private HSBCBank bankAccount;

	public ATMThread(HSBCBank bankAccount)
	{
		
		this.bankAccount = bankAccount;
	}
	
	@Override
	public void run()
	{
		bankAccount.withdraw(12000);
	}
	
}
