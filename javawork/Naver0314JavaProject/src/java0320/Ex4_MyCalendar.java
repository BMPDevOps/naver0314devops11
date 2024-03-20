package java0320;

import java.util.Date;
import java.util.Scanner;

public class Ex4_MyCalendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int year,month,endday,week;

		System.out.println("year month");

		year=sc.nextInt();
		month=sc.nextInt();

		if(month<1 || month>12) {
			System.out.println("err");
			return;
		}
		System.out.println("=".repeat(35));
		System.out.printf("%26d %d \n",year,month);

		System.out.println("=".repeat(35)+"\n");
		System.out.println("sun\tmon\ttue\twed\tthu\tfri\tsat\n");
		
		Date dt = new Date(year-1900,month-1,1);
		week = dt.getDay();
		//System.out.println(week);

		switch(month) {
		case 2:
			endday = (year%4==0)&&(year%100!=0) || (year%400 == 0)?29:28;
		case 4:
		case 6:
		case 9:
		case 11:
			endday=30;
			break;
		default:
			endday=31;
		}
		
		for(int i =1;i<=week;i++) {
			System.out.printf("\t");
		}
		
		for(int i =1;i<=endday;i++) {
			System.out.printf("%2d\t",i);
			++week;
			if(week%7==0) {
				System.out.println("\n");
			}
		}
	}

}
