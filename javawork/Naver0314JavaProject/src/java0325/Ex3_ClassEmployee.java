package java0325;

public class Ex3_ClassEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee [] em = {
			new Employee(),
			new Employee("강호동","사원",30),
			new Employee("유재석","과장",30),
			new Employee("박지성","부장",30),
			new Employee("송흥민","차장",30),
			new Employee("이강인",23)
		};
		
		em[0].setName("이광수");
		em[0].setPosistion("이사");
		em[0].setAge(55);
		em[0].setGibon(340);
		em[0].setSudang(20);
		
		em[1].setPay(450,100);
		em[1].setSawon("이덕배","계장",41);
		
		em[1].setPay(410,80);
		
		em[2].setPay(560,120);
		
		em[3].setPay(560,120);
		
		em[4].setPay(500,10);
		
		em[5].setPay(520,10);
		
		em[5].setPosistion("사원");
		
		
		for(int i = 0; i<em.length; i++) {
			System.out.println("name: "+em[i].getName());
			System.out.println("posistion: "+em[i].getPosistion());
			System.out.println("age: "+em[i].getAge());
			System.out.println("gibon: "+em[i].getGibon());
			System.out.println("sudang: "+em[i].getSudang());
			System.out.println("netPay: "+em[i].getNetPay());
			System.out.println();
		}
	}

}
