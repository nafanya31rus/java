package myclass30;

public class ITunesProduct {
    String artistName;
    String previewUrl;
    String collectionName;
    String country;
    String releaseDate;
    void printIntroducePreview(){
        System.out.println(this.artistName + " - " + this.collectionName);
        System.out.println("url to preview: " + this.previewUrl);
    }
    void printReleaseDate(){
        System.out.println(collectionName + " has released " + this.releaseDate);
    }

}
