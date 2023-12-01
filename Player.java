import java.util.*;
public class Player 
{
   public ArrayList <Card> hand;
   public int numOfCards = 0;
   
    
 
   public Player() 
   {      
      hand = new ArrayList<Card>();
   } 
   
   public void takeACard(Deck d)
   {
      Card newCard = d.getTopCard();
      hand.add(newCard);
      
      numOfCards ++;
   }
   
   public int computePoints()
   {
      Card currentCard;
      int points = 0;
      int Value = 0;
         for (int i  = 0; i <= hand.size()-1; i++) 
         {
            currentCard = hand.get(i);
            Value = currentCard.getValue() + 2;
                       
            
            if((Value == 11)||(Value == 12)||(Value == 13))
            {
               points = points+10;
            }
         
            else if(Value == 14)
            {
               if (points + 11 > 21)
               {
                  points = points + 1;
               }
               
               else 
               {
                  points = points + 11;
               }
            }
            
            else
            {
               points = points + Value;
            }
         }
     
      return points;
   }
   
   public void showHand() 
   {
      System.out.println(hand);
      System.out.println("Number of Cards: " + hand.size());
   }

   public void discardHand()
   {
      for (int i = hand.size(); i >= 0; i--)
      {
         hand.remove(i);  
      }
   }
   
   public String toString()
{
  return hand.size() + " " + hand;
}


public String PlayerPrintHand()
   {
      String DealerPrint = "";
       Card TopCard ;
      for (int i = 0; i < hand.size(); i++)
      {
         TopCard = hand.get(i);
       
         if (i == hand.size() -1 )
         {
            DealerPrint =  DealerPrint +  TopCard.toString()  ;
         }
         else
         {
          DealerPrint =  DealerPrint +  TopCard.toString() + "," ;
         }
      }
     return DealerPrint;
   } 


   public String DealerPrintHand()
   {
      String DealerPrint = "";
       Card TopCard;
      for (int i = 0; i < hand.size(); i++)
      {
         TopCard = hand.get(i);
         if ( i == 1)
         {
            DealerPrint =  DealerPrint +  "X"  ;

         }
         else if (i == hand.size() -1 )
         {
            DealerPrint =  DealerPrint +  TopCard.toString()  ;
         }
         else
         {
          DealerPrint =  DealerPrint +  TopCard.toString() + "," ;
         }
      }
     return DealerPrint;
   } 
      
  

   
}//player