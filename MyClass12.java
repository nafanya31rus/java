import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class MyClass12 {
    public static void main(String[] args) throws IOException {

//        for (int x = 0; x < 100; x = x + 1) {
//            System.out.println(x);
//        }

//        int x = 0;
//        while(x<100){
//            System.out.println(x);
//            x= x +1;
//        }
//        for(int x = 0;x<100;x= x +1){
//
//        }
//        for (int i = 0; i < 10; i++) {
//            for (int x = 0; x < 20 - i; x++) {
//                System.out.print(" ");
//            }
//        }
//            for (int y = 0; y < 1; y++) {
//                System.out.print(".");
//            }
//            System.out.println("Its done");

    }
    private static String downloadWebPage(String url) throws IOException {

        StringBuilder result = new StringBuilder();
        String line;

        URLConnection urlConnection = new URL(url).openConnection();
        urlConnection.addRequestProperty("User-Agent", "Mozilla");
        urlConnection.setReadTimeout(5000);
        urlConnection.setConnectTimeout(5000);

        try (InputStream is = urlConnection.getInputStream();
             BufferedReader br = new BufferedReader(new InputStreamReader(is))) {

            while ((line = br.readLine()) != null) {
                result.append(line);
            }

        }

        return result.toString();
    }
}


