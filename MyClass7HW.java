import java.util.Scanner;

public class MyClass7HW {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter boolean expression");
        String expr = scanner.nextLine();
        char x = expr.charAt(0);
        char op = expr.charAt(1);
        char y = expr.charAt(2);

        boolean xValue = false;
        if (x == '1') {
            xValue = true;
        } else {
            xValue = false;
        }
        boolean yValue = false;
        if (y == '1') {
            yValue = true;
        } else {
            yValue = false;
        }

        if (op == '&') {
            System.out.println(xValue && yValue);
        } else if(op == '|'){
            System.out.println(xValue || yValue);
        } else {
            System.out.println("Unknown operator");
        }
    }
}
