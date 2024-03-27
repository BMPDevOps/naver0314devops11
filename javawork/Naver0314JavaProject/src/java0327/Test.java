package java0327;

import java.util.*;

class Box<T>{
    private T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}

class Parson<T>{
    private T name;
    private T hp;
    private T age;

    public Parson(T name, T hp, T age){
        this.name = name;
        this.age = age;
        this.hp = hp;
    }

    public void show(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(hp);
    }
}

public class Test {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        Box<Integer> b = new Box<>();

        b.setItem(100);

        int a = b.getItem();

        System.out.println(a);

        ArrayList<Parson<String>> parson = new ArrayList<>();
        ArrayList<Map<String,String>> parson2 = new ArrayList<>();

        ArrayList<?> list = new ArrayList<>();




        while(true){
            String name= sc.nextLine(),hp = sc.nextLine(),age = sc.nextLine();
            if(name.equalsIgnoreCase("c")) break;

            parson.add(new Parson<String>(name,hp,age));
        }
        for (int i = 0; i < parson.size(); i++) {
            parson.get(i).show();
        }
        String name;
        String hp;
        String age;
        System.out.println("map");
        while(true){
            name = sc.nextLine();
            if(name.equalsIgnoreCase("x"))break;
            hp = sc.nextLine();
            age = sc.nextLine();
            Map<String,String> map1 = new HashMap<>();
            map1.put("name",name);
            map1.put("hp",hp);
            map1.put("age",age);
            parson2.add(map1);
            break;
           // parson2.add()
        }
        for (Map<String,String> i : parson2){
            Set<String> set1 = i.keySet();

            for(String j:set1){
                System.out.println(i.get(j));
            }
        }
    }
}
