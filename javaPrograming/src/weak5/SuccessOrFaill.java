package weak5;

import java.util.Scanner;

public class SuccessOrFaill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("������ �Է��Ͻÿ�: ");
		int score = scanner.nextInt();
		if (score >= 80)
			System.out.println("�����մϴ�! �հ��Դϴ�.");
		
		scanner.close();
	}

}
