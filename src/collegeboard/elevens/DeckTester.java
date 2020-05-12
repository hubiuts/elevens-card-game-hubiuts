package collegeboard.elevens;

public class DeckTester {
	
	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		String[] ranks = new String[52];
        String[] suits = new String[52];
        int[] pointValues = new int[52];
        for (int i = 1; i <= 52; i++) {
            String rank = "";
            String suit = "";
            if (i % 13 == 11 ) {
                rank = "Jack";
            }
            else if (i % 13 == 12 ) {
                rank = "Queen";
            }
            else if (i % 13 == 0 ) {
                rank = "King";
            }
            else if (i % 13 == 1 ) {
                rank = "Ace";
            }
            else {
                rank = Integer.toString(i % 13);
            }
            
            if (i <= 13) {
                suit = "Hearts";
            }
            else if (i <= 26) {
                suit = "Diamonds";
            }
            else if (i <= 39) { 
                suit = "Clubs";
            }
            else {
                suit = "Spades";
            }
            
            ranks[i] = rank;
            suits[i] = suit;
            pointValues[i] = (i % 13);
        }
        
        Deck e = new Deck(ranks, suits, pointValues);
        System.out.println(e);
	}
}
