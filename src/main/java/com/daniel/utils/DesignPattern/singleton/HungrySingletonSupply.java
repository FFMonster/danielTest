package com.daniel.utils.DesignPattern.singleton;

import javax.swing.*;
import java.awt.*;

public class HungrySingletonSupply extends JLabel {
    private static HungrySingletonSupply instance = new HungrySingletonSupply();

    private HungrySingletonSupply() {
        JLabel photo = new JLabel(new ImageIcon("com/daniel/utils/DesignPattern/singleton/Bajie.jpg"));
        this.add(photo);
    }

    private static HungrySingletonSupply getInstance() {
        return instance;
    }

    public static void main(String[] args) {
        JFrame jf = new JFrame("饿汉单例模式测试");
        jf.setLayout(new GridLayout(1, 2));
        Container contentPane = jf.getContentPane();
        HungrySingletonSupply obj1 = HungrySingletonSupply.getInstance();
        contentPane.add(obj1);
        HungrySingletonSupply obj2 = HungrySingletonSupply.getInstance();
        contentPane.add(obj2);
        if (obj1 == obj2) {
            System.out.println("they are the same pig!");
        } else {
            System.out.println("they aren't the same pig!!!");
        }
        jf.pack();
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
