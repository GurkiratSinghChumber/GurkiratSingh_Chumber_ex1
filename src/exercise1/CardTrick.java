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
 */
public class CardTrick {
    
    public static void main(String[] args) {
        
        Card[] hand = new Card[7];
        Random rand = new Random();

        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            int value = rand.nextInt(13) + 1 ;
            int suit_int = rand.nextInt(4);
            
            
            //card.setValue(insert call to random number generator here)
            // 
            card.setValue(value);
            //card.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            // Hint: You can use Random -> random.nextInt(n) to get a random number between 0 and n-1 (inclusive)
            //       Don't worry about duplicates at this point
            String suit = Card.SUITS[suit_int];
            
  
            card.setSuit(suit);
            hand[i] = card;
            
        }
        
        
        

        // insert code to ask the user for Card value and suit, create their card
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value between 1 to 10 and 11 for jack, 12 for queen, etc.");
        int value = sc.nextInt();
        System.out.println("1 for Hearts, 2 for Diamonds, 3 for spades, 4 for clubs");
        int suit_value = sc.nextInt();
        String suit = Card.SUITS[suit_value - 1]; 
        
        Card playerCard = new Card();
        
        playerCard.setValue(value);
        playerCard.setSuit(suit);
    
        boolean isEqual = false;
        for (Card card : hand){
            if (card.equals(playerCard)){
                isEqual = true;
                break;
            }
           
        }
        
        if(isEqual){
            printInfo();
        }else{
            System.out.print("Sorry better luck next time");
        }
        
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