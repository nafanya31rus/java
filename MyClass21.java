

import java.util.Scanner;

public class MyClass21 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String input = scanner.nextLine();
//        StringBuilder builder = new StringBuilder(input);
//        for(int i = 0; i < builder.length(); i++){
//            char ch = builder.charAt(i);
//            builder.deleteCharAt(i);
//            if(i % 2 == 0){
//
//                char upperCaseChar = Character.toUpperCase(ch);
//                builder.insert(i, upperCaseChar);
//            } else{
//
//                char lowerCaseChar = Character.toLowerCase(ch);
//                builder.insert(i, lowerCaseChar);
//            }
//        }
//        String output = builder.toString();
//        System.out.println(output);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 5 words");
        StringBuilder builder = new StringBuilder();

        for(int i = 0; i< 5;i++){
            String word = scanner.next();
            builder.insert(0 , word);
            builder.insert(0, " ");
        }
        System.out.println(builder.toString());
    }
}
