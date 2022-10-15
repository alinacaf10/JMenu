package main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {
        JFrame frame=new JFrame();
        JMenuBar mb=new JMenuBar();
        JMenu menu=new JMenu("Main");

        JMenu submenu=new JMenu("Submenu");

        JMenuItem m1=new JMenuItem("Menu one");
        JMenuItem m2=new JMenuItem("Menu two");
        JMenuItem m3=new JMenuItem("Menu three");
        JMenuItem m4=new JMenuItem("Menu four");

        JMenuItem sub1=new JMenuItem("Sub1");
        JMenuItem sub2=new JMenuItem("Sub2");
        m1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame,"Menu one selected");
            }
        });

        menu.add(m1);
        menu.add(m2);
        menu.add(m3);
        menu.add(m4);
        submenu.add(sub1);
        submenu.add(sub2);

        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);
        mb.add(menu);
        frame.setJMenuBar(mb);
        menu.add(submenu);
    }
}
