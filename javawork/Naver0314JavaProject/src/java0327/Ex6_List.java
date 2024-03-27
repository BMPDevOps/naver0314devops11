package java0327;

import java.util.List;
import java.util.Vector;

public class Ex6_List {
    public static void main(String[] args){
        List<String> list1 =new Vector<>();
        List<String> list2 =new Vector<>(5);

        System.out.println(list1.size());
        System.out.println(((Vector)list1).capacity());

        String [] str={"red","blue","green","white","red","blue","green","white","red","blue","green","white","red","blue","green","white"};

        for (String i : str){
            list1.add(i);
        }
        System.out.println(list1.size());
        System.out.println(((Vector)list1).capacity());

        for(String i : list1){
            System.out.println(i);
        }
        System.out.println();
        for (int i = 0; i <list1.size(); i++) {
            System.out.println(list1.get(i));
        }
    }
}
