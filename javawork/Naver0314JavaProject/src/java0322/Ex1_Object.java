package java0322;


class Apple{
	String name = "Hong";
	final static int MAX =100;
}

public class Ex1_Object {
	
	String name = "Hong";
	final static int MAX =100;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ex1_Object ob = new Ex1_Object(); // ob가 인스턴스 변수
		
		
		System.out.println(ob.name);
		System.out.println(MAX);  // 같은 클래스에서는 클래스 명 필요 없음
		
		Apple apple = new Apple();
		
		System.out.println(apple.name);
		
		System.out.println(Apple.MAX);
		
		
	}

}
