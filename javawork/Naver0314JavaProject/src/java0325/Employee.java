package java0325;

public class Employee {
	private String name, posistion;
	private int age,gibon,sudang;
	
	
	public Employee(){
		super();
	}
	
	public Employee(String name,String posistion, int age) {
		this.name =name;
		this.posistion = posistion;
		this.age = age;
	}
	
	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPosistion() {
		return posistion;
	}
	public void setPosistion(String posistion) {		
		this.posistion = posistion;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
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
	
	
	public void setPay(int gibon,int sudang) {
		this.gibon = gibon;
		this.sudang = sudang;
	}
	
	public void setSawon(String name, String posistion, int age) {
		this.name = name;
		this.posistion = posistion;
		this.age = age;
	}
	
	public int getNetPay() {
		return gibon + sudang;
	}

}
