//демонстрация работы с "отказоустойчивым" массивом

public class FSDemo {
    public static void main(String[] args) {
        FailSoftArray fs = new FailSoftArray(5, -1);
        int x;

        //демонстрация корректной обработки ошибок
        System.out.println("обработка ошибок без вывода отчёта.");
        for(int i = 0; i < (fs.length * 2); i++ )
            fs.put(i, i * 10);

        for(int i = 0; i < (fs.length * 2); i++) {
            x = fs.get(i);
            if(x != - 1) System.out.print(x + " ");
        }
        System.out.println(" ");

        //обработка ошибок
        System.out.println("\nобработка ошибок с выводом отчёта.");
        for(int i = 0; i < (fs.length * 2); i++)
            if(!fs.put(i, i * 10))
                System.out.println("Индекс " + i + " Вне допустимого диапозона");

        for(int i = 0; i < (fs.length * 2); i++) {
            x = fs.get(i);
            if(x != -1) System.out.print(x + " ");
            else System.out.println("Индекс " + i + " вне допустимого диапозона");
        }
    }

}
