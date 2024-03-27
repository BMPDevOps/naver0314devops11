package java0327;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ex4_Map {
    public static void main(String [] args){
        Map<String,String> map1 = new HashMap<>();

        map1.put("name","박보민");
        map1.put("age","20");
        map1.put("hp","010-6201-9228");
        map1.put("addr","Changwon");

        Set<String> set1 = map1.keySet();

        for(String i : set1){
            System.out.println(i+" "+map1.get(i));
        }
    }
}
