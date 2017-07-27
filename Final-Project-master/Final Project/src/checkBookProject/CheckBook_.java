//Adil Tahir 
//Mike Bell
//FinalProject

package checkBookProject;
import java.util.*;


public class CheckBook_ {

	static Check_[] checkBookRegister;
	static Check_ Beef;
	static int balance = 0;
	static Check_ arraylength;
	static int m;
	public CheckBook_(){
		
		checkBookRegister = new Check_[5];
		for(int c = 0;  c < 5; c++){
			checkBookRegister[c] = new Check_(0, null, null);
		}
		
		int balance;
		int arraylength = checkBookRegister.length;
		
	}
	
	public int checkBookLength(){
		return checkBookRegister.length;
	}
	
	public static void printCheckBook(){
		int checkNumber = 0;
//        for (Check_ Beef : checkBookRegister)//for all objects "check" in array "checkBookRegister"
//        {
//                CheckBook_.printCheck();
//                //prints all checks in array based on the format in method printCheck()
//                System.out.println("Check number: " + checkNumber); //prints checknumber based on order in checkbook
//                System.out.println(" ");
//                checkNumber ++; 
//        }
        for (m = 0; m < 5; m++){
        	CheckBook_.printCheck(m);
        }
		
	}
	
	
    public static void printCheck(int m){
    	
    	Beef = CheckBook_.checkBookRegister[m];
    	System.out.println(Beef.checkPayer + "    " + Beef.checkNumber);
        System.out.println("Pay to the order of: " + Beef.checkPayee + "     " + Beef.checkAmount);
        System.out.println("For: " + Beef.checkReason);
    }//printCheck()
	
	public String toString(){
		return Arrays.toString(checkBookRegister);
	}
	
}
