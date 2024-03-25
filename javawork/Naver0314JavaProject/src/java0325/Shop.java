package java0325;

public class Shop {
	private String name;
	private int su;
	private int dan;
	
	public Shop() {
		this("람보르기니",1,1000000000);
	}
	
	public Shop(String name) {
		this(name,1,1000);
	}
	
	public Shop(int su, int dan) {
		this("null",su,dan);
	}
	
	public Shop(String name, int su, int dan) {
		this.name = name;
		this.su = su;
		this.dan = dan;
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSu() {
		return su;
	}
	public void setSu(int su) {
		this.su = su;
	}
	public int getDan() {
		return dan;
	}
	public void setDan(int dan) {
		this.dan = dan;
	}
	
	public void setSangpum(String name, int su, int dan) {
		this.name = name;
		this.su = su;
		this.dan = dan;
	}

}
