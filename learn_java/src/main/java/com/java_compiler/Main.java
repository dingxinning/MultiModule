package com.java_compiler;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by Wuxiang on 2017/1/17.
 */
public class Main {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        FileWindow win=new FileWindow();
        win.pack();
        win.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });

        win.setBounds(200, 180,550,360);
        win.setVisible(true);
    }
}
