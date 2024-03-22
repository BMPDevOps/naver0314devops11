package java0322;


class Stu{
	String name ="ee";
	String blood="A";
	int age = 12;
}

public class Ex6_CallByReference {
	
	public static void chageStu(Stu s) {
		
		s.name="park";
		s.age=20;
	}
	
	public static void main(String[] args) {
		
		Stu s = new Stu();
		
		System.out.println(s.name+" "+s.age);
		
		chageStu(s);
		
		System.out.println(s.name+" "+s.age);
		
	}

}
