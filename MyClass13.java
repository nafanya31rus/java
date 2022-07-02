import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class MyClass13 {
    public static void main(String[] args) throws IOException {
//        int x = 0;
//        do{
//            System.out.println(x);
//            x++;
//        } while(x<5);
//        int y = 0;
//        while(y<5)
//        {
//            System.out.println(y);
//            y++;
//        }

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter x: ");
//        int x = scanner.nextInt();
//        System.out.println("enter max: ");
//        int max = scanner.nextInt();
//        System.out.println("Enter Step: ");
//        int step = scanner.nextInt();
//
//        System.out.println("while loop: ");
//        int x2 = x;
//        while(x< max){
//            System.out.println(x);
//            x = x + step;
//        }
//
//        x = x2;
//        System.out.println("do..while loop");
//        do {
//            System.out.println(x);
//            x = x + step;
//        } while(x < max);
//            System.out.println("done");


//        for(int n = 2; n< 100;n++){
//            int x = 1;
//            System.out.print("dividers of " + n + ": ");
//            do {
//            if (n % x == 0) {
//                System.out.print(x + " ");
//            }
//
//            x++;
//
//        } while (x < n);
//            System.out.println();
//
//        }
//        System.out.println("It's done");


//        int month = 1;
//        do {
//            int day = 1;
//            String monthStr = month < 10 ? "0" + month : String.valueOf(month);
//
//            do {
//                String dayStr;
//                if (day < 10) dayStr = "0" + day;
//                else dayStr = String.valueOf(day);
//                String page1 = downloadWebPage("https://cbr.ru/scripts/XML_dynamic.asp?date_req1=" + dayStr + "/" + monthStr+"/2021&date_req2="+dayStr + "/"+monthStr+"/2021&VAL_NM_RQ=R01235");
//                int startIndex1 = page1.lastIndexOf("<Value>");
//                if(startIndex1 != -1) {
//                    int endIndex1 = page1.lastIndexOf("</Value>");
//                    String courseStr1 = page1.substring(startIndex1 + 7, endIndex1);
//                    System.out.println("For " + dayStr + "/" + monthStr + " course: " + courseStr1);
//                }
//                day++;
//            } while (day <= 31);
//            month++;
//        } while (month <= 12);
//    }
//
//    private static String downloadWebPage(String url) throws IOException {
//
//        StringBuilder result = new StringBuilder();
//        String line;
//
//        URLConnection urlConnection = new URL(url).openConnection();
//        urlConnection.addRequestProperty("User-Agent", "Mozilla");
//        urlConnection.setReadTimeout(5000);
//        urlConnection.setConnectTimeout(5000);
//
//        try (InputStream is = urlConnection.getInputStream();
//             BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
//
//            while ((line = br.readLine()) != null) {
//                result.append(line);
//            }
//
//        }
//
//        return result.toString();


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter expression: ");
        int x = scanner.nextInt();
        char operator = scanner.next().charAt(0);
        int y = scanner.nextInt();


        switch (operator) {
            case '+':
                System.out.println(x + y);
                break;
            case '*':
                System.out.println(x * y);
                break;
            case '-':
                System.out.println(x-y);
                break;
            case '/':
                System.out.println(x/y);
                break;
        }

//        if (operator == '+') {
//            System.out.println(x + y);
//        } else if (operator == '-') {
//            System.out.println(x - y);
//        } else if (operator == '*') {
//            System.out.println(x * y);
//        } else if (operator == '/') {
//            System.out.println(x / y);
//        } else {
//            System.out.println("Unknown operator");
//        }


    }
}