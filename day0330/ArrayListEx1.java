package test.day0330;

import java.util.*;

class ArrayListEx1{
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList(10); // 초기용량 10으로 지정
		list1.add(new Integer(5));
		list1.add(new Integer(4));
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		list1.add(new Integer(3)); // new를 활용하여 객체 6개 생성
		ArrayList list2 = new ArrayList(list1.subList(1,4)); //subList : 1번째부터 4번째 미만까지를 복사하겠다(1,2,3번째)
		
		print(list1, list2);
		
		Collections.sort(list1); // sort : 정렬 - list1을 정렬한다. (아스키코드 순서대로)
		Collections.sort(list2);
		
		print(list1, list2);
		
		System.out.println(list1.containsAll(list2)); //containsAll : 지정된요소가 모두 포함되어 있는지 확인 - list1에 list2의 요소가 모두 있으면 true.
		System.out.println(list1.contains(1)); // contains : 지정된 요소가 표홤되어 있는지 확인 - 1이 있으면 true, 없으면 false.
		
		list2.add("B");
		list2.add("C");
		list2.add(3, "A"); // 3번자리에 A 대입
		print(list1, list2);
		
		list2.set(3, "AA"); // set : 변경 - 3번자리를 AA로 변경
		print(list1, list2);

		// list1에서 list2와 겹치는 부분만 남기고 나머지는 삭제한다. - 교집합 외는 삭제
		System.out.println(list1.retainAll(list2));	
		print(list1, list2);
		System.out.println(list1.size()); // size : 갯수
		System.out.println(list2.size());
	
		//  list2에서 list1에 포함된 객체들을 삭제한다.
		for(int i= 5; i >= 0; i--) {
			if(list1.contains(list2.get(i))) // list1에 list2의 5번째 값인 C가 있으면 true 아니면 false - 4번째 B, 3번째 AA 모두 false.
				list2.remove(i); // 2번째인 4는 true. list2의 4를 삭제해라. 1번째 2, 0번째 0 모두 삭제
		}
		print(list1, list2);
	} // main

	static void print(ArrayList list1, ArrayList list2) { // print 메서드
		System.out.println("list1:"+list1);
		System.out.println("list2:"+list2);
		System.out.println();		
	}
} // class