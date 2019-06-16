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
    }

    public void startTheGame() {
        if (userNumber > randomNumber) {
            System.out.println("Za dużo");
            newShoot();
        } else if (userNumber < randomNumber) {
            System.out.println("Za malo");
            newShoot();
        } else {
            System.out.println(userName + " you won!");
            System.out.println("In " + shotCounter + " strikes");
        }
    }

    private void newShoot() {
        getUserNumber();
        startTheGame();
    }
}
