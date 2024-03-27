package java0327;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex8_MemberList {
    List<MemberDto> list = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    static final String FILENAME="/Users/macbm/Desktop/naver0314/Member.txt";

    public void memberRead() throws IOException{
        FileReader fr = new FileReader(FILENAME);
        BufferedReader br = new BufferedReader(fr);
        String s;
        while(( s = br.readLine()) != null){
            String []str = s.split(",");

            MemberDto dto = new MemberDto();
            dto.setName(str[0]);
            dto.setHp(str[1]);
            dto.setBlood(str[2]);
            dto.setAddr(str[3]);
            list.add(dto);
        }
        br.close();
        fr.close();
    }
    public void memberSave(){
        FileWriter fw = null;
        try {
            fw = new FileWriter(FILENAME);
            for(MemberDto dto : list){
                String s = dto.getName()+","+dto.getHp()+","+dto.getBlood()+","+dto.getAddr()+"\n";
                fw.write(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fw.close();
            } catch (IOException | NullPointerException e) {
                e.printStackTrace();
            }
            System.out.println(list.size()+"명 추가");
        }

    }


    public  Ex8_MemberList(){
        try{
            memberRead();
        } catch (IOException e){
            e.printStackTrace();
        }

    }
    public int getMenu() throws NumberFormatException{
        int menu = 0;
        System.out.println("1. 멤버 추가");
        System.out.println("2. 맴버 삭제");
        System.out.println("3. 전체맴버 출력");
        System.out.println("4. 이름으로 검색");
        System.out.println("5. 핸드폰으로 검색");
        System.out.println("6. 저장후 종료");
        menu = Integer.parseInt(sc.nextLine());
        return menu;
    }

    public void addMember(){
        System.out.println("이름을 입력하세요");
        String name = sc.nextLine();
        System.out.println("번호을 입력하세요");
        String hp = sc.nextLine();
        System.out.println("혈액형을 입력하세요");
        String blood = sc.nextLine();
        System.out.println("주소을 입력하세요");
        String addr = sc.nextLine();

        MemberDto dto = new MemberDto(name,hp,blood,addr);

        list.add(dto);
        System.out.println(list.size()+"번째 추가됨");
    }
    public void deleteMember(){
        String name = sc.nextLine();
        boolean eq = true;
        int i = 0;
        for (MemberDto dto : list){
            if(dto.getName().equals(name)){
                eq = false;
                list.remove(i);
                System.out.println("삭제");
                break;
            }
        } if(eq) System.out.println("명단에 없음");
    }

    public void listMember(){

    }

    public void writeMember(){
        for(int i = 0; i<list.size();i++){
            MemberDto dto = list.get(i);
            System.out.println("=".repeat(20));
            System.out.println("이름: "+dto.getName());
            System.out.println("주소: "+dto.getAddr());
            System.out.println("혈액형: "+dto.getBlood());
            System.out.println("번호: "+dto.getHp());
            System.out.println("=".repeat(20));
            System.out.println();
        }
    }

    public void searchName(){
        String name = sc.nextLine();
        int i = 0;
        boolean search = true;
        for (MemberDto dto : list){
            if(dto.getName().startsWith(name)){
                i++;
                search = false;
                System.out.println("=".repeat(20));
                System.out.println("이름: "+dto.getName());
                System.out.println("주소: "+dto.getAddr());
                System.out.println("혈액형: "+dto.getBlood());
                System.out.println("번호: "+dto.getHp());
                System.out.println("=".repeat(20));
            }
        } if(search) System.out.println("없음"); else System.out.println("총"+i+"명 발견했습니다.");
        System.out.println();
    }
    public void searchHp(){
        String hp = sc.nextLine();
        boolean search = true;
        int i = 0;
        for(MemberDto dto : list){
            if(dto.getHp().endsWith(hp)){
                i++;
                search = false;
                System.out.println("=".repeat(20));
                System.out.println("이름: "+dto.getName());
                System.out.println("주소: "+dto.getAddr());
                System.out.println("혈액형: "+dto.getBlood());
                System.out.println("번호: "+dto.getHp());
                System.out.println("=".repeat(20));
            } if(search) System.out.println("없음"); else System.out.println("총"+i+"명 발견했습니다.");
            System.out.println();
        }
    }
    public static void main(String[] args){
        Ex8_MemberList ex = new Ex8_MemberList();
        Loop:
        while (true){
            try {
                int menu=ex.getMenu();

                switch (menu){
                    case 1:
                        ex.addMember();
                        break;
                    case 2:
                        ex.deleteMember();
                        break;
                    case 3:
                        ex.writeMember();
                        break;
                    case 4:
                        ex.searchName();
                        break;
                    case 5:
                        ex.searchHp();
                        break;
                    case 6:
                        ex.memberSave();
                        break Loop;
                }
            }catch (NumberFormatException e){
                System.out.println("숫사를 입력세요: "+e.getMessage());
                System.out.println();
            }
        }
    }
}
