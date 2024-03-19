package java0319;

import java.util.Calendar;
import java.util.Date;

public class EX6_DataCaliender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date data = new Date();
		
		int year = data.getYear()+1900;
		int month=data.getMonth()+1;
		int day=data.getDate();
		int week = data.getDay();
		
//		System.out.printf("%2d %2d %2d %2d",year,month,day,
//				((week==0)?"sun":(week==1)?"mon":(week==2)?"Tus":(week==3)?"Wes":(week==4)?"ths":(week==5)?"fri":"sat"));

		Calendar cal = Calendar.getInstance();
		
		year = cal.get(Calendar.YEAR);
		month = cal.get(Calendar.MONTH)+1;
		day = cal.get(Calendar.DATE);
		
		System.out.printf("%1d-%1d-%1d",year,month,day);
	}

}
