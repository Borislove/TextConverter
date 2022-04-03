package demo;

//7801678586\780101001 ООО "Рога и Копыта" превращался в ООО Рога и Копыта ИНН 7801678586 КПП 780101001

public class Demo {

    public static void main(String[] args) {

        String input = "7801678586\\780101001 ООО \"Рога и Копыта\"";


        String output = "";

        String[] inpSpl = input.split(" ");
      //  System.out.println(inpSpl[0]);

        String[] text = input.split(" ");
       // System.out.println(inpSpl[1]);

        String[] text1 = input.split(" ");
     //  System.out.println(inpSpl[2]);


        //String leng = "7801678586\\780101001";   //20   -1 слеш ??
        String leng = "78********\\780101001 ЗАО \"Пюпитр\"";
       // System.out.println(leng.length());


        //извлечение числа
        int start = 0;
        int end = 20;
        char[] dst = new char[end - start];
        leng.getChars(start, end, dst, 0);
      //  System.out.println(dst);

        //инн
        int endInn = 10;
        char[] endIn = new char[endInn - start];
        leng.getChars(start, endInn, endIn, 0);
       // System.out.print("ИНН ");
       // System.out.println(endIn);

        //кпп
        int startKpp = 11;
        int stopKpp = 20;
        char[] endkPpp = new char[stopKpp - startKpp];
        leng.getChars(startKpp, stopKpp, endkPpp, 0);
     //   System.out.print("КПП ");
      //  System.out.println(endkPpp);

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


        //System.out.print(String.valueOf(stopText));

        System.out.print(texd);
        System.out.println("ИНН " + String.valueOf(endIn) + " КПП " + String.valueOf(endkPpp));
    }

}
