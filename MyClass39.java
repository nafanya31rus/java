package myclass39;

public class MyClass39 {
    public static void main(String[] args) {
//        Speakable speakable = new Donkey();
//        sayHello(speakable);
        TableScanner tableScanner = new TableScanner();
        System.out.println("Please enter table... ");
        Row[] table = tableScanner.scanTable();
        TableWriter tableWriter = new CsvTableWriter();
        tableWriter.writeTable(table);
        System.out.println("Table written to" + tableWriter.getOutputPlace());
    }

//    public static void sayHello(Speakable speakable ) {
//        speakable.introduceYourself();
//        speakable.speak("Привет");
//
//    }
}
