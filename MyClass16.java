import java.util.Scanner;

public class MyClass16 {
    public static void main(String[] args) {
        //привет
        //ѕр»в≈т

//        Scanner scanner = new Scanner(System.in);
//        String  str = scanner.nextLine();
//        char[] chars = str.toCharArray();
//        int size = chars.length;
//        for(int i =size -4; i<size;i++){
//            chars[i] = '*';
//        }
//        for(int i =0; i<size;i++){
//            System.out.print(chars[i]);
//        }
//        char s ='я';
//        char min = Character.toLowerCase(s);
//        System.out.println(min);



//        Scanner scanner = new Scanner(System.in);
//        String str = scanner.nextLine();
//        int dotIndex =0;
//        int i = 0;
//        while (i < str.length() && dotIndex == 0) {
//            if (str.charAt(i) == '.') {
//                dotIndex = i;
//            }
//            i++;
//        }
//        char[] intPart = new char[dotIndex];
//        char[] fractPart = new char[str.length()-dotIndex-1];
//
//
//        for(int x = 0; x<dotIndex;x++){
//            intPart[x]= str.charAt(x);
//        }
//        System.out.println(intPart);
//
//        int fractIndex = 0;
//        for(int x = dotIndex+1; x<str.length();i++){
//            fractPart[fractIndex] = str.charAt(x);
//            fractIndex++;
//        }
//        System.out.println(fractPart);

        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] words = new String[1000];
        int countOfWords =0;

        int start = 0;
        for(int i = 0; i< line.length(); i++){
            char ch = line.charAt(i);
            if(!(((ch>'a') && (ch > '€')) || ((ch > 'A') && (ch<'я')) || ch =='-')) {
                String word = line.substring(start, i);
                words[countOfWords] = word;
                countOfWords++;
                start = i+1;
            }
        }

        for(int i = 0;i < countOfWords; i++){
            System.out.println(words[i]);
        }
    }

}
