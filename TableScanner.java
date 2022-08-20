package myclass39;

import java.util.Scanner;

public class TableScanner {
    Row[] scanTable() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter header, left column");
        String headerLeft = scanner.nextLine();
        System.out.println("Pleaser enter header, right column");
        String headerRight = scanner.nextLine();
        Row header = new Row(headerRight, headerLeft);
        System.out.println("How many rows you will have in table?");
        int rowCount = scanner.nextInt();

        Row[] table = new Row[rowCount + 1];
        table[0] = header;

        for (int i = 1; i < rowCount; i++) {
            System.out.println("Enter " + i + " row:");
            System.out.println("left: ");
            String left = scanner.next();
            System.out.println("right: ");
            String right = scanner.next();
            Row row = new Row(left, right);
            table[i] = row;
        }
        return table;
    }
}
