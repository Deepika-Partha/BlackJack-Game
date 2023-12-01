public class StandardDeckDriver
{
   //main method for testing the StandardDeck class
   public static void main(String[] args)
   {
     {
 StandardDeck s = new StandardDeck();
  //should outprint each of the 52 in order
  System.out.println(s);
  //should remove and return the first card (2 of Clubs)
 System.out.println(s.removeFirstCard());

 System.out.println(s.numberOfCards()); // output: 51

 s.addCard(0, 0);
 System.out.println(s.numberOfCards()); // output: 52

 System.out.println(s.removeFirstCard());
 //should remove and return the new first card (2 of Diamonds)
 s.addCard(0,0);
 System.out.println(s.numberOfCards());
 //51, because the card (0,0) already exists in the deck.
 s.addCard(0,1);
 System.out.println(s.numberOfCards());//52

 s.shuffleDeck();
 System.out.println(s.toString()); //52 cards, NOT in order

 s.removeFirstCard();
 s.removeFirstCard();
System.out.println(s.numberOfCards()); //50

 s.reset();
 System.out.println(s.numberOfCards()); //52
 System.out.println(s.toString()); //52 cards, NOT in any previous order   
 }
   }//main
}//class

/*
OUTPUT:
Total Cards: 52 [2 of Clubs, 3 of Clubs, 4 of Clubs, 5 of Clubs, 6 of Clubs, 7 of Clubs, 8 of Clubs, 9 of Clubs, 10 of Clubs, Jack of Clubs, Queen of Clubs, King of Clubs, Ace of Clubs, 2 of Diamonds, 3 of Diamonds, 4 of Diamonds, 5 of Diamonds, 6 of Diamonds, 7 of Diamonds, 8 of Diamonds, 9 of Diamonds, 10 of Diamonds, Jack of Diamonds, Queen of Diamonds, King of Diamonds, Ace of Diamonds, 2 of Hearts, 3 of Hearts, 4 of Hearts, 5 of Hearts, 6 of Hearts, 7 of Hearts, 8 of Hearts, 9 of Hearts, 10 of Hearts, Jack of Hearts, Queen of Hearts, King of Hearts, Ace of Hearts, 2 of Spades, 3 of Spades, 4 of Spades, 5 of Spades, 6 of Spades, 7 of Spades, 8 of Spades, 9 of Spades, 10 of Spades, Jack of Spades, Queen of Spades, King of Spades, Ace of Spades]
 2 of Clubs
 51
 52
 3 of Clubs
 52
 53
 Total Cards: 53 [King of Spades, Queen of Diamonds, Jack of Hearts, 8 of Diamonds, 10 of Diamonds, King of Diamonds, 3 of Hearts, 8 of Spades, 9 of Diamonds, 8 of Clubs, 10 of Clubs, 6 of Spades, 9 of Clubs, 10 of Spades, 5 of Clubs, 10 of Hearts, Ace of Diamonds, Jack of Clubs, King of Hearts, 6 of Diamonds, 9 of Hearts, 7 of Hearts, 2 of Diamonds, 4 of Clubs, 2 of Spades, King of Clubs, 6 of Clubs, 7 of Spades, 2 of Hearts, Queen of Hearts, Jack of Diamonds, Queen of Spades, Ace of Hearts, Jack of Spades, 3 of Spades, 4 of Hearts, 7 of Diamonds, 8 of Hearts, 5 of Hearts, 6 of Hearts, 2 of Clubs, Ace of Spades, 4 of Spades, 2 of Diamonds, 5 of Diamonds, 3 of Diamonds, 5 of Spades, 7 of Clubs, 4 of Diamonds, 9 of Spades, 2 of Clubs, Queen of Clubs, Ace of Clubs]
 51
 52
 Total Cards: 52 [10 of Spades, 9 of Diamonds, 2 of Spades, 7 of Hearts, King of Spades, 10 of Diamonds, 4 of Diamonds, Queen of Spades, 10 of Hearts, 6 of Diamonds, Ace of Clubs, Jack of Hearts, Ace of Spades, 4 of Clubs, 8 of Clubs, 3 of Clubs, 8 of Spades, 6 of Clubs, Jack of Spades, 7 of Spades, 2 of Hearts, 10 of Clubs, 4 of Hearts, 7 of Diamonds, King of Clubs, King of Hearts, 7 of Clubs, Queen of Clubs, 2 of Clubs, Jack of Clubs, 4 of Spades, 8 of Hearts, 3 of Spades, 8 of Diamonds, 3 of Hearts, Ace of Hearts, 9 of Spades, Ace of Diamonds, 6 of Hearts, 9 of Hearts, King of Diamonds, Queen of Diamonds, 5 of Clubs, 3 of Diamonds, 5 of Spades, 5 of Diamonds, 5 of Hearts, 2 of Diamonds, Queen of Hearts, 9 of Clubs, 6 of Spades, Jack of Diamonds]
 


*/