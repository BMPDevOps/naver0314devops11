package java0327;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Ex3_SetLotto {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Set<Integer> set1 = new TreeSet<Integer>();

        while(true){
            System.out.println("Buy Lotto");
            int money = sc.nextInt();
            if(money == 0){
                System.out.println("Close");
                break;
            }
            if(money<1000){
                System.out.println("not Money");
            }
            for (int i = 0; i < money/1000; i++) {
                while (set1.size() < 6){
                    int n = (int)(Math.random()*45)+1;
                    set1.add(n);
                }
                for (int j : set1){
                    System.out.printf("%d\t",j);
                }
                System.out.println();
                set1.clear();
            }
        }
    }
}
