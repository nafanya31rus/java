import java.util.Scanner;

//����� ������� - ��������� ������/������/instance
// ����� -����. ����������� - ����� ������� ������

// ����� � ������, ������� �� ������� static - ���������� ������ ��� ���������� ������.
// ������������� ����� ������� ����� ����� , ����� ����� new ������� ��������� ������.

//����� �� ������ (����� this) ����������(����) ������ ������
// ��� �������� �����, ��� ���������� ���� ���������
public class MyClass20 {
    public static void main(String[] args) {

        Printer printer1 = new Printer();
        Printer printer2 = new Printer();
        Printer printer3 = new Printer();



        printer1.maker ="HP";
        printer1.price = 300;
        printer2.maker ="Canon";
        printer2.price = 500;
        printer3.maker ="Xerox";
        printer3.price = 700;


        printer1.decreasePrice();
        printer3.decreasePrice();

      }
      static void printHello(){
          System.out.println("hello");

      }


}
