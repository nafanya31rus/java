package myclass40;

import utils.PageDownloader;
import utils.RandomDateGenerator;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class NasaRandomPicturesFinder {
    public NasaPictureInfo[] findRandomPictures() {

        NasaPictureInfo[] arr = new NasaPictureInfo[10];

        String date = getRandomDateStr();
        String url = "https://api.nasa.gov/planetary/apod?api_key=dy60KdTkvPXStjdBgxvby1W862QSlGeFmMvQlH0m&date=" + date;
        PageDownloader downloader = new PageDownloader();
        String page = "";
        try {
            page = downloader.downloadWebPage(url);
        } catch(IOException e) {
            e.printStackTrace();
            throw new IllegalStateException("Can't call nasa API");
        }


        return arr;
    }

    String getTagValue(String page) {
        int begin = page.indexOf("")
    }


    private String getRandomDateStr() {
        RandomDateGenerator randomDateGenerator = new RandomDateGenerator();
        LocalDate randomDate = randomDateGenerator.getRandomDate(1995, 2021);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String dateStr = randomDate.format(format);
        return dateStr;
    }
}
