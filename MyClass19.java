// ���������� ���������� ������ ������ ����� ��� ��� ���������
// ���������� ������������ �� ���������� �������� ������
// ���������� � ����� ������ ����� �������� ������ ����� �����
    //-���������� � ����� ������ ��� �� ���������
    //-���� ���������, �� ��� ��� ������� . ����������� ���������

// ����� ������� ������ 1 ���������� � ����� ������ � 1 ������� ���������

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class MyClass19 {
    public static void main(String[] args) throws IOException {
        String term = getUserInput();
        String url = buildUrl(term);
        String page = downloadWebPage(url);
        printResult(page);

    }
    static void printResult(String page){
        int start = page.indexOf("wrapperType")+4;
        int end = page.indexOf(":", start);

        StringBuilder result = new StringBuilder();
        String wrapperType = page.substring(start, end);

        if(wrapperType.equals("audiobook")){
            start = page.indexOf("artistName") + 13;
            end = page.indexOf("\",", start);
            String artistName = page.substring(start, end);
            result.append(artistName);
        }
        System.out.println(result.toString());
    }
    static String buildUrl(String partOfRequest){
        String termWithoutSpace = partOfRequest.replaceAll(" " , "+");
        String itunesApi = "https://itunes.apple.com/search?term";
        String limitParam = "&limit=1";
        StringBuilder url = new StringBuilder();
        url.append(itunesApi);
        url.append(termWithoutSpace);
        url.append(limitParam);
        return url.toString();
    }
    static String getUserInput(){
        System.out.println("WHAT YOU LOOKING FOR IN ITUNES?");
        Scanner scanner = new Scanner(System.in);
        String info = scanner.nextLine(); //war of world
        return info;
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