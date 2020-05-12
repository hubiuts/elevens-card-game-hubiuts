package collegeboard.elevens;

public class CardTester {
	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card c1 = new Card("2", "Spades", 2);
		Card c2 = new Card("3", "Heats", 3);
		Card c3 = new Card("4", "Clubs", 4);
		System.out.println("One matches two?" + c1.matches(c2));
		System.out.println("One matches three?" + c1.matches(c3));    
		System.out.println("Suit of Card One: " + c1.suit());
		System.out.println("Card one: " + c1.toString());
	}
}
