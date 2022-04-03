package week3.day1.assignment;

public class AxisBank extends BankInfo {

	public double deposit(double intrest) 
	{
		return intrest;
	}	

	
	
	public static void main(String[] args) {
		
		AxisBank axisbank =new AxisBank();
		System.out.println(axisbank.deposit(10));
		
		// here given amount is shown as interest which is overridden in axisbank class, if we want to return the method written in Bank info class, we can create an object for bankinfo class
		
		BankInfo bankinfo = new BankInfo();
		System.out.println(bankinfo.deposit(10));
		// here given amount is shown as interest+2 which is actual method written in bank info class
	}

}
