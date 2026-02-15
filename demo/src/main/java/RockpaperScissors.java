import java.util.Scanner;
import java.util.Random;

public class RockpaperScissors {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Enter your choice:");
        System.out.println("0 = Rock");
        System.out.println("1 = Paper");
        System.out.println("2 = Scissors");

        int userChoice = sc.nextInt();
        int computerChoice = random.nextInt(3);

        System.out.println("Computer choice: " + computerChoice);

        if (userChoice == computerChoice) {
            System.out.println("It's a Draw!");
        }
        else if (
                (userChoice == 0 && computerChoice == 2) ||
                (userChoice == 1 && computerChoice == 0) ||
                (userChoice == 2 && computerChoice == 1)
        ) {
            System.out.println("You Win!");
        }
        else {
            System.out.println("Computer Wins!");
        }

        sc.close();
    }
}
