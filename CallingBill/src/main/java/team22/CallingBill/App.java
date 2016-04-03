package team22.Callingbill;
import java.util.Scanner;
import org.apache.log4j.*;

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
	private static Logger log = Logger.getLogger(CallBill.class);
	
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
			log.error("enter correct Grade!!");
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
			log.error("enter correct Grade!!");
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
			log.error("enter correct Grade!!");
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
	private static Logger log = Logger.getLogger(CallBill.class);
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
	
	log.info("your grade is  "+call.grade+",and line is "+call.line+",and using time is "+call.time+".");
	log.info("your total using money is : "+call.totalBill());
    }
}
