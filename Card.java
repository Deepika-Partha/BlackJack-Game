public class Card implements Comparable {
   public static final int TWO = 0;
   public static final int THREE = 1;
   public static final int FOUR = 2;
   public static final int FIVE = 3;
   public static final int SIX = 4;
   public static final int SEVEN = 5;
   public static final int EIGHT = 6;
   public static final int NINE = 7;
   public static final int TEN = 8;
   public static final int JACK = 9;
   public static final int QUEEN = 10;
   public static final int KING = 11;
   public static final int ACE = 12;

   public static final int CLUBS = 0;
   public static final int DIAMONDS = 1;
   public static final int HEARTS = 2;
   public static final int SPADES = 3;
   
   private static final String[] myValues = {"2", "3", "4", "5", "6", 
   "7", "8", "9", "10", "J", "Q", "K", "A"};
 
   private static final String[] mySuits = {"C", "D","H", "S"};

   private final int iMySuit;
   private final int iMyValue;


   public Card(int value, int suit){
   iMyValue = value;
   iMySuit = suit;
   }

   public int getValue(){ 
   return iMyValue; 
   }
 
   public int getSuit(){ 
   return iMySuit; }

   public boolean validValue(int value){ 
   return (TWO <= value) && (value <= ACE); 
   }

   public boolean validSuit(int suit){ 
   return (CLUBS <= suit) && (suit <= SPADES); 
   }

   public boolean equals(Object otherCard){ 
   boolean result = false;
   if(otherCard == this)
   result = true;
      else if(otherCard != null && getClass() == otherCard.getClass()){ 
      Card tempCard = (Card) otherCard;
      result = (iMyValue == tempCard.iMyValue)
      && (iMySuit == tempCard.iMySuit);
      }
   return result;
   }

   public String toString(){ 
   return  myValues[iMyValue] + mySuits[iMySuit]; 
   }


   public int compareTo(Object other){ 
   Card otherCard = (Card)other;
   int result = iMyValue - otherCard.iMyValue;
   if( result == 0 )
   result = iMySuit - otherCard.iMySuit;
   return result;
   }

}