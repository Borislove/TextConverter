package demo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DemoF2 extends JFrame {

    JTextField field1;   //текстовое поле
    JTextField field2;   //текстовое поле

    public DemoF2(String str) {
        super(str);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        //ввод
        JLabel label2 = new JLabel("Ввод");  //метка
        c.add(label2);

        field1 = new JTextField("Text", 30);
        field1.getText(); //взять текст
        c.add(field1);

        //вывод
        JLabel label3 = new JLabel("Вывод");  //метка
        c.add(label3);

        field2 = new JTextField(30);

        c.add(field2);

        setSize(400, 150);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);  //centre

        setVisible(true);
        FieldHandler handler = new FieldHandler();
        field1.addActionListener(handler);

        pack();

    }

    class FieldHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == field1) {
                //JOptionPane.showMessageDialog(null, "Text Field");
                String text = field1.getText();
                field2.setText(text + text);
            }
        }
    }

    public static void main(String[] args) {
        DemoF2 myFrame = new DemoF2("My frame");
    }
}


