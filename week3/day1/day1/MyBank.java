package week3.day1;

public class MyBank extends YesBank{

	public static void main(String[] args) {
		MyBank bank= new MyBank();
		bank.minBalance();
		bank.maxLoanAmount();
	}

	public void maxLoanAmount() {
		System.out.println("100000");
	}

	public void homeLoan() {
		
	}
}
