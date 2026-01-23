import java.util.Scanner;
import java.util.Random;

public class Rock {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        
        System.out.println("Choose Game Mode:");
        System.out.println("1. Player vs Computer");
        System.out.println("2. Player vs Player");

        int mode = sc.nextInt();
        sc.nextLine(); 

        
        System.out.print("Player 1 - Enter choice (rock, paper, scissors): ");
        String player1 = sc.nextLine().toLowerCase();
        String player2;
        if (mode == 1) {
            String[] options = {"rock", "paper", "scissors"};
            player2 = options[random.nextInt(3)];
            System.out.println("Computer chose: " + player2);
        } else {
            System.out.print("Player 2 - Enter choice (rock, paper, scissors): ");
            player2 = sc.nextLine().toLowerCase();
        }

        // Winner decision
        if (player1.equals(player2)) {
            System.out.println("Result: Draw");
        }
        else if (
            (player1.equals("rock") && player2.equals("scissors")) ||
            (player1.equals("paper") && player2.equals("rock")) ||
            (player1.equals("scissors") && player2.equals("paper"))
        ) {
            System.out.println("Result: Player 1 Wins");
        }
        else {
            System.out.println("Result: Player 2 Wins");
        }

        sc.close();
    }
}
