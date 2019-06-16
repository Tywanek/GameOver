import java.util.Random;
import java.util.Scanner;

public class Game {
    private int randomNumber;
    private int userNumber;

    public void getUserNumber() {
        System.out.println("Guess your number:");
        Scanner scanner = new Scanner(System.in);
        this.userNumber = scanner.nextInt();
    }

    public void drawRandomNumber() {
        Random random = new Random();
        this.randomNumber = random.nextInt(100);
        System.out.println("Random number:"+randomNumber);
    }

    public void startTheGame() {
        if (userNumber > randomNumber) {
            System.out.println("Za dużo");
        } else if (userNumber < randomNumber) {
            System.out.println("Za malo");
        } else {
            System.out.println("Wygrales");
        }
    }
}
