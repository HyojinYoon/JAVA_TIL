package test.day0401;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/*2. Set 계열의 클래스를 이용하여 로또번호를 랜덤함수를 이용하여 생성하고  
List계열의 클래스를 이용하여 정렬하여 출력하는 로또구매 프로그램을 작성하시오.
- 금액을 입력받아 금액만큼 로또 번호 생성 (금액 1000원 단위)*/
public class CollectionEx02 {
	static Scanner s = new Scanner(System.in); // 금액 입력 받기 위함
	public static void main(String[] args) {
		buyLotto(); // buyLotto메서드 호출
	}
	
	public static void buyLotto() {
		System.out.print("구입금액 입력: ");
		int money = s.nextInt();
		int amount = money/1000; //int 나누기 int기 때문에 소수점 안나옴
		s.nextLine();
		System.out.println("로또 구매 금액 : " + money + "원");
		System.out.println("로또 번호 " + amount + "회 출력");
		lottoNum(amount);
	}
	
	public static void lottoNum(int amount) { //매개변수에 횟수 입력. 횟수만큼 로또번호 출력하겠다는 것
		//list 활용
		for(int a= 0; a < amount; a++) { // 전체 게임 횟수
			Set set = new HashSet(); 
			for (int i = 0; set.size() < 6; i++ ) {			
				int num = (int)(Math.random()*45) + 1; 
				set.add(new Integer(num));
			}
			ArrayList list = new ArrayList(set);
			Collections.sort(list);
			System.out.println("번호" + " : " + list);
		
		
		// TreeSet 활용
	/*	for(int a= 0; a < amount; a++) { // 전체 게임 횟수
		TreeSet set = new TreeSet(); // TreeSet을 이용하면 알아서 정렬을 해줌 - List계열을 이용해서 정렬을 하라고 했기 때문에 사용x
		for (int i = 0; set.size() < 6; i++ ) {			
			int num = (int)(Math.random()*45) + 1; 
			set.add(new Integer(num));
			}
		System.out.println(set); */
		}
	}
}
