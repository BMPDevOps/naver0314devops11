package java0322;


class Kiwi{
	
	String name;
	int pay;
	
	public Kiwi(String name,int pay) {
		System.out.println(name + " " +pay);
		
		this.name = name;
		this.pay = pay;
	}
}

public class Ex8_Constructor {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Kiwi kw = new Kiwi("kiwi",3000);
		
		System.out.println(kw.name);
		
		System.out.println(kw.pay);
		

	}

}
