import java.util.Scanner;

class DeckOfCards {
    public static String[] initializeDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        int numberOfCards = suits.length * ranks.length;

        String[] deck = new String[numberOfCards];
        int index = 0;

        for (int suit = 0; suit < suits.length; suit++) {
            for (int rank = 0; rank < ranks.length; rank++) {
                deck[index] = ranks[rank] + " of " + suits[suit];
                index++;
            }
        }
        return deck;
    }

    public static void shuffleDeck(String[] deck) {
        int totalCards = deck.length;
        for (int i = 0; i < totalCards; i++) {
            int randomCardNumber = i + (int)(Math.random() * (totalCards - i));
            String temporaryCard = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temporaryCard;
        }
    }

    public static String[][] distributeCards(String[] deck, int players, int cardsPerPlayer) {
        if (players * cardsPerPlayer > deck.length) {
            return null;
        }

        String[][] playerCards = new String[players][cardsPerPlayer];
        int cardIndex = 0;

        for (int player = 0; player < players; player++) {
            for (int card = 0; card < cardsPerPlayer; card++) {
                playerCards[player][card] = deck[cardIndex++];
            }
        }

        return playerCards;
    }

    public static void displayCards(String[][] playerCards) {
        System.out.println("\nCards Distribution\n");

        for (int player = 0; player < playerCards.length; player++) {
            System.out.println("Player " + (player + 1) + ":");
            for (int card = 0; card < playerCards[player].length; card++) {
                System.out.println(playerCards[player][card]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Players: ");
        int players = sc.nextInt();

        System.out.print("Enter Cards Per Player: ");
        int cardsPerPlayer = sc.nextInt();

        String[] deck = initializeDeck();
        shuffleDeck(deck);

        String[][] playerCards = distributeCards(deck, players, cardsPerPlayer);

        if (playerCards == null) {
            System.out.println("Not Enough Cards Available");
        }
        else {
            displayCards(playerCards);
        }

        sc.close();
    }
}