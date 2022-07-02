import java.util.Scanner;

public class MyClass5 {
    public static void main(String[] args) {
        char o1 = 'а', o2 = 'я' ,o3 = 'о' ,o4 = 'е' ,o5 = 'ю' ,
                o6 = 'у' ,o7 = 'э' ,o8 = 'ё' ,o9 = 'ы' ,o10 = 'и';

        Scanner scanner = new Scanner(System.in);
        char c = scanner.next().charAt(0);
        if  (c != o1 && c != o2 &&
                c != o3 && c != o4 &&
                c != o5 && c != o6 &&
                c != o7 && c != o8
                && c != o9 && c != o10){
            System.out.println("это не гласные");
        } else {
            System.out.println("это гласная буква");
        }
    }
}

