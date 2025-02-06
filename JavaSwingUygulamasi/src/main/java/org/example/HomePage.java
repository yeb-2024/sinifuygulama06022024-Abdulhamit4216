package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomePage implements ActionListener {
    JFrame frame = new JFrame();
    JButton profileButton = new JButton("Profili Göster");

    HomePage(){
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        profileButton.setBounds(200,200,100,50);
        profileButton.setFocusable(false);
        profileButton.addActionListener(this);
        frame.add(profileButton);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == profileButton){
            ProfilePage profilePage = new ProfilePage();
        }
    }
}
