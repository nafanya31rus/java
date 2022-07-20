public class FailSoftArray {
    private int a[];    //сылка на массив
    private int errval;     //значение, возвращаемое в случае
                            //возникновения ошибки при выполнении
                            //метода get()
    public int length;      //открытая переменная length

    //Конструктору данного класса предаются размер массива
    //и значение, которое должен возвращать метод get() при
    //возникновении ошибки
    public FailSoftArray(int size, int errv){
        a = new int [size];
        errval = errv;
        length = size;
    }

    //возврат значения элемента массива с заданным индексом
    public int get (int index) {
        if(indexOK(index)) return a[index];
        return errval;
    }

    //установка значения элемента с заданным индексом.
    //если возникает ошибка, вернуть лиогическое значение false.
    public boolean put(int index, int val) {
        if(indexOK(index)) {
            a [index] = val;
            return true;
        }
        return false;
    }

    //возврат логического значения true, если индеккс
    //не выходит за пределы массива
    private boolean indexOK(int index) {
        if(index >= 0 & index < length) return true;
        return false;
    }
}
