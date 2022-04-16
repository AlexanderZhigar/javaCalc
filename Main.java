package CalcVersion1;

import javax.swing.*;
import java.awt.*;

public class Main {
    JPanel general;
    JFrame frame;
    JTextField screen;
    JButton [] numBut=new JButton[10];
    JButton [] funBut=new JButton[7];
    JButton point, equal, plus, minus, multiply, divide, clear;

    Font myFont=new Font("sans",Font.PLAIN,30);

    Engine calc2=new Engine(this);


    Main(){
        general = new JPanel();
        general.setLayout(null);
        general.setBackground(new Color(187, 242, 39));

        frame = new JFrame("awesome calculator");
        frame.setContentPane(general);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200, 200, 470, 467);
        frame.setResizable(false);

        screen = new JTextField();
        screen.setBounds(10, 10, 450, 50);
        screen.setFont(myFont);
        screen.setHorizontalAlignment(JTextField.RIGHT);
        screen.setEditable(false);

        point = new JButton(".");
        equal = new JButton("=");
        plus = new JButton("+");
        minus = new JButton("-");
        multiply = new JButton("*");
        divide = new JButton("/");
        clear = new JButton("Clear");

        funBut[0]=point;
        funBut[1]=equal;
        funBut[2]=plus;
        funBut[3]=minus;
        funBut[4]=multiply;
        funBut[5]=divide;
        funBut[6]=clear;

        for(int i=0; i< funBut.length;i++){
            if(i==1 | i==6){
                funBut[i].setFont(myFont);
                funBut[i].setFocusable(false);
                funBut[i].setBackground(new Color(255,37,160));
                funBut[i].addActionListener(calc2);
            }else if(i==0){
                funBut[i].setFont(myFont);
                funBut[i].setFocusable(false);
                funBut[i].setBackground(new Color(186,250,255));
                funBut[i].addActionListener(calc2);
            }else{
                funBut[i].setFont(myFont);
                funBut[i].setFocusable(false);
                funBut[i].setBackground(new Color(242,139,22));
                funBut[i].addActionListener(calc2);
            }
        }

        funBut[0].setBounds(100, 310, 170, 50);
        funBut[1].setBounds(10, 370, 450, 50);
        funBut[2].setBounds(280, 130, 180, 50);
        funBut[3].setBounds(280, 190, 180, 50);
        funBut[4].setBounds(280, 250, 180, 50);
        funBut[5].setBounds(280, 310, 180, 50);
        funBut[6].setBounds(10, 70, 450, 50);

        for(int i=0;i< numBut.length;i++){
            numBut[i]=new JButton(String.valueOf(i));
            numBut[i].setFont(myFont);
            numBut[i].setFocusable(false);
            numBut[i].setBackground(new Color(186, 250, 255));
            numBut[i].addActionListener(calc2);
        }

        numBut[0].setBounds(10, 310, 80, 50);
        numBut[1].setBounds(10, 250, 80, 50);
        numBut[2].setBounds(100, 250, 80, 50);
        numBut[3].setBounds(190, 250, 80, 50);
        numBut[4].setBounds(10, 190, 80, 50);
        numBut[5].setBounds(100, 190, 80, 50);
        numBut[6].setBounds(190, 190, 80, 50);
        numBut[7].setBounds(10, 130, 80, 50);
        numBut[8].setBounds(100, 130, 80, 50);
        numBut[9].setBounds(190, 130, 80, 50);

        for(int i=0; i< numBut.length; i++){
            general.add(numBut[i]);
        }

        for(int i=0; i< funBut.length;i++){
            general.add(funBut[i]);
        }

        general.add(screen);
        frame.setVisible(true);
    }

    public static void main (String[] args){
        Main awesome=new Main();
    }
}
