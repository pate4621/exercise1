package exercise1;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *Author: Rajvi Patel
 * Date: 30/05/2023
 *  
 */

//I am Done
import java.util.Random;
import java.util.Scanner;


public class CardTrick {
    
    private static final String[] SUITS = {"Hearts", "Diamonds", "Clubs", "Spades"};
    public static void main(String[] args) {
        
        Card[] hand = new Card[7];

        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
card.setValue(getRandomValue());
            card.setSuit(getRandomSuit());
            hand[i] = card;
        }
            //card.setValue(insert call to random number generator here)
            // 
            //card.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            // Hint: You can use Random -> random.nextInt(n) to get a random number between 0 and n-1 (inclusive)
            //       Don't worry about duplicates at this po}
           Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of your card (1-10, 11 for Jack, 12 for Queen, 13 for King, 14 for Ace): ");
        int userValue = scanner.nextInt();
        System.out.print("Enter the suit of your card (1 for Hearts, 2 for Diamonds, 3 for Clubs, 4 for Spades): ");
        int userSuit = scanner.nextInt();

        Card userCard = new Card();
        userCard.setValue(userValue);
        userCard.setSuit(SUITS[userSuit - 1]);

        boolean matchFound = false;
        for (Card card : hand) {
            if (card.getValue() == userCard.getValue() && card.getSuit().equals(userCard.getSuit())) {
                matchFound = true;
                break;
            }
        }
 if (matchFound) {
            printInfo();
        }
    }

    private static int getRandomValue() {
        Random random = new Random();
        return random.nextInt(13) + 2;
    }

    private static String getRandomSuit() {
        Random random = new Random();
        int index = random.nextInt(4);
        return SUITS[index];
    } 
        // insert code to ask the user for Card value and suit, create their card
        // and search the hand here. 
        // Hint: You can ask for values 1 to 10, and then
        //       11 for jack, 12 for queen, etc. (remember arrays are 0-based though)
        //       1 for Hearts, 2 for Diamonds, etc. (remember arrays are 0-based though)
        // 
        // Then loop through the cards in the array to see if there's a match.
// If the guess is successful, invoke the printInfo() method below.
        
    

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Rajvi Patel may 30 2023
     */
    
    private static void printInfo() {
        // printinfo()
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Rajvi Patel");
        System.out.println();
        
        //commit 1 
        System.out.println("My career ambitions:");
        System.out.println("-- Be more active on social media");
        System.out.println("-- Have a semester with no violations of academic integrity!");
	System.out.println();
        
        //commit 2
System.out.println("My hobbies:");
        System.out.println("-- cooking");
        System.out.println("-- outing");
        System.out.println("-- watching movies");
        System.out.println("-- playing games");

        System.out.println();
    }

}