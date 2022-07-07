package JavaFull;

import javax.swing.*;
import java.util.Scanner;

public class Scannersc {
    public static void main(String[] args) {

//  자바 입출력 상자 만들어서출력해보기
        //간단한 gui 만들어봄.
//        String name=JOptionPane.showInputDialog("Enter your names");
//        JOptionPane.showMessageDialog(null,"Hello"+name);
//
//        int age=Integer.parseInt( JOptionPane.showInputDialog("Enter your age"));
//
//
//        JOptionPane.showMessageDialog(null,"You are age"+age+"years old");

        double height=Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
        JOptionPane.showInputDialog(null,"Your height"+height+"good");

        String name=JOptionPane.showInputDialog("Hello Your name please~");
        JOptionPane.showMessageDialog(null,"Hello Your names"+name);
    }
}
