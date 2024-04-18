package weak5;

import java.util.Scanner;

public class CoffePrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("무슨 커피 드릴까요?");
		String order = scanner.next();
		int price = 0;
		switch (order) {
		case "카페라떼":
		case "에스프레소":
		case "카푸치노":
			price = 3500;
			break;		
		case "아메리카노":
			price = 2000;
			break;
		default:
			System.out.println("주무하신 메뉴는 없으니 다른 매장을 이용하시길 바랍니다.");
		}
		if(price !=0)
			System.out.println(order + "는" + price + "원입니다.");
		scanner.close();
	}

}
