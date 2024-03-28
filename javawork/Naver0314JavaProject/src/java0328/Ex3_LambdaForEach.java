package java0328;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class Ex3_LambdaForEach {

    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("빨간색");
        list1.add("파란색");
        list1.add("그사이");
        list1.add("노란색");

        for(String i : list1){
            System.out.println(i);
        }

        List<String> list2 = Arrays.asList("붉은색","푸른색","그사이","짧은 시간","노란색","빛을 내는");

        List<String> list3 = new ArrayList<>();

        list2.forEach(System.out::println);


    }
}
