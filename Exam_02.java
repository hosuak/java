import java.util.Scanner;

public class Exam_02 {

		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			
			System.out.print("������ ���� �Է� : ");
			int min = in.nextInt();
			int price = 2000;
			if (min>30) {
				min -= 30;
				price += (min/10 + (min%10 != 0 ? 1 : 0)) * 1000;
				//���׿����� : ���ǹ� ? �� : ����
			}
			
			System.out.println("������� : " + price);
		}
	}

