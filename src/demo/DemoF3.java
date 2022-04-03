package demo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class DemoF3 extends JFrame {

    JTextField field1;   //текстовое поле
    JTextField field2;   //текстовое поле

    //static String leng = "7801678586\\780101001 ООО \"Рога и Копыта\"";  //работает

    static String leng = "7801678586\\780101001 ООО \"Рога и Копыта\"";

    public DemoF3(String str) {
        super(str);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        //ввод
        JLabel label2 = new JLabel("Ввод");  //метка
        c.add(label2);

        field1 = new JTextField(leng,30);
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

        // field2.setText(texd);

    }


    class FieldHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == field1) {
                int start = 0;
                int end = 20;
                char[] dst = new char[end - start];
                leng.getChars(start, end, dst, 0);

                //инн
                int endInn = 10;
                char[] endIn = new char[endInn - start];
                leng.getChars(start, endInn, endIn, 0);

                //кпп
                int startKpp = 11;
                int stopKpp = 20;
                char[] endkPpp = new char[stopKpp - startKpp];
                leng.getChars(startKpp, stopKpp, endkPpp, 0);

                //остатки
                int startTest = 20;
                int stop = leng.length();
                char[] stopText = new char[stop - startTest];
                leng.getChars(startTest, stop, stopText, 0);

                String texd = String.valueOf(stopText);
                texd.trim();
                String del = "\"\"";
                for (char c : del.toCharArray()) {
                    texd = texd.replace(c, ' ');
                }
                field2.setText("ИНН " + String.valueOf(endIn) + " КПП " + String.valueOf(endkPpp)+texd);
            }
        }
    }

    public static void main(String[] args) {
        DemoF3 myFrame = new DemoF3("My frame");
    }
}


