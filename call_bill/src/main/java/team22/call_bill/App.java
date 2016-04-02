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
		//객체를 가져오기 위한 생성자
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
		if(Silver.equals(grade)){
			if(time>60){
				bill = bill+((time-60)*540);
			}
		}
		else if(Gold.equals(grade)){
			if(time>120){
				bill = bill+((time-120)*450);
			}
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
		int total_bill=0;
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
    public static void main( String[] args )
    {
    	Call_bill call = new Call_bill();
		Scanner input = new Scanner(System.in);
		System.out.println("요금제를 입력하시오: ");
		call.grade = input.next();
		System.out.println("추가 line을 입려하시오: ");
		call.line = input.nextInt();
		System.out.println("사용 시간을 입력하시오: ");
		call.time = input.nextInt();
		
		System.out.println("당신의 grade는  "+call.grade+"이고, line은 "+call.line+"이며, 사용 시간은 "+call.time+"입니다.");
		System.out.println("최종 사용 금액은: "+call.totalBill());
    }
}
