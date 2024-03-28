package java0327;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/*
1. 학생정보 추가
2. 학생정보 삭제
3. 전체 출력
4. 평균으로 검색: 평균값을 입력 시 그 평균이상의 학생들을 출력
5. 이름으로 검색: 입력한 이름을 포함하고 있으면 출력
6. 저장 후 종료
 */
public class Ex9_VectorMunje {

    final static String FILENAME = "/Users/macbm/Desktop/naver0314/student.txt";

    Scanner sc = new Scanner(System.in);

    ArrayList<StudentDto> list = new ArrayList();

    public Ex9_VectorMunje() {
        try {
            fileRead();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int getMemu() {
        int menu = Integer.parseInt(sc.nextLine());
        return menu;
    }

    public void print(StudentDto dto) {
        int total = dto.getTotal(dto.getJava(), dto.getSpring(), dto.getHtml());
        System.out.println("=".repeat(20));
        System.out.println("이름: " + dto.getName());
        System.out.println("나이: " + dto.getAge());
        System.out.println("자바 점수: " + dto.getJava());
        System.out.println("스프링 점수: " + dto.getSpring());
        System.out.println("HTML 점수: " + dto.getHtml());
        System.out.println("총점: " + total);
        System.out.println("평균: " + dto.getAvg(dto.getJava(), dto.getSpring(), dto.getHtml()));
        System.out.println("등급: " + dto.getGrade(dto.getJava(), dto.getSpring(), dto.getHtml()));
        System.out.println("=".repeat(20));
        System.out.println();

    }

    public void fileRead() throws IOException {
        FileReader fr = new FileReader(FILENAME);
        BufferedReader br = new BufferedReader(fr);
        String line;
        while ((line = br.readLine()) != null) {
            String[] a = line.split(",");

            StudentDto dto = new StudentDto();
            dto.setName(a[0]);
            dto.setAge(Integer.parseInt(a[1]));
            dto.setJava(Integer.parseInt(a[2]));
            dto.setSpring(Integer.parseInt(a[3]));
            dto.setHtml(Integer.parseInt(a[4]));

            list.add(dto);
        }
        br.close();
        fr.close();
    }

    public void fileWrite() throws IOException {
        FileWriter fw = new FileWriter(FILENAME);
        for (StudentDto dto : list) {
            fw.write(dto.getName() + "," + dto.getAge() + "," + dto.getJava() + "," + dto.getSpring() + "," + dto.getHtml() + "\n");
        }
        fw.close();
    }

    public void addStu() {
        System.out.println("이름");
        String name = sc.nextLine();
        System.out.println("나이");
        int age = Integer.parseInt(sc.nextLine());
        System.out.println("자바점수");
        int java = Integer.parseInt(sc.nextLine());
        System.out.println("스프링점수");
        int spring = Integer.parseInt(sc.nextLine());
        System.out.println("html 점수");
        int html = Integer.parseInt(sc.nextLine());

        StudentDto dto = new StudentDto();
        dto.setName(name);
        dto.setAge(age);
        dto.setJava(java);
        dto.setSpring(spring);
        dto.setHtml(html);

        list.add(dto);
    }

    public void delStu() {
        System.out.println("삭제할 이름을 입력해주세요");
        String name = sc.nextLine();
        boolean search = true;
        for (int i = 0; i < list.size(); i++) {
            if (list.equals(name)) {
                list.remove(name);
                System.out.println(name + "님이 삭제되었습니다.");
                search = false;
            }
        }
        if (search) {
            System.out.println("명단에 없습니다.");
        }
    }

    public void allStu() {
        for (StudentDto dto : list) {
            print(dto);
        }
    }

    public void searchAvg() {
        double avg = Double.parseDouble(sc.nextLine());

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getAvg(list.get(i).getJava(), list.get(i).getSpring(), list.get(i).getHtml()) >= avg) {
                print(list.get(i));
            }
        }
    }

    public void searchName() {
        StudentDto studentSearch = new StudentDto();
        studentSearch.setName(sc.nextLine());
        int count = 0;
        boolean search = true;
        for (int i = 0; i < list.size(); i++) {
            StudentDto dto = list.get(i);
            if (dto.equals(studentSearch)) {
                ++count;
                search = false;
                print(dto);
            }
        }
        if (search) System.out.println("명단에 없습니다.");
        else System.out.println(count + "명 발견했습니다.");
    }


    public static void main(String[] args) {
        Ex9_VectorMunje ex = new Ex9_VectorMunje();
        Loop:
        while (true) {
            try {
                System.out.println("숫자를 입력하세요");
                int menu = ex.getMemu();
                switch (menu) {
                    case 1:
                        System.out.println("추가");
                        ex.addStu();
                        break;
                    case 2:
                        System.out.println("삭제");
                        ex.delStu();
                        break;
                    case 3:
                        System.out.println("조회");
                        ex.allStu();
                        break;
                    case 4:
                        System.out.println("이름 검색");
                        ex.searchName();
                        break;
                    case 5:
                        System.out.println("평균 검색");
                        ex.searchAvg();
                        break;
                    case 6:
                        System.out.println("저장 후 종료");
                        ex.fileWrite();
                        break Loop;
                }
            } catch (NumberFormatException e) {
                System.out.println("제대로 입력하세요: " + e.getMessage());
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
}
