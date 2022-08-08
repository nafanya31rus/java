import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class MyClass6 {
    public static void main(String[] args) throws IOException {
        String page1 = downloadWebPage("https://www.cbr.ru/scripts/XML_dynamic.asp?date_req1=01/11/2021&date_req2=13/11/2021&VAL_NM_RQ=R01235");
        int startIndex1 = page1.lastIndexOf("<Value>");
        int endIndex1 = page1.lastIndexOf("</Value>");
        System.out.println(startIndex1);
        System.out.println(endIndex1);
        String courseStr1 = page1.substring(startIndex1 + 7,endIndex1);


        String page2 = downloadWebPage("https://www.cbr.ru/scripts/XML_dynamic.asp?date_req1=01/11/2020&date_req2=13/11/2020&VAL_NM_RQ=R01235");
        int startIndex2= page2.lastIndexOf("<Value>");
        int endIndex2 = page2.lastIndexOf("</Value>");
        System.out.println(startIndex2);
        System.out.println(endIndex2);
        String courseStr2 = page2.substring(startIndex2 + 7,endIndex2);

        System.out.println(courseStr2);
        System.out.println(courseStr1);

        double course1 = Double.parseDouble(courseStr1.replace(',','.'));
        double course2 = Double.parseDouble(courseStr2.replace(',', '.'));


        if(course1 > course2) {
            System.out.println("За год курс подрос на ");
            System.out.println(course1 - course2);
        } else {
            System.out.println("год назад курс был больше на ");
            System.out.println(course2 - course1);
        }
    }

    private static String downloadWebPage(String url) throws IOException {

        StringBuilder result = new StringBuilder();
        String line;
        URLConnection urlConnection = new URL(url).openConnection();
        try (InputStream is = urlConnection.getInputStream();
             BufferedReader br = new BufferedReader(new InputStreamReader(is))) {

            while ((line = br.readLine()) != null) {
                result.append(line);
            }

        }
        return result.toString();
    }
}
//        String page1 = downloadWebPage()
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter some words");
//        String str = scanner.nextLine();
//        String wordType = " ";
//        if (str.endsWith("ся")) {
//            wordType = "Глагол";
//        } else if (str.endsWith("ют")) {
//            wordType = "глагол";
//        } else if (str.endsWith("ет")) {
//            wordType = "глагол";
//        } else if (str.endsWith("шь")) {
//            wordType = "глагол";
//        }else if (str.endsWith("ая")) {
//            wordType = "прилагательное";
//        }else if (str.endsWith("ться")) {
//            wordType = "глагол";
//        }else if (str.endsWith("шься")) {
//            wordType = "глагол";
//        }else if (str.endsWith("ючи")) {
//            wordType = "прилагательное";
//        }else if (str.endsWith("ючи")) {
//            wordType = "прилагательное";
//        }else if (str.endsWith("ий")) {
//            wordType = "прилагательное";
//        }else {
//            wordType = "существительное";
//        }
//        System.out.println("вы ввели " + wordType);

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter some letter");
//        char letter = scanner.next().charAt(0);
//        if (letter >= '0' && letter <= '9') {
//            System.out.println("You entered a char");
//        } else {
//            if (letter >= 'а' && letter <= 'я') {
//                System.out.println("You entered a letter");
//            } else {
//                if (letter >= 'a' && letter <= 'z') {
//                    System.out.println("You entered a letter");
//                } else {
//                    if (letter >= 'A' && letter <= 'Z') {
//                        System.out.println("You entered a letter");
//                    } else {
//                        if (letter >= 'А' && letter <= 'Я') {
//                            System.out.println("You entered a letter");
//                        } else {
//                            if (letter > 32 && letter < 127) {
//                                System.out.println("You entered a symbol");
//                            } else {
//
//                            }
//                        }
//
//                    }
//                }
//            }
//        }
//        Scanner scanner = new Scanner(System.in);
//
//        char o1 = 'а';
//        char o2 = 'у';
//        char o3 = 'е';
//        char o4 = 'ё';
//        char o5 = 'ы';
//        char o6 = 'и';
//        char o7 = 'я';
//        char o8 = 'й';
//        char o9 = 'ю';
//        char o10 = 'о';
//        System.out.println("please enter a letter");
//        char letter = scanner.next().charAt(0);
//        if(letter == o1) {
//            System.out.println("Вы ввели глассную");
//        }if(letter == o2) {
//            System.out.println("Вы ввели глассную");
//        }if(letter == o3) {
//            System.out.println("Вы ввели глассную");
//        }if(letter == o4) {
//            System.out.println("Вы ввели глассную");
//        }if(letter == o5) {
//            System.out.println("Вы ввели глассную");
//        }if(letter == o6) {
//            System.out.println("Вы ввели глассную");
//        }if(letter == o7) {
//            System.out.println("Вы ввели глассную");
//        }if(letter == o8) {
//            System.out.println("Вы ввели глассную");
//        }if(letter == o9) {
//            System.out.println("Вы ввели глассную");
//        }if(letter == o10) {
//            System.out.println("Вы ввели глассную");
//        } else if(letter >= 'а' && letter <= 'я'){
//            System.out.println("Вы ввели гласную");
//        } else{
//            System.out.println("вы ввели не букву");
//        }






