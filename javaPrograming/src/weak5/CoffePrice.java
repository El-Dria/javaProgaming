package weak5;

import java.util.Scanner;

public class CoffePrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("���� Ŀ�� �帱���?");
		String order = scanner.next();
		int price = 0;
		switch (order) {
		case "ī���":
		case "����������":
		case "īǪġ��":
			price = 3500;
			break;		
		case "�Ƹ޸�ī��":
			price = 2000;
			break;
		default:
			System.out.println("�ֹ��Ͻ� �޴��� ������ �ٸ� ������ �̿��Ͻñ� �ٶ��ϴ�.");
		}
		if(price !=0)
			System.out.println(order + "��" + price + "���Դϴ�.");
		scanner.close();
	}

}
