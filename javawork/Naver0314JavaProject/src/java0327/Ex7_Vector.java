package java0327;

import java.io.*;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class Ex7_Vector {
    Scanner sc = new Scanner(System.in);

    List<String> list = new Vector<>();

    final static String FILENAME="/Users/macbm/Desktop/naver0314/study.txt";

    public void parsonWrite() throws IOException {
        FileWriter fw = new FileWriter(FILENAME);
        for (String i : list){
            System.out.println(i);
            fw.write(i+"\n");
        }
        fw.close();
    }

    public void parsonRead() throws IOException {
        FileReader fr = new FileReader(FILENAME);
        BufferedReader br = new BufferedReader(fr);
        String name = br.readLine();
        while(name != null){
            System.out.println(name);
            name = br.readLine();
        }
        br.close();
        fr.close();
    }

    public int getMenu(){
        int menu = Integer.parseInt(sc.nextLine());
        return menu;
    }

    public void addPerson(){
        System.out.println("추가");
        String name = sc.nextLine();
        list.add(name);
        System.out.println(name+"이 추가됨");
    }

    public void deletePerson(){
        String name = sc.nextLine();
        if(list.contains(name)){
            list.remove(name);
            System.out.println(name+"이 삭제됨");
        }else {
            System.out.println(name+"이 없음");
        }
    }

    public void listPerson(){
        for(String  i : list){
            System.out.println(i);
        }
    }

    public void searchPerson(){
        boolean search = true;
        String name = sc.nextLine();
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).equals(name)){
                search = false;
                System.out.println(list.get(i));
            }
        }
        if(search) System.out.println("없음");
    }


    public static void main(String []args){
        Ex7_Vector ex = new Ex7_Vector();

        while(true){
            int menu = ex.getMenu();
            if(menu == 5) break;
            try{
                switch (menu){
                    case 1:
                        ex.addPerson();
                        break;
                    case 2:
                        ex.deletePerson();
                        break;
                    case 3:
                        ex.listPerson();
                        break;
                    case 4:
                        ex.searchPerson();
                        break;
                    case 6:
                        ex.parsonWrite();
                        break;
                    case 7:
                        ex.parsonRead();
                        break;
                }
            } catch (IOException e){
                System.out.println(e.getMessage());
            }

        }
    }
}
