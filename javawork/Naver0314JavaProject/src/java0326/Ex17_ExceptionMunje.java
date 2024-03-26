package java0326;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
 * score.txt 를 읽어서 총갯수와 총점, 평균울 구하시오.
 * 단, 점수에 문자가 있는 경우 갯수에서 제외하고 총좀에서 제외하고 출력이 되도록 하기
 */

public class Ex17_ExceptionMunje {
	
	static final String FILENAME = "/Users/macbm/Documents/naver0314/score.txt";
	
	public static void score() throws IOException {
		int count = 0, sum = 0, avg = 0;
		BufferedReader br = null;
		FileReader fr = new FileReader(FILENAME);
		br = new BufferedReader(fr);
		String line = br.readLine();
		while(line != null) {
			try {
				sum += Integer.parseInt(line);
				count ++;
			} catch(NumberFormatException e) {
				
			}finally {
				line = br.readLine();
			}
		}
		fr.close();
		br.close();
		
		avg += sum/count;
		
		System.out.println("갯수: " + count);
		System.out.println("합계: " +sum);
		System.out.println("평균: " +avg);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			score();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
