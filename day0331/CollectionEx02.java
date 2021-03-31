package test.day0331;

import java.util.TreeSet;

/*2. Set 계열의 클래스를 이용하여 로또번호를 랜덤함수를 이용하여 생성하고  
List계열의 클래스를 이용하여 정렬하여 출력하는 로또구매 프로그램을 작성하시오.
- 금액을 입력받아 금액만큼 로또 번호 생성 (금액 1000원 단위)*/
public class CollectionEx02 {
	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		
		for (int i = 0; set.size() < 6; i++ ) {			
			int num = (int)(Math.random()*45) + 1; 
			set.add(new Integer(num));
		}
		System.out.println("번호 :" + set);
	}
}
