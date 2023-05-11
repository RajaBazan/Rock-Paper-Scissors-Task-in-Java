package Company.com;
import java.util.Scanner;
public class Rock_Paper_Scissors_Task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("user1, enter your choice (rock, paper, scissors): ");
        String user1Choice = sc.next();

        System.out.print("user2, enter your choice (rock, paper, scissors): ");
        String user2Choice = sc.next();

        if (user1Choice.equals(user2Choice)) {
            System.out.println("It's a tie!");
        } else if (user1Choice.equals("rock") && user2Choice.equals("scissors") ||
                user1Choice.equals("paper") && user2Choice.equals("rock") ||
                user1Choice.equals("scissors") && user2Choice.equals("paper")) {
            System.out.println("User1 wins!");
        } else {
            System.out.println("User2 wins!");
        }
        return;
    }
    }

