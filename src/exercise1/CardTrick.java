package exercise1;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author dancye
 * @author Paul Bonenfant Jan 25, 2022
 * @author Hammad Shaikh Jan 24, 2023
 */
public class CardTrick {
    
    public static void main(String[] args) {
        
        Card[] hand = new Card[7];

        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            Random random = new Random();
            //card.setValue(insert call to random number generator here)
            card.setValue(random.nextInt(13)+1);
            // 
            int suit = random.nextInt(4);
            card.setSuit(Card.SUITS[suit]);
            System.out.println(card.getSuit() + " " + card.getValue());
            hand[i] = card;
            //card.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            // Hint: You can use Random -> random.nextInt(n) to get a random number between 0 and n-1 (inclusive)
            //       Don't worry about duplicates at this point
        }
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number 1-4 for a suit (Hearts, Diamonds, Spades, Clubs): ");
        int suit = input.nextInt();
        System.out.println("Please enter a number 1-13 for a card value: ");
        int value = input.nextInt();
        for (int i = 0; i < hand.length; i++){
            if (Card.SUITS[suit - 1].equals(hand[i].getSuit()) && value == hand[i].getValue()){
                printInfo();
                System.exit(0);
            }
            else
                continue;
        }
        System.out.println("No matches");

        // insert code to ask the user for Card value and suit, create their card
        // and search the hand here. 
        // Hint: You can ask for values 1 to 10, and then
        //       11 for jack, 12 for queen, etc. (remember arrays are 0-based though)
        //       1 for Hearts, 2 for Diamonds, etc. (remember arrays are 0-based though)
        // 
        // Then loop through the cards in the array to see if there's a match.
        
        // If the guess is successful, invoke the printInfo() method below.
        
    }

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Paul Bonenfant Jan 2022
     */
    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Paul, but you can call me prof, Paul or sir");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- Be more active on LinkedIn");
        System.out.println("-- Have a semester with no violations of academic integrity!");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Investing");
        System.out.println("-- Cooking");
        System.out.println("-- Reading/Watching TV");
        System.out.println("-- Riding my motorcycle");

        System.out.println();
        
    
    }

}
