import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class MyClass8HW {
    public static void main(String[] args) throws IOException {
//        Scanner scanner = new Scanner(System.in);
//        int x = scanner.nextInt();
//        int y = scanner.nextInt();
//        int z = scanner.nextInt();
//
//        int max = (x > y && x > z) ? x : (y > z && y > x) ? y : z;
//        System.out.println(max);

        String page = downloadWebPage("https://breakingbadapi.com/api/quote/random");
        int quoteStart = page.lastIndexOf("quote");
        int quoteEnd = page.indexOf("author");
        String quote = page.substring(quoteStart +8, quoteEnd-3);
        int authorStart = page.lastIndexOf("author");
        int authorEnd = page.lastIndexOf("series");
        String author = page.substring(authorStart + 9, authorEnd -3);
        String text;
        if(!author.equals("Walter White")) {
            text = "Restart and try again";
            System.out.println(text);
        } else{
            text = quote + "\n" + author;
            System.out.println(text);
        }

    }
    private static String downloadWebPage(String url) throws IOException {
        StringBuilder result = new StringBuilder();
        String line;
        URLConnection urlConnection = new URL(url).openConnection();
        try (InputStream is = urlConnection.getInputStream();
             BufferedReader br = new BufferedReader(new InputStreamReader(is))){
            while ((line = br.readLine()) != null){
                result.append(line);
            }
        }
        return result.toString();
    }
}