package demo;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.*;

public class Demo3 {


    //в буфер копи
    public static void setClipboard(String str) {
        StringSelection ss = new StringSelection(str);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

    }

    public static void main(String[] args) throws IOException {


        //String leng = "78********\\780101001 ЗАО \"Пюпитр\"";

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("введи строку");
        String leng = reader.readLine();

        //извлечение числа
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


        System.out.print(texd);
        System.out.println("ИНН " + String.valueOf(endIn) + " КПП " + String.valueOf(endkPpp));

        System.out.println("файл сохранен в буфер обмена! ");

        setClipboard(texd + "ИНН " + String.valueOf(endIn) + " КПП " + String.valueOf(endkPpp));
    }
}





