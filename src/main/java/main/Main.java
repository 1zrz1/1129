package main;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("主界面");
        jFrame.setSize(1200,700);
        jFrame.setVisible(true);
        //JFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String head[] = {"id","username","password"};
        Object[][] data = new Object[5][3];

        JTable jTable = new JTable(data,head);

        //滚动面板
        JScrollPane jScrollPane = new JScrollPane();
        jScrollPane.setBounds(0,0,1200,650);

    }
}
