package java0318;

import java.util.Scanner;

public class Ex5_Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int year,month,days;
		boolean flag;
		System.out.println("년도를 입력하세요.");
		year=sc.nextInt();
		
		if(year%4==0 && year%100!=0 || year%400 == 0) {
			flag = false;
			System.out.println("윤년입니다.");
		}else {
			flag = true;
			System.out.println("평년입니다.");
		}
		
		System.out.println("월을 입력하세요");
		month=sc.nextInt();
		if(month<1 || month>12) {
			System.out.println("잘못 입력했어요!!");
			return;
		}else {
			System.out.println(month +"월 입니다.");
		}
		
		
		if(month==2) {
			days=flag?28:29;
		}else if(month == 4 ||month == 6 ||month == 9 ||month == 11) {
			days=30;
		}else {
			days=31;
		}
		System.out.println(year+"."+month+"."+days);
	}
}
