import java.io.IOException;


import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

        public class MyClass2HW {

            public static void main(String[] args) throws IOException {
            String page = downloadWebPage("https://cbr.ru/scripts/XML_dynamic.asp?date_req1=12/11/2021&date_req2=13/11/2021&VAL_NM_RQ=R01235");
                System.out.println(page);

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

