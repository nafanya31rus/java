import java.io.IOException;
import java.util.Scanner;

public class MyClass24 {
    public static void main(String[] args) throws IOException {
        ITunesMusicPlayer player = new ITunesMusicPlayer();
        Scanner scanner = new Scanner(System.in);
        System.out.println("wwhich sont you are looking for?");
        String name = scanner.nextLine();
        player.playSong("love", 100);
    }
}
