package week3.day1;

public class ICICI implements RBI{

	public void minBalance() {
		System.out.println("2000");
	}

	public void maxLoanAmount() {
		System.out.println("500000");
	}
	
	public void homeLoan() {
		System.out.println("3000000");
	}
	
	public static void main(String[] args) {
		SBI myBank = new SBI();
		myBank.minBalance();
//		myBank.homeLoan();
//		RBI rbi = new RBI();
		
		RBI bank = new ICICI();
		bank.minBalance();
	}

}
