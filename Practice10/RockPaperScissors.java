
import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        Random random = new Random();
        
        System.out.println("Welcome To Rock Paper Scissors");
        System.out.println("Enter A to start");
        scn.next();
        
        boolean playAgain = true;
        int playerWins = 0;
        int computerWins = 0;
        int ties = 0;
        
        while(playAgain) {
            System.out.println("\n=== New Round ===");
            System.out.println("Choose your move:");
            System.out.println("1. Rock");
            System.out.println("2. Paper");
            System.out.println("3. Scissors");
            System.out.print("Enter your choice (1-3): ");
            
            int playerChoice = scn.nextInt();
            
            // Validate input
            if(playerChoice < 1 || playerChoice > 3) {
                System.out.println("Invalid choice! Please choose 1, 2, or 3.");
                continue;
            }
            
            // Generate computer choice (1-3)
            int computerChoice = random.nextInt(3) + 1;
            
            // Convert numbers to moves
            String[] moves = {"Rock", "Paper", "Scissors"};
            String playerMove = moves[playerChoice - 1];
            String computerMove = moves[computerChoice - 1];
            
            // Display choices
            System.out.println("\nYou chose: " + playerMove);
            System.out.println("Computer chose: " + computerMove);
            
            // Determine winner
            if(playerChoice == computerChoice) {
                System.out.println("It's a TIE!");
                ties++;
            } else if((playerChoice == 1 && computerChoice == 3) ||  // Rock beats Scissors
                      (playerChoice == 2 && computerChoice == 1) ||  // Paper beats Rock
                      (playerChoice == 3 && computerChoice == 2)) {  // Scissors beats Paper
                System.out.println("YOU WIN!");
                playerWins++;
            } else {
                System.out.println("COMPUTER WINS!");
                computerWins++;
            }
            
            // Display score
            System.out.println("\n--- Current Score ---");
            System.out.println("Your Wins: " + playerWins);
            System.out.println("Computer Wins: " + computerWins);
            System.out.println("Ties: " + ties);
            
            // Ask to play again
            System.out.print("\nPlay again? (Y/N): ");
            String response = scn.next();
            playAgain = response.equalsIgnoreCase("Y");
        }
        
        // Final score
        System.out.println("\n=== FINAL SCORE ===");
        System.out.println("Your Wins: " + playerWins);
        System.out.println("Computer Wins: " + computerWins);
        System.out.println("Ties: " + ties);
        System.out.println("\nThanks for playing!");
        
        scn.close();
    }
}
