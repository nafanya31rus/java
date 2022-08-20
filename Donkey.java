package myclass39;

public class Donkey implements Speakable{
    @Override
    public void speak (String str) {
        System.out.println(str + "!ИА-ИА");
    }

    @Override
    public void introduceYourself() {
        System.out.println("Я ослик");
    }

}
