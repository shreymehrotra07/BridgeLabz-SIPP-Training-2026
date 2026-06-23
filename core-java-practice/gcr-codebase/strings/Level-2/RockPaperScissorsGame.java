import java.util.Scanner;

class RockPaperScissorsGame {
    public static String getComputerChoice() {
        int choice = (int)(Math.random() * 3);

        if (choice == 0) return "Rock";

        if (choice == 1) return "Paper";

        return "Scissors";
    }

    public static int findWinner(String player, String computer) {
        if (player.equals(computer))
            return 0;

        if ((player.equals("Rock") && computer.equals("Scissors")) || (player.equals("Paper") && computer.equals("Rock")) || (player.equals("Scissors") && computer.equals("Paper"))) {
            return 1;
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of Games: ");
        int games = sc.nextInt();

        int playerWins = 0;
        int computerWins = 0;

        for (int i = 1; i <= games; i++) {
            System.out.print( "\nEnter Rock/Paper/Scissors: ");
            String playerChoice = sc.next();

            String computerChoice = getComputerChoice();
            int winner = findWinner(playerChoice, computerChoice);

            System.out.println( "Computer = " + computerChoice);

            if (winner == 1)
                playerWins++;

            else if (winner == -1)
                computerWins++;
        }

        double playerPercentage = (playerWins * 100.0) / games;
        double computerPercentage = (computerWins * 100.0) / games;

        System.out.println("\nPlayer Wins = " + playerWins);
        System.out.println("Computer Wins = " + computerWins);
        System.out.println("Player % = " + playerPercentage);
        System.out.println("Computer % = " + computerPercentage);

        sc.close();
    }
}