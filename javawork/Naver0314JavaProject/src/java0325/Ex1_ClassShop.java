package java0325;

public class Ex1_ClassShop {
	
	public static void writeShop(Shop []shop) {
		
		for(int i = 0; i<shop.length;i++) {
			System.out.println(shop[i].getName()+" "+shop[i].getSu()+" "+shop[i].getDan()+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shop []myShop = new Shop[4];
		myShop[0] = new Shop();
		myShop[1] = new Shop("딸기");
		myShop[2] = new Shop(3,2000);
		myShop[3] = new Shop("사과",5,3000);
		
		writeShop(myShop);
		
		System.out.println();
		
		myShop[0].setName("class");
		
		myShop[1].setSangpum("test",5,12000);
		
		writeShop(myShop);
	}	
}
