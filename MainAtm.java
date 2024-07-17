package oops;
import java.util.*;
public class MainAtm {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		AtmMachinee atm=new AtmMachinee(50000,1245);
		
			
		System.out.println("1.CheckBalance  2.CashWithdraw   3.CashDeposite   4.Create New Pin  5.Transation History");
		for(;;)
		{
			switch(sc.nextInt())
			{
			case 1:
				atm.checkBalance();
				break;
				
			case 2:
				System.out.println("enter amount:" );
				int amount=sc.nextInt();
				atm.cashWithdraw(amount);
				break;
				
			case 3:
				System.out.println("enter amount:" );
				int amount1=sc.nextInt();
				atm.cashDeposite(amount1);
				break;
				
			case 4: 
				atm.changepin();
				break;
				
			case  5:
				atm.displaytransacationhistory();
				break;
				
				
				
				default:System.out.println("invalid account");
			}
			
		}
		
	}

}
