import java.io.*;
import java.net.URL;
import java.net.URLConnection;

public class trening2createdPages {
    public static void main(String[] args) throws IOException {
        String sourceCode = downloadWebPage("https://ru.wikipedia.org/wiki/%D0%9E%D0%B1%D1%81%D1%83%D0%B6%D0%B4%D0%B5%D0%BD%D0%B8%D0%B5_%D0%92%D0%B8%D0%BA%D0%B8%D0%BF%D0%B5%D0%B4%D0%B8%D0%B8:%D0%93%D0%B0%D0%B4%D0%B6%D0%B5%D1%82%D1%8B/%D0%A3%D0%BF%D1%80%D0%BE%D1%89%D0%B5%D0%BD%D0%B8%D0%B5_%D1%81%D1%81%D1%8B%D0%BB%D0%BE%D0%BA");
//        writeToFile(sourceCode.replaceAll("Кнут", "Пряник"));
        System.out.println(sourceCode);

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

//    public static void writeToFile(String str) throws IOException {
//
//        BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\Даня\\Desktop\\123.html"));
//        writer.write(str);
//
//        writer.close();
//    }
}
