package java0328;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex4_SwingButton extends JFrame {
    JButton btn1, btn2;
    JButton [] btnArray = new JButton[5];
    String [] btnLabel = {"붉은 색", "푸른 색","그 사이","3초동안","노란색"};

    public Ex4_SwingButton(String title){
        super(title);
        this.setLocation(100,100);
        this.setSize(300,300);
        this.getContentPane().setBackground(new Color(93,199,187));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.initDesion();
        this.setVisible(true);
    }

    private void initDesion() {
        this.setLayout(null);
        btn1 = new JButton("Hello");

        btn1.setBounds(10,10,100,30);

        btn1.setText("hast");
        this.add(btn1);

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(Ex4_SwingButton.this,"Btn 버튼 클릭");
            }
        });

        btn2 = new JButton("싫어");

        btn2.setBounds(120,10,100,30);

        btn2.setText("싫어");

        this.add(btn2);

        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(Ex4_SwingButton.this,"Swing 싫어");

            }
        });

        int yPos=40;
        for (int i=0; i<btnArray.length;i++){
            btnArray[i] = new JButton(btnLabel[i]);
            btnArray[i].setBounds(10,yPos,100,30);
            this.add(btnArray[i]);
            yPos +=35;

            btnArray[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JButton ob = (JButton)e.getSource();

                    switch (ob.getText()){
                        case "붉은 색":
                            Ex4_SwingButton.this.getContentPane().setBackground(Color.RED);
                            break;
                        case "푸른 색":
                            Ex4_SwingButton.this.getContentPane().setBackground(Color.BLUE);
                            break;
                        case "그 사이":
                            Ex4_SwingButton.this.getContentPane().setBackground(Color.magenta);
                            break;
                        case "3초동안":
                            Ex4_SwingButton.this.getContentPane().setBackground(new Color((int)((Math.random()*125)+1),(int)((Math.random()*125)+1),(int)((Math.random()*125)+1)));
                            break;
                        case "노란색":
                            Ex4_SwingButton.this.getContentPane().setBackground(Color.YELLOW);
                            break;
                    }
                }
            });
        }
    }

    public static void main(String[] args) {

        Ex4_SwingButton sg = new Ex4_SwingButton("hi");
    }

}
