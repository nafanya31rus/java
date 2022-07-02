import java.io.File;

public class MyClass17 {
    public static void main(String[] args) {
//        Cat cat1 = new Cat();
//        cat1.name = "Barsik";
//        cat1.age = 4;
//        Cat cat2 = new Cat();
//        cat2.name = "Masyanya";
//        cat2.age = 1;
//        Cat cat3 = new Cat();
//        cat3.name = "Barsik";
//        cat3.age = 11;
//
//        System.out.println("Meow! I'm " + cat2.name + " ," + cat2.age + " years old");

        //—колько экземпл€ров класса у нас будет (котов, файло, и т.д.) - столько раз надо написать new
        //  ласс - описание структы, напимер - какие есть пол€.
        // Ёкземпл€р класса - уже реальный объект, который имее значени€(им€, возраст и т.д.)
        // »нстанс класса ( class instance) - синоним экземпл€ру класса

        File dir = new File("text_files");
        File[] files = dir.listFiles();
        int filesCount = files.length;
        long[] sizes = new long [filesCount];
        String[] fileNames = new String[filesCount];
        String[] absolutePaths = new String[filesCount];
        FileInformation[] fileInfos = new FileInformation[files.length];



        for(int i = 0; i < files.length; i++){
            File currentFile = files[i];
            FileInformation info = new FileInformation();
            info.absolutePath = currentFile.getAbsolutePath();
            info.fileName = currentFile.getName();
            info.size = currentFile.length();
            fileInfos[i] = info;
        }
        for(int i = 0; i < fileInfos.length; i++){

            System.out.println("file " + i + ": " + fileInfos[i].fileName);
        }
    }
}
