package homework4;

import java.util.*;

public class GuGuDan2 {
	Scanner s = new Scanner(System.in);
	String queqe;

	void input() {
		do {
			this.queqe = "";
			System.out.println("E:짝수단,O:홀수단(q입력종료):");
			this.queqe = s.next();
			print();
		}

		while (!queqe.equals("q"));
	}

	void print() {
		if (queqe.equals("E")) {
			for (int i = 1; i < 10; i++) {
				for (int j = 2; j <= 10; j += 2)
					System.out.printf(" %d * %d  = %2d ", j, i, j * i);
				System.out.print("\n");
			}
		} else if (queqe.equals("O")) {
			for (int i = 1; i < 10; i++) {
				for (int j = 1; j < 10; j += 2)
					System.out.printf(" %d * %d  = %2d ", j, i, j * i);
				System.out.print("\n");
			}
		}
	}
}
