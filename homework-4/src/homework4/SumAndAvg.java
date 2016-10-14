package homework4;

import java.util.*;

public class SumAndAvg {
	Scanner s = new Scanner(System.in);
	int num;
	String queqe;
	int count = 0;
	int sum = 0;
	double avg;

	void input() {
		do {
			queqe = "";
			System.out.println("숫자를 입력(q입력 종료):");
			if (s.hasNextInt()) {
				this.num = s.nextInt();
				this.sum += this.num;
				this.count += 1;
				this.avg = sum / count;
			} else {
				this.queqe = s.next();
			}
		} while (!queqe.equals("q"));
		print();
	}

	void print() {
		this.avg = sum / count;
		System.out.printf("합계는 %d 평균은:%.2f 입니다.\n", sum, avg);
	}
}
