package java0325;

class Member{
	private String memberName;
	private int memberCount;
	
	
	public Member() {
		this("Club",10);
	}
	
	public Member(String memberName, int memberCount) {
		this.memberName = memberName;
		this.memberCount = memberCount;
	}
	
	public void writeMember() {
		System.out.println(this.memberName);
		System.out.println(this.memberCount);
	}
}

class SubMember extends Member{
	private String myName;
	private int myAge;
	
	SubMember(){
		this.myName = "Null";
		this.myAge = 20;
	}
	
	SubMember(String memberName,int memberCount, String myName, int myAge){
		super(memberName,memberCount);
		
		this.myName = myName;
		this.myAge = myAge;
	}
	
	@Override
	public void writeMember() {
		// TODO Auto-generated method stub
		super.writeMember();
		System.out.println(this.myName);
		System.out.println(this.myAge);
	}
}


public class Ex7_Inheri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SubMember sm = new SubMember("Club",100,"Park",25);
		
		sm.writeMember();

	}

}
