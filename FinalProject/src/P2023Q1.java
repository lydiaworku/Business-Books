import java.io.* ;

class P2023Q1
{
   public static void main (String[] args) throws IOException
   { 
    Client c = new Client( "Diana", "diana@gmail.ca", "cmsi2120" );
    
    String expected = "Diana";
    String returned = c.getName();  
    System.out.println("Test getName");
   System.out.println("expected Name: " + expected + " returned Name " + returned);
 
    String expectedEmail = "diana@gmail.ca";
    String returnedEmail = c.getEmail();  
    //Assert.assertEquals(expected, returned);
    System.out.println("Test getEmail");
    System.out.println("expected Email: " + expectedEmail + " returned Email: " + returnedEmail); 
  
    Client d = new Client( "Diana", "diana@gmail.ca", "cmsi2120" );
     String expectedEmail2 = "diana@gmail.ca";
    String returnedEmail2 = d.getEmail();  
    //Assert.assertEquals(expected, returned);
    
    d.setEmail("diana@hotmail.tv");
    
    expectedEmail2 = "diana@hotmail.tv";
    returnedEmail2 = d.getEmail();  
    
    System.out.println("Test setEmail");
    System.out.println("expected Email: " + expectedEmail2 + " returned Email: " + returnedEmail2); 
  
     //Assert.assertEquals(expected, returned);
  
    
    int expectedCredit = 10;
    int returnedCredit = c.getCredit();
    
    System.out.println("Test getCredit");
    System.out.println("expected Credit: " + expectedCredit + " returned Credit: " + returnedCredit); 
  
      
    boolean expectedPassword= true;
    boolean returnedPassword = c.verifyPassword("cmsi2120");
   System.out.println("Test testVerifyPasswordGood");
    System.out.println("expected Password: " + expectedPassword + " returned Password: " + returnedPassword); 
  
  
    boolean expectedPassword2 = false;
    boolean returnedPassword2 = c.verifyPassword("cmsi2121");
   System.out.println("Test testVerifyPasswordBad");
    System.out.println("expected Password: " + expectedPassword2 + " returned Password: " + returnedPassword2); 
    
  
     boolean expectedPwd3 = true;
    boolean returnedPwd3 = c.verifyPassword("cmsi2120");
    //Assert.assertEquals( expected, returned ); 
    
    boolean expectedPwd = true;
     boolean returnedPwd = c.changePassword("cmsi2120", "newPassword");
    
    //Assert.assertEquals( expected, returned ); 
    
     boolean expectedPwd1 = false;
     boolean returnedPwd1 = c.verifyPassword("cmsi2120");
    //Assert.assertEquals( expected, returned ); 
    
    boolean expectedPwd2 = true;
    boolean returnedPwd2 = c.verifyPassword("newPassword");
    //Assert.assertEquals( expected, returned ); 
    
    System.out.println("Test  testChangePassworGood");
     System.out.println("expected Password: " + expectedPwd3 + " returned Password: " + returnedPwd3); 
    System.out.println("expected Password: " + expectedPwd + " returned Password: " + returnedPwd); 
 System.out.println("expected Password: " + expectedPwd1 + " returned Password: " + returnedPwd1); 
 System.out.println("expected Password: " + expectedPwd2 + " returned Password: " + returnedPwd2); 
    
  
    boolean expectedPd1 = true;
    boolean returnedPd1 = c.verifyPassword("cmsi2120");
    //Assert.assertEquals( expected, returned ); 
    
    boolean expectedPd2 = false;
    boolean returnedPd2 = c.changePassword("cmsi2120", "newPassword");
    
    //Assert.assertEquals( expected, returned ); 
    
   boolean  expectedPd3 = false;
   boolean  returnedPd3 = c.verifyPassword("cmsi2120");
   // Assert.assertEquals( expected, returned ); 
    
   boolean  expectedPd4 = false;
   boolean  returnedPd4 = c.verifyPassword("newPassword");
   // Assert.assertEquals( expected, returned ); 
    
   boolean  expectedPd5 = true;
   boolean  returnedPd5 = c.verifyPassword("cmsi2120");
    //Assert.assertEquals( expected, returned ); 
    
    System.out.println("Test testChangePasswordBad");
     System.out.println("expected Password: " + expectedPd1 + " returned Password: " + returnedPd1); 
    System.out.println("expected Password: " + expectedPd2 + " returned Password: " + returnedPd2); 
 System.out.println("expected Password: " + expectedPd3 + " returned Password: " + returnedPd3); 
 System.out.println("expected Password: " + expectedPd4 + " returned Password: " + returnedPd4); 
  System.out.println("expected Password: " + expectedPd5 + " returned Password: " + returnedPd5); 
    
      
    int expected0 = 10;
    int returned0 = c.getCredit();  
    //Assert.assertEquals(expected, returned);
    
    boolean expectedSuccess1 = true;
    boolean returnedSuccess1 = c.reduceCredit(9);
    //Assert.assertEquals(expectedSuccess, returnedSuccess);
    
   int expected1 = 1;
   int returned1 = c.getCredit();  
    //Assert.assertEquals(expected, returned);
    
    boolean expectedSuccess2 = false;
    boolean returnedSuccess2 = c.reduceCredit(2);
    //Assert.assertEquals(expectedSuccess, returnedSuccess);
    
    int expected2 = 1;
    int returned2 = c.getCredit();  
    //Assert.assertEquals(expected, returned);
    
    System.out.println("Test testReduceCredit");
    System.out.println("expected credit: " + expected0 + " returned credit: " + returned0); 
    System.out.println("expected credit: " + expected1 + " returned credit: " + returned1); 
    System.out.println("expected credit: " + expectedSuccess1 + " returned credit: " + returnedSuccess1);
     System.out.println("expected credit: " + expected2 + " returned credit: " + returned2); 
    System.out.println("expected credit: " + expectedSuccess2 + " returned credit: " + returnedSuccess2);
  }
  
}