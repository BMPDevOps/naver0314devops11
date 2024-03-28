package java0328;

import javax.swing.*;

import java.awt.*;

import static java.lang.System.*;

public class SwingGibon extends JFrame {

    Button brn1,btn2;

    public SwingGibon(String title){
        super(title);
        this.setLocation(100,100);
        this.setSize(300,300);
        this.getContentPane().setBackground(new Color(93,199,187));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.initDesion();
        this.setVisible(true);
    }

    private void initDesion() {
    }

    public static void main(String[] args) {

        SwingGibon sg = new SwingGibon("hi");
    }

}
