package myclass39;

public class Cat implements Speakable{
    @Override
    public void speak(String str){
        System.out.println(str + "! мЯу");
    }

    @Override
    public void introduceYourself() {
        System.out.println("Я кот");
    }
}
