package myclass30;

import java.io.File;

public class StandardFile {
    File inputFile;
    String fileName;

    StandardFile(File input) {
        this.inputFile = input;
        this.fileName = input.getName();
    }

    String getInfo(){
        return this.fileName + ":" + this.inputFile;
    }
}
