package myclass30;

import java.io.File;

public class MyClass30 {


    //Всегда можно заменить наследника родителем
    public static void main(String[] args) {
//        File input = new File("The Terminator.m4v");
//        StandardFile standardFile = new StandardFile(input);
        File mile = new File("8 Mile.m4v");
        TextFile textfile = new TextFile(mile);

//        StandardFile standard = textfile;
//        System.out.println(textfile.linesCount);
//        System.out.println(textfile.fileName);
//        System.out.println(standard.fileName);

        StandardFile standard = textfile;
        BigTextFile file = new BigTextFile(new File("input.txt"));
        printFile(standard);
//        StandardFile newFile = new StandardFile(mile);
//        StandardFile notNewFile = standardFile;
//
//
//        System.out.println(newFile.fileName);
//        System.out.println(notNewFile);
//        notNewFile.fileName = "changed";
//        System.out.println(notNewFile.fileName);
//        System.out.println(standardFile.fileName);
    }

    static void printFile(StandardFile file) {
        System.out.println("info: "  + file.getInfo());
    }
}
