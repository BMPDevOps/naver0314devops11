package java0327;

import java.util.Stack;

public class Ex5_Stack {
    public static void main(String [] args){
        Stack<String> stack1 = new Stack<String>();

        stack1.push("사과");
        stack1.push("사과");
        stack1.push("사과");
        stack1.push("사과");
        stack1.push("딸기");

        System.out.println(stack1.size());

        while(!stack1.isEmpty()) {
            System.out.println(stack1.pop());
        }
    }
}
