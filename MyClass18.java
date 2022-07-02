//1. есть объявление метода(вот эта первая строчка)
//2.есть тело метода (то , что после объявления внутри{ })
//3.


import java.util.Scanner;

public class MyClass18 {
    public static void main(String[] args) {
        song();
    }

    static void song() {
        System.out.println("В лесу родилась ёлочка");
        System.out.println("В лесу она росла");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Продолжить?");
        String answer = scanner.nextLine();
        if (answer.equals("Нет")) {
            return;
        }
            System.out.println("Зимой и летом стройная была");
            System.out.println("Зеланая была");
        }

}
