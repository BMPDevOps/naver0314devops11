package java0326;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ex15_FileException {

	static final String FILENAME="/Users/macbm/Documents/naver0314/memo1.txt";
	static final String FILENAME2="/Users/macbm/Documents/naver0314/memo2.txt";
	static public void filesave() {
		FileWriter f = null;

		try {
			f=new FileWriter(FILENAME);
			f.write("이름: 박보민");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				f.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	static public void filesave2() throws IOException  {
		Scanner sc = new Scanner(System.in);
		
		String name,hp,addr;
		
		FileWriter fw =null;
		fw=new FileWriter(FILENAME2);
		
		while(true) {
			System.out.println("name");
			name = sc.nextLine();
			System.out.println("hp");
			hp = sc.nextLine();
			System.out.println("addr");
			addr = sc.nextLine();
			
			if(name.equalsIgnoreCase("x")) break;
			
			fw.write(name+"\n");
			fw.write(hp+"\n");
			fw.write(addr+"\n");
			
		}
		fw.close();
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//filesave();
		try {
			filesave2();
		} catch(IOException e) {
			e.printStackTrace();
		} 
	}

}
