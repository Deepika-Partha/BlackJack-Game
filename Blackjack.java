import java.util.Scanner;
public class Blackjack extends Player
{
    public static Player Player1;
     public static Player Player2;
     public  static Deck Deck1;
     public static char inputchar;
   public static int whoWins(Player Player1, Player Player2)
   {
      if ((Player1.computePoints() <= 21) && (Player2.computePoints() <= 21))
      {
        if((Player1.computePoints()) > (Player2.computePoints()))
        {
           return 1;
        }
        else if((Player1.computePoints()) == (Player2.computePoints()))
        {
           return 3;
        }
       else
       {
          return 2;
       }
          
      }
     
     else if (Player1.computePoints() > 21)
     {
        return 4;
     }
     
     else if (Player2.computePoints() > 21)
     {
        return 5;
     }
     else
     {
       return 6;
     }
   }
   
   public static int Checkbusted(Player Player1, Player Player2)
   {
     if (Player1.computePoints() > 21)
     {
        //Player 1 busted
        return 4;
     }
     
     else if (Player2.computePoints() > 21)
     {
        //Dealer busted
        return 5;
     }
     else
     {
       //Not busted
       return 6;
     }
   }

   
   public static String  checkGame(int response)
   {
            String Result = "";
       if (response == 1)
       {
         Result = "Player Wins.";
       }
       else if (response == 2)
       {
         Result = "Dealer Wins.";
       }
       else if (response == 3)
       {
         Result = "Tie.";
       }
       else if (response == 4)
       {
         Result = "Player busts.";
       }
       else if (response == 5)
       {
         Result = "Dealer busts.";
       }
      
       
      
      return Result; 
             

   
   }
   
   public static char getInput()
   {
      Scanner console = new Scanner (System.in);
         char inputchar = console.next().charAt(0);
      return inputchar;
   }
   
   public static void printScoreDetails()
   {
   
      //System.out.println("Player’s Hand: " + Player1.PlayerPrintHand()+ " Points : " + Player1.computePoints());
      //System.out.println("Dealer’s Hand: " + Player2.DealerPrintHand()+ " Points : " + Player2.computePoints());
       
      System.out.println("Player’s Hand: " + Player1.PlayerPrintHand());
      System.out.println("Dealer’s Hand: " + Player2.DealerPrintHand());
   }
   
    public static void printResult()
   {
   
    //System.out.println("Player’s Hand: " + Player1.PlayerPrintHand()+ " Points : " + Player1.computePoints());
    //System.out.println("Dealer’s Hand: " + Player2.PlayerPrintHand()+ " Points : " + Player2.computePoints());
     System.out.println("Player’s Hand: " + Player1.PlayerPrintHand());
    System.out.println("Dealer’s Hand: " + Player2.PlayerPrintHand());
   
   }
        
   public static void main(String[]args)
   {
       Deck1 = new Deck();
       Player1 = new Player();
       Player2 = new Player();
      Deck1.shuffleDeck(100);
      //System.out.println(Deck1);
      Player1.takeACard(Deck1);
      Player1.takeACard(Deck1);
      
      Player2.takeACard(Deck1);
      Player2.takeACard(Deck1);
      
      printScoreDetails();

      System.out.println("");
      System.out.print("Enter Command:");

       inputchar = getInput();
      
      Boolean loop = true;
      while (loop )     
      {
         if (inputchar == 'h')
         {
            Player1.takeACard(Deck1);
            int response = Checkbusted( Player1,  Player2);
            if (response == 6)
            {
               printScoreDetails();
               System.out.println("");
               System.out.print("Enter Command:");
            }
            else
            {
               printResult();
               System.out.println("");

               System.out.println( checkGame(response));
               System.out.println("");

               System.out.print("Enter ’q’ to quit, anything else to play another hand:");
            }
              inputchar = getInput();

            

         
         }
         else if (inputchar == 's')
         {
            //should add a card otherwise says win without adding card to dealer
            Boolean loopTil = true;
               
               while (loopTil)
               {
               
                 if (!(Player2.computePoints() <= 19) && (Player2.computePoints() <=21) && (Player2.computePoints() <= Player1.computePoints()))
                 {
                    Player2.takeACard(Deck1);

                 
                 }
                 else
                 {
                    loopTil = false;
                 }
               }

                       
              printResult();
              System.out.println("");

              
               int response = whoWins( Player1,  Player2);

              System.out.println( checkGame(response));
              System.out.println("");

              System.out.print("Enter ’q’ to quit, anything else to play another hand:");
           
              inputchar = getInput();


         }
         else if (inputchar == 'q')
         {
             break;
         }
        
        else if ((inputchar != 'q') && (inputchar != 'h') && (inputchar != 's') )
         {
            String args1[] = {"1","2"};
            Blackjack.main(args1);         
         }
      }
       
   
   }
}

