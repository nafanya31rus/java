import java.util.Scanner;

public class MyClass5 {
    public static void main(String[] args) {
        char o1 = '�', o2 = '�' ,o3 = '�' ,o4 = '�' ,o5 = '�' ,
                o6 = '�' ,o7 = '�' ,o8 = '�' ,o9 = '�' ,o10 = '�';

        Scanner scanner = new Scanner(System.in);
        char c = scanner.next().charAt(0);
        if  (c != o1 && c != o2 &&
                c != o3 && c != o4 &&
                c != o5 && c != o6 &&
                c != o7 && c != o8
                && c != o9 && c != o10){
            System.out.println("��� �� �������");
        } else {
            System.out.println("��� ������� �����");
        }
    }
}

