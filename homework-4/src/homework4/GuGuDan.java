package homework4;
import java.util.*;
public class GuGuDan {
	Scanner s= new Scanner(System.in);
	int num;
	String queqe;
	
	void input()
	{
		do
		{
		this.queqe="";
		System.out.println("출력하고싶은 단(q입력 종료):");
		if(s.hasNextInt()){
		this.num=s.nextInt();
		if(num>1&&num<10){
		for (int d=1;d<10;d++){
			if(num==1)
			{
				print();
			}
			if(num==10)
			{
				print();
			}
			
			else System.out.println(num+"*"+d+"="+num*d+" ");
		}
		}else
		{
		print();
		}
		}else{
			this.queqe=s.next();
		}
		}while(!queqe.equals("q"));
			
	}
	void print()
	{	
		System.out.println("잘못입력하셨습니다.");
		}
}

