package Day04;

 //encapsulation



   class SBIAcc{

  	private String Accholder;

    	private int Balance;

    	

    SBIAcc(String Accholder, int Balance){

    	this.Accholder=Accholder;

    	this.Balance=Balance;

    }

   public String getAccholder() {

    	return Accholder;

    }

    public int getBalance() {

    	return Balance;

    }

    public void Deposit(int dep) {

    	if(Balance > 0) {

    		Balance+=dep;

    		System.out.println("Deposit account:"+dep);

    		System.out.println("Now Current Balance:" +Balance);

    	}

    }

    public void setAccholder(String Accholder) {

    	this.Accholder=Accholder;

    }

    public void setWithdraw(int Withdraw) {

      Balance -=Withdraw;

      System.out.println("withdrawn amount:"+Withdraw);

    }

    }

    

    public class BankDetails {

	public static void main(String[] args) {

	   SBIAcc acc=new SBIAcc("krithi",200000);

       System.out.println("Accound name:" +acc.getAccholder());

       acc.setAccholder("Pavi");

       System.out.println("Updated Accound name:"+acc.getAccholder());

       System.out.println("Current Balance:"+acc.getBalance());

       acc.Deposit(300);

       acc.setWithdraw(30000);

       System.out.println("Available :"+acc.getBalance());

	}



}

