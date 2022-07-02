import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class MyClass14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter max size of array: ");
        int size = scanner.nextInt();
        int[] a = new int[size];


        int nextValue;
        int currentIndex = 0;

        do {
            System.out.println("Enter next value: ");
            nextValue = scanner.nextInt();
            a[currentIndex] = nextValue;
            currentIndex++;
        } while (nextValue!= 777);



//        private static String downloadWebPage(String url) throws IOException {
//
//            StringBuilder result = new StringBuilder();
//            String line;
//
//            URLConnection urlConnection = new URL(url).openConnection();
//            urlConnection.addRequestProperty("User-Agent", "Mozilla");
//            urlConnection.setReadTimeout(5000);
//            urlConnection.setConnectTimeout(5000);
//
//            try (InputStream is = urlConnection.getInputStream();
//                 BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
//
//                while ((line = br.readLine()) != null) {
//                    result.append(line);
//                }
//
//            }
//
//            return result.toString();
    }
}
