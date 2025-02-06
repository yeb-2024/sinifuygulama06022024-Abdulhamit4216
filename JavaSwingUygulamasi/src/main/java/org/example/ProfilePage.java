package org.example;

import javax.swing.*;
import java.awt.*;

public class ProfilePage {
    JFrame frame = new JFrame();
    JLabel nameLabel = new JLabel("Abdülhamit TIKI");

    ProfilePage(){
        frame.setTitle("Profil Sayfası");
        frame.setSize(500,500);
        frame.setLayout(new GridLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(nameLabel);
        frame.setVisible(true);
    }
}
