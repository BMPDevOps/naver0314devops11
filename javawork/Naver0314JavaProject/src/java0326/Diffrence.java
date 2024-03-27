package java0326;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

class VectorExample {
        Vector<Integer> vector = new Vector<>();

        // 백터에 요소 추가
        public  void vectorAdd(){
            for (int i = 0; i < 100000; i++) {
                vector.add(i);
            }
            // 백터의 중간에 요소 추가
            long startTime = System.currentTimeMillis();
            vector.add(50000, 999999);
            long endTime = System.currentTimeMillis();
            System.out.println("Vector 요소 추가 시간: " + (endTime - startTime) + "ms");
        }
}

class ArrayListExample {
        ArrayList<Integer> arrayList = new ArrayList<>();
        // ArrayList에 요소 추가
        public void arryAdd() {
            for (int i = 0; i < 100000; i++) {
                arrayList.add(i);
            }
            // ArrayList의 중간에 요소 추가
            long startTime = System.currentTimeMillis();
            arrayList.add(50000, 999999);
            long endTime = System.currentTimeMillis();
            System.out.println("ArrayList 요소 추가 시간: " + (endTime - startTime) + "ms");
    }
}
class LinkedListExample {
        LinkedList<Integer> linkedList = new LinkedList<>();

        // LinkedList에 요소 추가
        public void linkedListAdd(){
            for (int i = 0; i < 100000; i++) {
                linkedList.add(i);
            }

            // LinkedList의 중간에 요소 추가
            long startTime = System.currentTimeMillis();
            linkedList.add(50000, 999999);
            long endTime = System.currentTimeMillis();
            System.out.println("LinkedList 요소 추가 시간: " + (endTime - startTime) + "ms");
        }

}

public class Diffrence {
}
