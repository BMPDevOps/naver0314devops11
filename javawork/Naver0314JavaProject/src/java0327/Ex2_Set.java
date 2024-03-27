package java0327;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex2_Set {

    public static void main(String[] args){
        Set<String> set1 = new HashSet<>();

        set1.add("박보민");
        set1.add("강호동");
        set1.add("유재석");

        for (String i : set1){
            System.out.println(i);
        }

        System.out.println("출력 2");
        Iterator<String> iter = set1.iterator();

        while (iter.hasNext()) System.out.println(iter.next());
    }
}
