package team22.call_bill;
import java.util.Scanner;
/**
 * Hello world!
 *
 */
class Call_bill{
	public int time;
	public int bill;
	public int line;
	public String grade;
	
	public Call_bill(){
	}
	public void base_bill(){
		if(grade.equals("silver")){
			bill = 39000;
		}
		else if(grade.equals("gold")){
			bill = 59000;
		}
		else{
			System.err.println("GRADE 값이 올바르지 않습니다.");
		}
	}
	public void extra_bill(){
		if(grade.equals("silver")){
			if(time>60){
				bill = bill+((time-60)*540);
			}
		}
		else if(grade.equals("gold")){
			if(time>120){
				bill = bill+((time-120)*450);
			}
		}
		else{
			System.err.println("GRADE 값이 올바르지 않습니다.");
		}
	}
	public void line_bill(){
		if(grade.equals("silver")){
			bill = bill +((line-1)*39000);
		}
		else if(grade.equals("gold")){
			bill = bill + ((line-1)*30000);
		}
		else{
			System.err.println("GRADE 값이 올바르지 않습니다.");
		}
	}
	public void line_discount(){
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
	public int total_bill(){
		int total_bill=0;
		base_bill();
		extra_bill();
		line_bill();
		line_discount();
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
		System.out.println("최종 사용 금액은: "+call.total_bill());
    }
}
