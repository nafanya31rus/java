import java.util.Locale;

public class trening2 {
    public static void main(String[] args) {
        int x = 5;
        int y = 15;
        Math.pow(x, y);
        if (x <= 1000000000) {
            System.out.println("Степень это мощь.");
        }

        int x1 = 10;
        if (x1 > 0) {
            System.out.println("позитив");
        }
        double a = 1500000000;
        if(Math.sqrt(a) > 5000){
            System.out.println("два измерения лучше , чем одно");

        }
        double s = 2.3;
        double f = 11.3;
        if(s > f){
            System.out.println(f);
        } else {
            System.out.println(s);
        }
        int q = 4;
        int w = 2;
        System.out.println(q * q);
        System.out.println(w * w * w *w);


        int x2 = 10;
        int y3 = 12;


        for(x = 1; x < 101; x++){
            System.out.println(x);
        }
        for(x = 50; x < 101; x++){
            System.out.println(x);
        }
        for(x = 100; x > 0; x--){
            System.out.println(x);
        }
        for(x = 0; x > -101; x--){
            System.out.println(x);

        }
//        String str = "Привет";
//        str = str.replaceAll("Привет", "обро");
//        System.out.println(str);
//
//        String str2 = "Привет 2";
//        str2 = str2.toUpperCase();
//        System.out.println(str2);
//
//        String str3 = "САБАКА";
//        str3 = str3.replace('А', 'а');
//        System.out.println(str3);
//
//        String str4 = "НЕСАБАКА";
//        String str5 = "ИЭТОНЕСАБАКА";
//        str4 = String.valueOf(str4.length());
//        System.out.println(str4);
//        str5 = String.valueOf(str5.length());
//        System.out.println(str5);
//
//        String str6 = "as;d,wd";
//        String str7 = "sadsadadsa";
//        String str8 = "asdadsdasdasdasd";
//        str6 = String.valueOf(str6.length());
//        System.out.println(str6);
//        str7 = String.valueOf(str7.length());
//        System.out.println(str7);
//        str8 = String.valueOf(str8.length());
//        System.out.println(str8);


    }
}