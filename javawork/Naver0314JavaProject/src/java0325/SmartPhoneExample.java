package java0325;

public class SmartPhoneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone sp = new SmartPhone("Galaxy","Silver");
		
		System.out.println(sp.getModel());
		System.out.println(sp.getColor());
		
		System.out.println(sp.isWifi());
		
		sp.bell();
		sp.sendVoice("Hello");
		sp.receiveVoice("Nice to meet you");
		sp.hangUp();
		
		sp.setWifi(true);

		sp.internet();
	}

}
