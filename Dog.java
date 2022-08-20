package myclass39;

public class Dog implements Speakable{
    @Override
    public void speak(String str) {
        System.out.println(str + "Гав Гав!");
    }

    @Override
    public void introduceYourself() {
        System.out.println("Я песик");
    }
}
