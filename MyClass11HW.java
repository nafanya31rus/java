import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class MyClass11HW {
    public static void main(String[] args) throws IOException {
        //�������� ����� �� 0 �� ��������

//        for(int var =0; var<= 1000000; var++){
//
//            System.out.println(var);
//        }
        //�������� ����� �� 1.5 �� 101.5: 1.5,2,2.5,3,3.5�101.5
//        for(double var = 1.5;var < 101.5; var = var + 0.5){
//            System.out.println(var);
//        }
        //�������� ��������� ������� �� a �� z

//        for(char ch = 'a';ch <='z';ch++){
//            System.out.print(ch + " ");
//        }
        //�������� ������� ������� �� � �� �
//        for(char ch = '�'; ch <= '�';ch++){
//            System.out.print(ch + " ");
//        }
        //�������� 10 ����� ������
//        int x = 1;
//        while (x < 10000) {
//            File file = new File("files/" + x);
//            file.createNewFile();
//            x = x+1;
//        }
        //В файле две строки: секретное слово и подсказка. Вывести подсказку. Считывать строку за строкой, пока игрок не отгадает секретное слово(не введёт его)


        Scanner scanner = new Scanner(System.in);
        String otvet = scanner.nextLine();
        File file = new File("../text_files/podskazka");
        FileReader fr = new FileReader(file);
        BufferedReader reader = new BufferedReader(fr);
        String line = reader.readLine();
        while (line != null) {
            System.out.println(line);
            // считываем остальные строки в цикле
            line = reader.readLine();
        }


    }
}
