package java0322;

public class Sawon {
	private String name;
	private int gibon;
	private int sudang;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGibon() {
		return gibon;
	}
	public void setGibon(int gibon) {
		this.gibon = gibon;
	}
	public int getSudang() {
		return sudang;
	}
	public void setSudang(int sudang) {
		this.sudang = sudang;
	}
	
	public void setSawon(String name,int gibon,int sudang) {
		setName(name);
		setSudang(sudang);
		setGibon(gibon);
	}
	
	public int getNetPay() {
		int pay = 0;
		pay=gibon-(gibon*3/100)+sudang;
		return pay;
	}
	
	

}
