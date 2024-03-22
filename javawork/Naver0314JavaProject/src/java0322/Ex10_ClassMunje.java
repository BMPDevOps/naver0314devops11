package java0322;

class Member{
	private String name;
	private String hp;
	private String addr;
	
	public Member() {
		this("park","010-6201-9228","Changwon");
	}
	
	public Member(String name) {
		this(name,"010-6201-9228","Changwon");
		
	}
	
	public Member(String name, String hp) {
		this(name,hp,"Changwon");
		
	}
	
	public Member(String name, String hp, String addr) {
		this.name = name;
		this.hp = hp;
		this.addr = addr;
	}

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHp() {
		return hp;
	}
	public void setHp(String hp) {
		this.hp = hp;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	
}

public class Ex10_ClassMunje {
	
	public static void writeMember(Member m) {
		System.out.println("name: "+m.getName());
		System.out.println("hp: "+m.getHp());
		System.out.println("addr: "+m.getAddr());
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Member m1 = new Member();
		Member m2 = new Member("Bo");
		Member m3 = new Member("6201","Jinhae");
		Member m4 = new Member("Bo","6201","Jinhae");
		
		writeMember(m1);
		writeMember(m2);
		writeMember(m3);
		writeMember(m4);
		
		
		m1.setName("Bang");
		m1.setHp("010-6666-9999");
		m1.setAddr("Busan");
		
		writeMember(m1);
	}

}
