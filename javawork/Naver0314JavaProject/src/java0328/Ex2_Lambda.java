package java0328;

@FunctionalInterface
interface Orange{
    public void write();
}
public class Ex2_Lambda {
    Orange or = new Orange() {
        @Override
        public void write() {
            System.out.println("익명 클래스의 run 매서드가 실행됩니다.");
        }
    };
    public void lam(){
        Orange or = ()-> System.out.println("오렌지 먹고 싶어요");
        or.write();
    }
    public static void main(String [] args){
    Ex2_Lambda ex = new Ex2_Lambda();
    ex.or.write();
    ex.lam();


    }
}
