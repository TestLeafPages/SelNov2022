package week3.day1;

public class SmartPhone extends AndroidPhone{
	
	public void connectWhatsApp() {
		System.out.println("Connect WhatsApp");
	}
	
	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone();
		sp.connectWhatsApp();
		sp.takeVideo();
		sp.makeCall();
		sp.sendMsg();
		sp.saveContact();
	}
}
