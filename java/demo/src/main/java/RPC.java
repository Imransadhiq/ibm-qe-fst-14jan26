import java.util.Scanner;
import java.util.Random;

public class RPC {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Enter your choice (rock / paper / scissors):");
        String userChoice = sc.nextLine().toLowerCase();
        if (!userChoice.equals("rock") &&
            !userChoice.equals("paper") &&
            !userChoice.equals("scissors")) {

            System.out.println("Invalid input!");
            System.out.println("Please enter only: rock, paper, or scissors.");
        

        }
        String[] options = {"rock", "paper", "scissors"};
        String computerChoice = options[random.nextInt(3)];

        System.out.println("Computer choice: " + computerChoice);
        if (userChoice.equals(computerChoice)) {
            System.out.println("It's a Draw!");
        }
        else if (
                (userChoice.equals("rock") && computerChoice.equals("scissors")) ||
                (userChoice.equals("paper") && computerChoice.equals("rock")) ||
                (userChoice.equals("scissors") && computerChoice.equals("paper"))
        ) {
            System.out.println(" You Win!");
        }
        else {
            System.out.println("Computer Wins!");
        }

        sc.close();
    }
}