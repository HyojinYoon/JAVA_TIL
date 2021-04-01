package test.day0401;

import java.util.ArrayList;

public class ArrayEx01 {
	public static void main(String[] args) {
		// 모든 데이터 타입 저장 가능
		// 기본형 / 참조형 모두 가능
		ArrayList list = new ArrayList(); // 제네릭 지정 시, <> 안에 본인이거나 자손만 들어갈 수 있음
		
		list.add(100); // 기본형
	//	list.add(new Integer(100)); // integer를 사용해서 기본형을 넣어주는 것을 선호
		list.add("hello"); // 참조형
		
		
		ArrayList list2 = new ArrayList(); 
		list2.add(10);
		list2.add(20);
		
		list.add(list2); // list 안에 list 삽입 가능
		System.out.println(list);
		
		//꺼내서 사용하는 법
		System.out.println(list.size()); // list의 갯수를 먼저 확인 -> 3 = index 0~2까지임을 알 수 있음
		
		if(list.size() > 0) { // 0보다 크면 뭐라도 있으니 0 초과하는 것을 꺼내겠다는 조건 삽입
			Object obj = list.get(0); // 0번 100, 1번 hello, 2번 list2 -> 코드만 봤을 때 뭐가 들어있는지는 모름 - object 활용
			if(obj instanceof Integer) { // obj 대입된 값이 Integer 숫자인지 여부 확인/ String 넣으면 문자인지 확인
				Integer in = (Integer)obj; // 형변환
			}
		}
	}
}
