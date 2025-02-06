package org.example;

import javax.swing.*;

public class HomePage {
    JFrame frame = new JFrame();
    JButton profileButton = new JButton("Profili Göster");

    HomePage(){
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        profileButton.setBounds(200,200,100,50);
        profileButton.setFocusable(false);
        frame.add(profileButton);

        frame.setVisible(true);
    }
}
