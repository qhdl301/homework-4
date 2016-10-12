package homework4;
import java.util.*;
public class SumOfNumbers {
	Scanner s= new Scanner(System.in);
	int num;
	int num1;
	String queqe;
	void input()
	{
		do{
			this.queqe="";
			this.num1=0;
		System.out.println("마지막수를 입력(q입력종료):");
		if(s.hasNextInt()){
		num=s.nextInt();
		print();
		}
		else {
			this.queqe=s.next();
			
		}
		}
		while(!queqe.equals("q"));
	}

	void print()
	{
		
			for(int i=1; i<=num; i++)
			{
				num1=num1+i;
			}
			System.out.println("결과는"+num1);
		}
}
