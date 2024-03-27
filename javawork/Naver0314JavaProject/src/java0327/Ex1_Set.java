package java0327;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Ex1_Set {
    public static void main(String[] args){
        Set<Integer> set1 = new HashSet<>();

        set1 = new TreeSet<>();
        set1.add(100);
        set1.add(78);
        set1.add(100);
        set1.add(78);
        set1.add(110);
        set1.add(70);
        set1.add(10);
        set1.add(28);

        System.out.println("set1 의 데이터 개수는"+set1.size());
        System.out.println("출력1");
        for(int i : set1){
            System.out.println(i);
        }
        System.out.println("출력2");
        Iterator<Integer> iter = set1.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}
