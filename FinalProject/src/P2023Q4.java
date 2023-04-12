// This program tests the Journal class.

import java.io.* ;

class P2023Q4
{
   public static void main (String[] args) throws IOException
   { 
    // VARIABLE DECLARATIONS AND DATA DICTIONARY
       Client larry, grace;
       Item book1, book2, dvd1, dvd2, game;
       Purchase purchase1, purchase2, purchase3, purchase4;
       boolean result; 
       int[] larryPurchases, gracePurchases;
       int index;

    // DISPLAY OF THE IDENTIFICATION INFO
       System.out.println("Question 4: Test for Journal class");
       System.out.println();

    // MODULE OF THE ALGORITHM
       Journal.initialize(3);  // Initialize the log with 3 items

       // Create some users and items
       larry  = new Client("Larry O'Brien", "larry@obrien.ca", "Noël");
       grace  = new Client("Grace Hopper", "grace@coldmail.org", "ComputerScience");
       
       book1 = new Item(Item.BOOK, "Da Vinci Code", 12, 3);
       book2 = new Item(Item.BOOK, "Garfield", 5, 1);
       dvd1   = new Item(Item.DVD, "Harry Potter III", 15, 5);
       dvd2   = new Item(Item.DVD, "Schindler's List", 25, 1);
       game    = new Item(Item.GAME, "HALO 2", 35, 2);

       // Create some purchases and add them to the Journal
       Item[] items1 = {book1, book2, game};
       purchase1 = new Purchase( larry, 1, items1 );
       Journal.add(purchase1);

       Item[] items2 = {dvd1, dvd2, game};
       purchase2 = new Purchase( grace, 1, items2 );
       Journal.add(purchase2);
       
       Item[] items3 = {dvd1};
       purchase3 = new Purchase( larry, 3, items3 );
       Journal.add(purchase3);


       // Test the three other methods of the Journal class
       System.out.println("Who bought " + dvd1.getTitle() + "?");
       Journal.displayPurchasesItem (dvd1);
       System.out.println();
       System.out.println("Who bought " + game.getTitle() + "?");
       Journal.displayPurchasesItem(game);
       System.out.println();

       System.out.print("Purchases for " + larry.getName() + ": { ");
       larryPurchases=Journal.purchasesForClient(larry);
       for (index=0; index < larryPurchases.length; index = index + 1)
       {
         System.out.print(larryPurchases[index] + " ");
       }
       System.out.println("}");
            
       System.out.print("Purchases for " + grace.getName() + ": { ");
       gracePurchases=Journal.purchasesForClient(grace);
       for (index=0; index < gracePurchases.length; index = index + 1)
       {
         System.out.print(gracePurchases[index] + " ");
       }
       System.out.println("}");
       
       System.out.println("Total of purchases: " + Journal.calculatesTotalPurchases());
       System.out.println();
       
       // Test the maximum number of purchases in the log
       Item[] items4 = {book1};
       purchase4 = new Purchase( grace, 4, items4 );
       Journal.add(purchase4); // Should generate an error
   }
}