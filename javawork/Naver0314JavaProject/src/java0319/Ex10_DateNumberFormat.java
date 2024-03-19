package java0319;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex10_DateNumberFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss EEE");
		System.out.println(sdf1.format(date));
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss EEEE");
		System.out.println(sdf2.format(date));
		
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy년 MM월 dd a hh시 mm분 ss초 EEEE");
		System.out.println(sdf3.format(date));
		
		
		int money = 723743727;
		double avg = 99.123457;
		
		NumberFormat nf1 =NumberFormat.getCurrencyInstance();
		
		System.out.println(nf1.format(money));
		
		
		
		NumberFormat nf2=NumberFormat.getInstance();
		nf2.setMaximumFractionDigits(1);
		System.out.println(nf2.format(avg));
	}

}
