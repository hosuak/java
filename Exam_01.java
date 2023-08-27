import java.util.Scanner;

public class Exam_01 {
	public static void main(String[] args) {

			Scanner in = new Scanner(System.in);
			
			int comsu = (int)(Math.random()*100) + 1;
			int co = 0;
			while(true) {
				System.out.print("1~100사이의 수를 입력 : ");
				int su = in.nextInt();
				co++;
				if (comsu == su) {
					break;
				}else if (comsu > su) {
					System.out.println("Up");
				}else {
					System.out.println("Down");
				}
			}
			
			System.out.println(co+"번만에 맞추셨습니다.");
		}
	}

