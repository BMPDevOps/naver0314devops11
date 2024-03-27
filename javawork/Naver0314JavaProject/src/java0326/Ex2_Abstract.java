package java0326;

abstract class Ele {
	public abstract void power();
	
	public abstract void repair();
	
}

interface screen {
	void tounch();
	void swape();
}

abstract class Phone extends Ele {
	@Override
	public void power() {
		// TODO Auto-generated method stub
		System.out.println("충전기");
	}
	
	@Override
	public void repair() {
		// TODO Auto-generated method stub
		System.out.println("사람");
	}
	
	public abstract void call();
	
	public abstract void message();
}


class SmartPhone extends Phone implements screen{

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("전화 중");
	}

	@Override
	public void message() {
		// TODO Auto-generated method stub
		System.out.println("문자 중");
	}

	@Override
	public void tounch() {
		// TODO Auto-generated method stub
		System.out.println("터치");
	}

	@Override
	public void swape() {
		// TODO Auto-generated method stub
		System.out.println("슬라이드");
		
	}
	
}

public class Ex2_Abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ele el = new SmartPhone();
		
		el.power();
		el.repair();
		((SmartPhone)el).call();
		((SmartPhone)el).message();
		
	

	}

}
