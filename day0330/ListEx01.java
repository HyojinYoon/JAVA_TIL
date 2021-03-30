package test.day0330;

import java.util.ArrayList;
import java.util.Date;

public class ListEx01 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(100);
		list.add("hello");
		list.add(new Date());
		
		System.out.println(list); // 배열처럼 저장되어 있음.
		
		System.out.println(list.get(0)); // -> 0번째 것을 꺼내달라.
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		
		list.add(1, 5.7); // 해당 위치에 끼워넣기(hello가 변경되는 것이 아님)
		System.out.println(list); // -> 100, 5.7, hello
		
		list.set(1, "AAA"); // 해당 위치의 값을 변경
		System.out.println(list); // -> 100, 5.7, hello
		
		ArrayList list2 = new ArrayList(list);
		System.out.println(list);
		System.out.println(list2);
		
		list.clear(); // 내용 모두 삭제
		System.out.println(list); // -> []
		System.out.println(list2); 
		
		// list2에 100이 있으면 true, 없으면 false
		System.out.println(list2.contains(100)); // -> true
		System.out.println(list2.indexOf(100)); // 100의 인덱스 위치 -> 0
		
		list2.add(100);
		System.out.println(list2); //list는 중복값 허용
		System.out.println(list2.indexOf(100)); // 첫번째로 발견된 위치를 추출 -> 0
		System.out.println(list2.lastIndexOf(100)); // 마지막으로 발견된 위치 추출 -> 4
		
		list2.remove(0); // 제시되어 있는 곳의 값을 삭제
		System.out.println(list2);
		System.out.println(list2.size()); // 배열의 갯수
	}
}
