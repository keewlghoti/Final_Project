//Adil Tahir 
//Mike Bell
//FinalProject

package checkBookProject;
public class Check_ {

	   public double checkAmount = 0.0; //amount the check is for
	   public int checkNumber; //to hold the check number
	   public String checkPayee =  null;
	   public String checkReason =  null;
	   public String checkPayer =  null;
	   
	    
	    public Check_(double amount, String reason, String payee){
	       //initialize the check's values
	       checkAmount= amount;
	       checkNumber = 0;
	       checkPayee = payee;
	       checkReason = reason;
	       checkPayer = "Mike Bell";// i know its overcoded, left this hardcode in but could swap for variable later
	       
	       
	   }//Check_()
	    
	    public void setAmount(Double inc){
	        this.checkAmount = inc;
	    }
	    
	    public  void setPayee (String inc){
	       this.checkPayee = inc;
	    }
	    public  void setReason (String inc){
	       this.checkReason = inc;
	    }
	    
	    public  void printCheck(){
	       System.out.println(this.checkPayer + "    " + this.checkNumber);
	        System.out.println("Pay to the order of: " + this.checkPayee + "     " + this.checkAmount);
	        System.out.println("For: " + this.checkReason);
	    }//printCheck()
	    public String toString(){
	        String result = this.checkPayer + "    " + "Pay to the order of: " + this.checkPayee + "     " + this.checkAmount;
	        return result;
	    }
	}//Class Check_