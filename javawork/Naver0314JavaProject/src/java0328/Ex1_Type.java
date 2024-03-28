package java0328;

class GenericType<T>{
    T[] v;

    public void set(T[] n){
        v=n;
    }
}
public class Ex1_Type {
    public static void main(String[] args){
        GenericType<String> gt = new GenericType<>();
        String[] str = {"박보민","강호동","유재석"};
        gt.set(str);

        System.out.println(gt.v[0]);
    }
}
