package team22.CalculatingBill;
import java.util.Scanner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class CallBill{
   int time;
   int bill;
   int line;
   String grade;
   private static final String SILVER = "silver";
   private static final String GOLD = "gold";
   private static final String ERROR = "Insert correct value.";
   private static final Logger log = LoggerFactory.getLogger(CallBill.class);
   
   public CallBill(){
      //Constructor about object
   }
   public void baseBill(){
      if(SILVER.equals(grade)){
         bill = 39000;
      }
      else if(GOLD.equals(grade)){
         bill = 59000;
      }
      else{
    	  log.error(ERROR);
      }
   }
   public void extraBill(){
      if(SILVER.equals(grade)&&time>60){
            bill = bill+((time-60)*540);
      }
      else if(GOLD.equals(grade)&&time>12){
            bill = bill+((time-120)*450);
      }
      else{
    	  log.error(ERROR);
      }
   }
   public void lineBill(){
      if(SILVER.equals(grade)){
         bill = bill +((line-1)*39000);
      }
      else if(GOLD.equals(grade)){
         bill = bill + ((line-1)*30000);
      }
      else{
    	  log.error(ERROR);
      }
   }
   public void lineDiscount(){
      if(line==3){
         bill=bill-2000;
      }
      else if(line==4){
         bill=bill-3000;
      }
      else if(line>5){
         bill=bill-4000;
      }
   }
   public int totalBill(){
      int totalBill;
      baseBill();
      extraBill();
      lineBill();
      lineDiscount();
      totalBill = bill;
      return totalBill;
   }
}
public class App 
{
	private static final Logger log = LoggerFactory.getLogger(CallBill.class); 
	private App(){
      // private constructor to hide the implicit public one.
	}
    public static void main( String[] args )
    {
   CallBill call = new CallBill();
   Scanner input = new Scanner(System.in);
   log.info("your grade: ");
   call.grade = input.next();
   log.info("your additional line number: ");
   call.line = input.nextInt();
   log.info("your using time: ");
   call.time = input.nextInt();
   
   log.info("your total using money is : "+call.totalBill());
    }
}
