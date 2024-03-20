package thread.synchronization.sleepwait;

public class LaunchBankApp 
{
	public static void main(String[] args) 
	{
		HSBCBank alienAccount=new HSBCBank(8000);
//		HSBCBank alienAccount2=new HSBCBank(8000);
	
		
		ATMThread atm=new ATMThread(alienAccount);
		atm.setName("ATM");
		
		GooglePayThread gpay=new GooglePayThread(alienAccount);
//		GooglePayThread gpay=new GooglePayThread(alienAccount2); //object locking
		gpay.setName("GPay");
//		
//		PhonePayThread ppay=new PhonePayThread(alienAccount);
//		atm.setName("PPay");
//		
		atm.start();
		gpay.start();
//		ppay.start();
		
	}
}
