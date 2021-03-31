package test.day0331;

import java.util.HashMap;

public class MapEx01 {
	public static void main(String[] args) {
		
		HashMap hm = new HashMap(); 
		// HashMap<Integer,String> hm = new HashMap<Integer,String>(); -> 제네릭 설정 가능
		hm.put("java", "abcd");
		hm.put(100, "abcd");
		hm.put(5.7, 100);
		hm.put(100, "AAAA"); //key의 중복허용x - 같은 key에 값을 다시 대입(abcd -> AAAA)
		
		System.out.println(hm);
		
		System.out.println(hm.get(100)); // get : 꺼내쓸 때 사용. key를 삽입
		System.out.println(hm.get(200)); // 없는 key를 넣으면 null 이 출력됨
		
	}
}
