//This program tests the Purchase class

import java.io.* ;

class P2023Q3
{
   public static void main (String[] args) throws IOException
   { 
    // VARIABLE DECLARATIONS AND DATA DICTIONARY 
       Client larry, grace;
       Item book1, book2, dvd1, dvd2, game;
       Purchase purchase0, purchase1, purchase2, purchase3, purchase4;
       boolean result;       

    //DISPLAY OF THE IDENTIFICATION INFO
       System.out.println("Question 3: Tests the Purchase class");
       System.out.println();

    // MODULE OF THE ALGORITHM
       // Create some users and items
       larry  = new Client("Larry O'Brien", "larry@obrien.ca", "Christmas");
       grace  = new Client("Grace Hopper", "grace@coldmail.org", "ComputerScience");
       book1 = new Item(Item.BOOK, "Da Vinci Code", 12, 3);
       book2 = new Item(Item.BOOK, "Garfield", 5, 2);
       dvd1   = new Item(Item.DVD, "Harry Potter III", 15, 5);
       dvd2   = new Item(Item.DVD, "Schindler's List", 20, 1);
       game    = new Item(Item.GAME, "HALO 2", 35, 2);

       // Test a purchase whose total cost is smaller than the amount credited
       Item[] items0 = {book2};
       purchase0 = new Purchase( larry, 1, items0 );
       
       // Test the display and the credited amount
       System.out.print(purchase0);
       System.out.println("Amount yet to be credited for " + purchase0.getClientName() 
                           + " : " + larry.getCredit() + "$");
       System.out.println( "It remains " + book2.getCopiesDispo() 
                           + " copies of " + book2.getTitle() );
       System.out.println();
       
       // Test a purchase
       Item[] items1 = {book1, book2, game};
       purchase1 = new Purchase( larry, 1, items1 );

       System.out.println(purchase1);
       System.out.println( "It remains " + book2.getCopiesDispo() 
                           + " copies of " + book2.getTitle() );       
       // Test some accessors
       System.out.println("Invoice #" + purchase1.getNumInvoice()
                          + ", cost: " + purchase1.getTotalCost()
                          + "$, purchased on the day: " + purchase1.getDate() );
       System.out.println("Amount yet to be credited for " + purchase1.getClientName() 
                           + " : " + larry.getCredit() + "$");
       System.out.println();
       
       // Test other purchases and itemHere
       Item[] items2 = {dvd1, dvd2, game};
       purchase2 = new Purchase( grace, 2, items2 );
       System.out.println(purchase2);
       
       Item[] items3 = {dvd1, book2}; // Note: there is no more Garfield available here...
       purchase3 = new Purchase( larry, 4, items3 );
       System.out.println(purchase3);
       
       System.out.println( dvd1.getTitle() + " purchased in buy0? " + purchase0.itemHere(dvd1) );
       System.out.println( dvd1.getTitle() + " purchased in buy1? " + purchase1.itemHere(dvd1) );
       System.out.println( dvd1.getTitle() + " purchased in buy2? " + purchase2.itemHere(dvd1) );
       System.out.println( dvd1.getTitle() + " purchased in buy3? " + purchase3.itemHere(dvd1) );
       System.out.println();

       Item[] items4 = {game};
       purchase4 = new Purchase( larry, 8, items4 );
       System.out.println(purchase4);
       System.out.println("Amount credited for " + larry.getName() + ": "
                           + larry.getCredit() );
   }
}