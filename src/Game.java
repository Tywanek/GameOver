import java.util.Random;
import java.util.Scanner;

public class Game {
    private String userName;
    private int userNumber;
    private int randomNumber;
    private int shotCounter = 0;
    private static final int RANDOM_BOUND = 100;
    private Scanner scanner = new Scanner(System.in);

    public void getUserName() {
        System.out.println("What is your name?");
        this.userName = scanner.nextLine();
    }

    public void getUserNumber() {
        System.out.println("Guess your number:");
        this.userNumber = scanner.nextInt();
        this.shotCounter++;
    }

    public void drawRandomNumber() {
        Random random = new Random();
        this.randomNumber = random.nextInt(RANDOM_BOUND);
        System.out.println("Random number:" + randomNumber);
    }

    public void startTheGame() {
        if (userNumber > randomNumber) {
            System.out.println("Za dużo");
            getUserNumber();
            startTheGame();
        } else if (userNumber < randomNumber) {
            System.out.println("Za malo");
            getUserNumber();
            startTheGame();
        } else {
            System.out.println(userName +" you won!");
            System.out.println("In "+shotCounter + " strikes");

        }
    }
}
