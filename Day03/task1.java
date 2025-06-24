package Day3;

class SbiAc{
	private String Acholder;
	private int Balance;
	
	public SbiAc(String Acholder, int Balance) {
		this.Acholder=Acholder;
		this.Balance=Balance;		
	}
	public String getAcholder() {
		return Acholder;
	}
	public int getBalance() {
		return Balance;
	}
	public void Deposit(int Depo) {
		if(Balance>0) {
			Balance+=Depo;//balance=balance+deposit
			System.out.println("Deposited amt:"+Depo);
			System.out.println("Total amt:"+Balance);
		}
	}
	public void setAcholder(String Acholder) {
		this.Acholder=Acholder;
	}
	public void setWithdraw(int Withdraw) {
		Balance -= Withdraw;
		System.out.println("Withdrawn amt:"+Withdraw);
	}
}
public class Task1 {

	public static void main(String[] args) {
		SbiAc o=new SbiAc("JOHN", 25000);
		System.out.println("A/C holder name:"+o.getAcholder());
		o.setAcholder("RAKSHANA");
		System.out.println("Updated A/C holder name:"+o.getAcholder());
		System.out.println("A/C balance:"+o.getBalance());
		o.Deposit(5000);
		o.setWithdraw(2500);
		System.out.println("Available bal:"+o.getBalance());
	}

}
