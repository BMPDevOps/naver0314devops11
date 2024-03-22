package java0322;

class Orange{
	private String name;
	private int age;
	private static String company = "j-meta";

	public String getName () {

		return this.name; //자기자신을 의미하는 인스턴스 변수(일반 맴버 변수에만 존재하며 static 에서는 없음)
	}

	public int getAge() {
		return this.age;
	}


	public void setName(String str) {
		this.name = str;
	}


	public void setAge(int num) {
		this.age = num;
	}

	public static String getCompany() {
		return company;
	}

}
public class Ex2_Object {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Orange og = new Orange();

		String str = "Hello World";
		int num = 30;

		og.setName(str);
		og.setAge(num);

		String msg = og.getName();
		int age = og.getAge();



		System.out.println(msg+"\n" + age);

		System.out.println(Orange.getCompany());

	}
}
