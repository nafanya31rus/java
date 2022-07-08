package glava3;

import java.lang.reflect.Array;
import java.util.*;

public class LotteryDrawing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("how many number do you need to draw? ");
        int k = in.nextInt();

        System.out.print("What is the highest number you can draw?");
        int n = in.nextInt();

        //Заполнить массив числами 1 2 3 4 ... n
        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }

        //Выбрать k номеров и ввести их во второй массив
        int[] result = new int[k];
        for (int i = 0; i < result.length; i++) {
            //получить случайный индекс
            //в пределах от 0 до n - 1
            int r = (int) (Math.random() * n);

            //выбрать массив из произвольного места
            result[i] = numbers[r];

            //переместить последний элемент
            //в произвольное место
            numbers[r] = numbers[n - 1];
            n--;
        }

        //вывести отсортированный массив
        Arrays.sort(result);
        System.out.println("Bet the following combination. It'll make you reach!");
        for (int r : result) {
            System.out.println(r);
        }
    }
}