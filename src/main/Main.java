package main;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        JFrame frame=new JFrame();
        JMenuBar mb=new JMenuBar();
        JMenu menu=new JMenu("Main");

        JMenuItem m1=new JMenuItem("Menu one");
        JMenuItem m2=new JMenuItem("Menu two");
        JMenuItem m3=new JMenuItem("Menu three");
        JMenuItem m4=new JMenuItem("Menu four");

        menu.add(m1);
        menu.add(m2);
        menu.add(m3);
        menu.add(m4);

        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);
        mb.add(menu);
        frame.setJMenuBar(mb);

    }
}
