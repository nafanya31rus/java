import java.util.Scanner;

public class MyClass9HW {
    public static void main(String[] args) {
        //Пользователь вводит три строки, выведите в обратном порядке.
        Scanner scanner = new Scanner(System.in);
        StringBuilder str1 = new StringBuilder(scanner.nextLine());
        StringBuilder str2 = new StringBuilder(scanner.nextLine());
        StringBuilder str3 = new StringBuilder(scanner.nextLine());

        System.out.println(str1.reverse());
        System.out.println(str2.reverse());
        System.out.println(str3.reverse());


        //Используя System.in (без сканнера), считайте слово из 5 букв

    }
}
