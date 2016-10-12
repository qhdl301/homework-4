package homework4;
import java.util.*;
public class ExamForWhile {
	
	

	public static void main(String[] args) {
		int num;

		Scanner s=new Scanner(System.in);

	    do{

	    	System.out.println("1. 1부터 입력한 수까지 더하기");

	    	System.out.println("2. 최대값/최소값구하기");

	    	System.out.println("3. 입력받은숫자의 합계와 평균구하기");

	    	System.out.println("4. 원하는 구구단 출력하기  ");

	    	System.out.println("5. 짝수단/홀수단 출력하기");

	    	System.out.println("6. 종료하기");

	    	System.out.println("원하는 메뉴는>>");
	    	num=s.nextInt();
	    		if(num==1)
	    			new SumOfNumbers().input();
	    		else if(num==2)

	    			new MaxAndMin().input();
	    		else if(num==3)

	    			new SumAndAvg().input();	

	    		else if(num==4)

	    			new GuGuDan().input();

	    		else if(num==5)

	    			new GuGuDan2().input();
	    }
	    while(num!=6);
	    System.out.print("종료하셨습니다.");
	}

		// TODO Auto-generated method stub

	}


