//package myclass40;
//
//import myclass39.Cat;
//import myclass39.Dog;
//
//import java.io.File;
//// Метод принимает Object(любой объект) Что это такое?
//// почему печатается myclass39.Cat@3f3afe78 ?
//
//// факты
//// 1. У КАЖДОГО класса в Java есть метод toString(); - преобразование в строку
//// 2. КАЖДЫЙ класс в Java неявно наследуется от класса Object
//// 3. у каждого класса в Java есть метод toString();
//public class MyClass40 {
//    public static void main(String[] args) {
////        System.out.println(3);
////        System.out.println(3.14);
////        System.out.println(false);
////        System.out.println('o');
////        System.out.println("Hello, world");
//
////        Dog dog = new Dog();
////        System.out.println(dog);
//        Cat cat = new Cat();
//        cat.name = "Barsik";
//        cat.age = 10;
//        System.out.println(cat);
//        String catStr = cat.toString();
//        System.out.println("Cat.toString(): " + catStr);
//
//        File file = new File("table.csv");
//        String info = "I have a file" + file;
//        System.out.println(info);
//
//        Cat cat2 = new Cat();
//        cat2.name = "Chernish";
//        cat2.age = 10;
//        System.out.println("Nice " + cat2);
//
//                 PageDownloader downloader = new PageDownloader();
//                 String pageDownloader = downloader.toString();
//    }
//}
