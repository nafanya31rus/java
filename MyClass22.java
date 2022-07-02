
import java.util.Scanner;

public class MyClass22 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        StringBuilder builder = new StringBuilder(line);
        int count =0;
        for(int i = 0; i < builder.length();i++) {
            char ch = builder.charAt(i);
            if (Character.isLowerCase(ch)) {
                continue;
            }
            char small = Character.toLowerCase(ch);
            builder.deleteCharAt(i);
            builder.insert(i, small);
            count++;
        }
        System.out.println("There is " + count + " not-lowercase symbols");
        System.out.println(builder.toString());
    }
}
