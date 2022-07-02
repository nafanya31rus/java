import java.util.Scanner;

public class MyClass25 {
    public static void main(String[] args) {
//        int size = 20;
//
//        for(int i =1; i<10; i++){
//            System.out.print(i + "   ");
//        }
//        for(int i =10; i<20; i++){
//            System.out.print(i + "  ");
//        }
//        System.out.println();
//
//        for (int row = 2; row < size; row++) {
//            for (int col = 1; col < size; col++) {
//                int mult = row*col;
//                if(mult>=100){
//                    System.out.print(mult + " ");
//
//                } else if (mult >= 10) {
//                    System.out.print(mult + "  ");
//                } else {
//                    System.out.print(mult + "   ");
//                }
//
//            }
//            System.out.println();
//        }

//        char[][] superArr = new char[3][5];
//        char [] arr1 = superArr[0];
//        arr1[0] = '.';
//        arr1[1] = '-';
//        arr1[2] = '.';
//        arr1[3] = '-';
//        arr1[4] = '.';
//
//        char [] arr2 = superArr[1];
//        arr2[0] = '-';
//        arr2[1] = '.';
//        arr2[2] = '-';
//        arr2[3] = '.';
//        arr2[4] = '-';
//
//        char [] arr3 = superArr[2];
//        arr3[0] = '.';
//        arr3[1] = '.';
//        arr3[2] = '.';
//        arr3[3] = '.';
//        arr3[4] = '.';

        char[][] battleField = new char[10][10];
        printColNumber();
        for(int row= 0; row <10; row++){
            printRowNumber(row);
            for(int col=0; col<10; col++) {
                boolean sergey1 = row == 0 && col < 4;
                boolean sergey2 = row >= 2 && row <= 4 && col == 3;
                boolean olga1 = col==7 && row>=5 && row <=7;
                boolean olga2 = row == 9 && col>=1 && col <=4;
                 if (sergey1 || sergey2) {
                    System.out.print("[C]");
                    battleField[row][col] = 'C';
                } else if (olga1 || olga2) {
                    System.out.print("[ ]");
                    battleField[row][col]= 'O';
                } else{
                     System.out.print("[ ]");
                     battleField[row][col] = '-';
                 }
            }
            System.out.println();
        }
        int olgaShipLives = 7;

        while(olgaShipLives > 0) {
            System.out.println("Sergei, make your turn");
            System.out.print("row num: ");
            Scanner scanner = new Scanner(System.in);
            int chosenRow = scanner.nextInt();
            System.out.print("col num: ");
            int chosenCol = scanner.nextInt();
            chosenCol--;
            chosenRow--;
            char row[] = battleField[chosenRow];

        if(battleField[chosenRow] [chosenCol] =='O'){
            battleField[chosenRow][chosenCol] = 'X';
            olgaShipLives--;
            System.out.println("ranil");
        } else{
            System.out.println("mimo");
        } if(olgaShipLives == 0){
            System.out.println("Sergei win");
            }
        }
    }

    private static void printRowNumber(int row) {
        System.out.print(row + 1);
        if(row +1 ==10){
            System.out.print(" ");
        } else{
            System.out.print("  ");
        }
    }

    private static void printColNumber() {
        System.out.print("   ");
        for(int i = 1; i<=10; i++){

            System.out.print(" " + i + " ");
        }
        System.out.println();
    }

}