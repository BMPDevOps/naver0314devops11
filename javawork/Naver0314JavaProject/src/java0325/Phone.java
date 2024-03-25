package java0325;

public class Phone {
	private String model;
	private String color;
	
	
	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void bell() {
		System.out.println("bell");
	}
	
	public void sendVoice(String message) {
		System.out.println(message);
	}
	
	public void receiveVoice(String message) {
		System.out.println("re"+message);
	}
	
	public void hangUp() {
		System.out.println("disConnected");
	}
}
