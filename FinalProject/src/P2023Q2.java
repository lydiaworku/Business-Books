// This program performs some simple actions on Item objects.

import java.io.* ;

class P2023Q2
{
   public static void main (String[] args) throws IOException
   { 
    // VARIABLE DECLARATIONS AND DATA DICTIONARY
       Item book;
       Item dvd;
       Item game;
       boolean result;

    // DISPLAY OF THE IDENTIFICATION INFO
       System.out.println();
       System.out.println("P2023Q2: Item class test");
       System.out.println();

    // MODULE DE L’ALGORITHME
       book = new Item(Item.BOOK, "Superman I", 24, 3);
       dvd = new Item(Item.DVD, "Harry Potter VI", 35, 5);
       game = new Item(Item.GAME, "HALO 3", 40, 2);
       
       System.out.println( book.getTitle() + ": " 
                           + Item.typeToString(book.getType())
                           + ", " + book.getPrice() 
                           + ", " + book.getCopiesDispo() );
       System.out.println( dvd.getTitle() + ": " 
                           + Item.typeToString(dvd.getType())
                           + ", " + dvd.getPrice() 
                           + ", " + dvd.getCopiesDispo() );

       game.setPrice(38);
       result = game.decrementCopies();
       System.out.println( game.getTitle() + ": " 
                           + Item.typeToString(game.getType())
                           + ", " + game.getPrice() 
                           + ", " + game.getCopiesDispo()
                           + ". Result: " + result );

       result = game.decrementCopies(); // Should be 0
       result = game.decrementCopies(); // should rturn an error!
       System.out.println( game.getTitle() + ": " 
                           + Item.typeToString(game.getType())
                           + ", " + game.getPrice() 
                           + ", " + game.getCopiesDispo()
                           + ". Result: " + result );
       

       game.incrementCopies();            // Should be 1
       System.out.println( game.getTitle() + ": " 
                           + Item.typeToString(game.getType())
                           + ", " + game.getPrice() 
                           + ", " + game.getCopiesDispo()
                           + ".");

   }
}