package java0326;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex16_FileReaderMemo {
	static final String FILENAME2="/Users/macbm/Documents/naver0314/memo2.txt";

	static public void readMemo2() {
		BufferedReader br = null;
		FileReader fr = null;
		
		try {
			fr = new FileReader(FILENAME2);
			System.out.println("File Readed");
			br=new BufferedReader(fr);
			String line = br.readLine();
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("memo2 file not found");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fr.close();
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		readMemo2();
	}

}
