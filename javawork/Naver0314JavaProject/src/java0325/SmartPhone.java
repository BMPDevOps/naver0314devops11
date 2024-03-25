package java0325;

public class SmartPhone extends Phone{
	
	private boolean wifi;

	public boolean isWifi() {
		return wifi;
	}

	public void setWifi(boolean wifi) {
		this.wifi = wifi;
		System.out.println("Wifi Change");
	}
	
	public SmartPhone(String model, String color) {
		super();
		this.setModel(model);
		this.setColor(color);;
	}
	
	public void internet() {
		System.out.println("Internet Connected");
	}
	
	

}
