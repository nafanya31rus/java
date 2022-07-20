package myclass30;


import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ITunesPreviewPlayer {
    void play(ITunesProduct product) throws IOException {
        System.out.println("will download" + product.collectionName);
        String name = product.collectionName;
        String extension = product.previewUrl.substring(product.previewUrl.length() - 3);
        String fileName = name + "." + extension;
        try (InputStream in = new URL(product.previewUrl).openStream()) {
            Files.copy(in, Paths.get(fileName));
        }
        System.out.println("Downloaded!");
        if (!Desktop.isDesktopSupported()) {
            System.out.println("not supported");
            return;
        }
        Desktop desktop = Desktop.getDesktop();
        File file = new File(fileName);
        desktop.open(file);
    }

}
