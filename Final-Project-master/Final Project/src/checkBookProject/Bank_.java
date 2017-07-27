//Adil Tahir 
//Mike Bell
//FinalProject

package checkBookProject;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.*;

public class Bank_ {
	double checkAmount;
	String checkPayee;
	String checkReason;
	int arrayPosition = 0;
	static Check_ Beef;
	static UserInteraction_ book;
	
	public static void addCheck(int arrayInteraction){// method used to add a single check to array
		double addCheckAmount;
		String addCheckPayee;
		String addCheckReason;
		int n = arrayInteraction;
		
		//somehow how get to the next position in the array and set the values as follows
		while (n == arrayInteraction){
		Beef = CheckBook_.checkBookRegister[n] ; 
		
		System.out.println("How much is the check for: ");
		addCheckAmount = userPromptDouble();
		Beef.setAmount(addCheckAmount);
		
		
		System.out.println("Who is the check to be paid to: ");
		addCheckPayee = userPromptString();
		Beef.setPayee(addCheckPayee);
		
		
		System.out.println("Why are you making the check: ");
		addCheckReason = userPromptString();
		Beef.setReason(addCheckReason);
		

		//System.out.println(Check_.checkReason);
		Beef.printCheck();
		n++;
		}//while
	    	
	    	
    }//addCheck
	
	public static void addNewCheck(int arrayInteraction){// does the same thing as addCheck(), this method is here for testing
		double addCheckAmount;
		String addCheckPayee;
		String addCheckReason;
		int n = arrayInteraction;
		
		System.out.println("How much is the check for: ");
		addCheckAmount = userPromptDouble();
		System.out.println("Who is the check to be paid to: ");
		addCheckPayee = userPromptString();
		System.out.println("Why are you making the check: ");
		addCheckReason = userPromptString();
		
		CheckBook_.checkBookRegister[n] = new Check_(addCheckAmount, addCheckPayee, addCheckReason);
	}
	
	
	public static String userPromptString(){ //catch all method for getting a string from the user
		Scanner scannerString = new Scanner(System.in);
    	String returnString = null;
		try {
			if (scannerString.hasNext() ) {
				returnString = scannerString.nextLine();
			}//if
			else{
				returnString = null;
			}//else
		}//try
		catch (InputMismatchException e) {
			System.out.println("Bad Entry");
		}//catch
		
		System.out.println(returnString + "---got the the end of userPROMPTSTRING");
		return returnString;
	}//userPropmtString()
	
	public static double userPromptDouble(){ //catch all method for a double from the user.
		Scanner scannerDouble = new Scanner(System.in);
    	double returnDouble = 0;
		try {
			if (scannerDouble.hasNext() ) {
				returnDouble = scannerDouble.nextDouble();
			}//if
			else{
				returnDouble = 0;
			}//else
		}//try
		catch (InputMismatchException e) {
			System.out.println("Bad Entry");
		}//catch
		
		System.out.println(returnDouble + "---got the the end of userPROMPTDOUBLE");
		return returnDouble;
	}//userPropmtFloat()
	
}//bank_
