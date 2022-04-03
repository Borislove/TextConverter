package demo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DemoF extends JFrame {

    static JPanel jPanel = new JPanel();

    public static void main(String[] args) throws IOException {

        JFrame f = new JFrame();
        f.setSize(500, 150);
        f.setResizable(false); //запрет на развертку окна
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //.setLocation(900,500);   //расположение фрейма
        f.setLocationRelativeTo(null);  //centre

        // f.pack(); //для упаковки объектов в окне
        f.add(jPanel);
        jPanel.add(new JTextField(35));
        jPanel.revalidate();
        jPanel.add(new JTextField(35));

        f.setVisible(true);
    }
}
