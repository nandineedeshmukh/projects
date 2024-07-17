package oops;
import java.util.ArrayList;
import java.util.Scanner;
public class AtmMachinee {
	Scanner sc=new Scanner(System.in);
	 double balance;
	 int PIN;
	 ArrayList<String>trans_history;
	public AtmMachinee(double balance, int pIN) {
		
		this.balance = balance;
		this.PIN = pIN;
		this.trans_history=new ArrayList<>();
	}
	

	public AtmMachinee() {
		// TODO Auto-generated constructor stub
	}

//this method check account balance
	public void checkBalance()
	{
		System.out.println(PIN);
		 System.out.println("your balance :"+ balance);	 
	 }
	
	//method to withdrew catch
	public void  cashWithdraw(int amount)
	{
       if(amount<balance && amount>0)
       {
       	System.out.println(balance);
   		balance=balance-amount;
   		trans_history.add("Withdrew $"+amount);
   		System.out.println("balance after Withdraw"+balance);
       }
       else
       {
       	System.out.println("insufficient amount");
       }

	}

	//method to deposite cash
	public void  cashDeposite(int amount)
	{
		if(amount>0)
		{
			System.out.println(balance);
			balance=balance+amount;
			System.out.println("balance after deposite"+balance);
			trans_history.add("Deposited: $"+amount);
		}
		else
		{
			System.out.println("invaild deposite amount");
		}
	}
	public void  changepin()
	{
		System.out.println("create new pin:");
		int newpin=sc.nextInt();
		
		this.PIN=newpin;
		System.out.println("new pin is:"+PIN);
		
	}
	public void displaytransacationhistory()
	{
		System.out.println("Transation History");
		for(String s: trans_history)
		{
			System.out.println(s);
		}
	}

	


}
