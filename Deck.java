import java.util.*;
public class Deck 

{

public ArrayList <Card> Deck1;
public Card TopCard;
public int topCardPos;

public Deck ()
{
   Deck1 = new ArrayList<Card>();
   for (int i=0; i<4; i++)
      {
         for(int j=0; j<13; j++ )
            {
               Deck1.add(new Card(j,i));
            }
      }
      
   int topCardPos = 0;
}
  
public void shuffleDeck(int n)
  {
     for (int i = 0; i<= n; i++)
        {
           ArrayList<Card> tempdeck = new ArrayList<Card>();
           while(!Deck1.isEmpty()) 
              {
                 int loc = (int)(Math.random()*Deck1.size());
                 tempdeck.add(Deck1.get(loc));
                 Deck1.remove(loc);   
              }
           
           Deck1=tempdeck;
        }
  }//shuffle 
  
public int getTopCardPos() 
{
   return topCardPos;
} 
  
public Card getTopCard()
{
   topCardPos++;
   return Deck1.get(topCardPos-1);
   
}

public String toString()
{
  return "Cards: " + Deck1.size() + " " + Deck1;
}
    
         

}//StandardDeck