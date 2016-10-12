package homework4;
import java.util.*;
public class MaxAndMin {
	Scanner s= new Scanner(System.in);
	int num;
	String queqe;
	int max=0;
	int min=100;
	
	void input()
	{
		do
		{
			this.queqe="";
		System.out.println("0~100사이의 숫자를 입력(q입력 종료):");
		if(s.hasNextInt()){
		this.num=s.nextInt();
		if(this.max<this.num)
			this.max=this.num;
		
		if(this.min>this.num)
			this.min=this.num;
		}else{
			this.queqe=s.next();
		}
		}while(!queqe.equals("q"));
		print();
		
	}
	void print()
	{	
				
				System.out.println("가장 큰수는"+max+"가장 작은수는"+min+"입니다.");
			}
}
