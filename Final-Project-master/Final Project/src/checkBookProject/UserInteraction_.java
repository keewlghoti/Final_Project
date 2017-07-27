//Adil Tahir 
//Mike Bell
//FinalProject

package checkBookProject;
import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;

public class UserInteraction_ {
   static boolean programStatus = true;
   static CheckBook_ book;
   static int j = 0;
   static ObjectInputStream in;
   static private ObjectOutputStream os;
   static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
   static private final String FILE_NAME = "checkBook.txt";
   static Path destination = Paths.get(FILE_NAME);



   public static void main(String[] args){
      int u = 0;
      while (u < 1){//literally just in place to keep the array alive
         CheckBook_ book = new CheckBook_(); // generates the object that hold the checkbook array in it
         while (programStatus = true){//allows the menu to run forever
           
            menu();
            
            //System.out.println(programStatus + "system status, got the main()"); used for testing
            //System.out.println(book); used for testing
         }//while
        u++;
      }//while(u<1)
   }//main()
   
   
   public static void menu(){
   
	   System.out.println("Welcome to your bank.");      
       System.out.println("Please choose one:");
       System.out.println("1) Create a check in your checkbook.");
       System.out.println("2) Print out checkbook.");
       System.out.println("3) Serialize the checkbook.");
       System.out.println("4) Read from a preexisting checkbook.");
       System.out.println("5) Quit.");
       
       
       Scanner scanner = new Scanner(System.in);
       int userInput = 0;
      if (scanner.hasNextInt()) {
         userInput = scanner.nextInt();
      }//if
      else{
         userInput = 4;
      }//else
      
       switch(userInput){
       case 1:
          caseOne(j);
          j++;
          System.out.println("You have " + (5 - j) + " checks left in your checkbook.");
          
         break;
       
	   case 2:
	      System.out.println("Your checkbook contains the following:");
	      CheckBook_.printCheckBook();
	      break;
	      
	   case 3:
		  caseThree();
		  break;
	   case 4:
		   caseFour();
		   break;
	   case 5:
		   programStatus = false;
	       System.out.println("Thank you for using the bank today.");
	   System.exit(0);
	   scanner.close();
	              
	  break;
          
       }//switch(input) 
   
   }//menu()
   
   public static void caseOne(int j){
      int arrayInteraction = j;
      Bank_.addCheck(arrayInteraction);
      System.out.println(j + " --- this is J caseOne()");
      
   }//caseOne()
   
   public static void caseThree(){
	   BufferedWriter writer = null;
       try
       {
          writer = new BufferedWriter( new FileWriter( FILE_NAME));
          writer.write( "test");

       }
       catch ( IOException e)
       {
       }
       finally
       {
          try
          {
             if ( writer != null)
                writer.close( );
          }
          catch ( IOException e)
          {
          }
       }
   }//caseThree()
   public static void caseFour(){
	   
       BufferedReader reader = null;
       try
       {
          reader = new BufferedReader( new FileReader( FILE_NAME));
          String test = reader.readLine( );
          System.out.println(test);
       }
       catch ( IOException e)
       {
       }
       finally
       {
          try
          {
             if ( reader != null)
                reader.close( );
          }
          catch ( IOException e)
          {
          }
       }
   }//casefour()
}//UserInteraction
	

