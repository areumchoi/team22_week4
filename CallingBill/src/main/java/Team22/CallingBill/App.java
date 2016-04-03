package Team22.CallingBill;
import java.util.Scanner;


/**
 * Hello world!
 *
 */
class CallBill{
   int time;
   int bill;
   int line;
   String grade;
   private static final String SILVER = "silver";
   private static final String GOLD = "gold";
   
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
   }
   public void extraBill(){
      if(SILVER.equals(grade)&&time>60){
            bill = bill+((time-60)*540);
      }
      else if(GOLD.equals(grade)&&time>12){
            bill = bill+((time-120)*450);
      }
   }
   public void lineBill(){
      if(SILVER.equals(grade)){
         bill = bill +((line-1)*39000);
      }
      else if(GOLD.equals(grade)){
         bill = bill + ((line-1)*30000);
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
   private App(){
      // private constructor to hide the implicit public one.
   }
    public static void main( String[] args )
    {
   CallBill call = new CallBill();
   Scanner input = new Scanner(System.in);
   System.out.println("your grade: ");
   call.grade = input.next();
   System.out.println("your additional line number: ");
   call.line = input.nextInt();
   System.out.println("your using time: ");
   call.time = input.nextInt();
   
   System.out.println("your total using money is : "+call.totalBill());
    }
}