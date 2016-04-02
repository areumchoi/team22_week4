package team22.call_bill;
import java.util.Scanner;
/**
 * Hello world!
 *
 */
class Call_bill{
	int time;
	int bill;
	int line;
	String grade;
	private static final String Silver = "silver";
	private static final String Gold = "gold";
	
	public Call_bill(){
		//Constructor about object
	}
	public void baseBill(){
		if(Silver.equals(grade)){
			bill = 39000;
		}
		else if(Gold.equals(grade)){
			bill = 59000;
		}
	}
	public void extraBill(){
		if(Silver.equals(grade)&&time>60){
				bill = bill+((time-60)*540);
		}
		else if(Gold.equals(grade)&&time>12){
				bill = bill+((time-120)*450);
		}
	}
	public void lineBill(){
		if(Silver.equals(grade)){
			bill = bill +((line-1)*39000);
		}
		else if(Gold.equals(grade)){
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
		int total_bill;
		baseBill();
		extraBill();
		lineBill();
		lineDiscount();
		total_bill = bill;
		return total_bill;
	}
}

public class App 
{
	private App(){
		//private Constructor to hide the implicit public one.
	}
    public static void main( String[] args )
    {
    	Call_bill call = new Call_bill();
		Scanner input = new Scanner(System.in);
		System.out.println("your grade: ");
		call.grade = input.next();
		System.out.println("your additional line number: ");
		call.line = input.nextInt();
		System.out.println("your using time: ");
		call.time = input.nextInt();
		
		System.out.println("your grade is  "+call.grade+",and line is "+call.line+",and using time is "+call.time+".");
		System.out.println("your total using money is : "+call.totalBill());
    }
}
