package test.day0331;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

class Tv{}

public class SetEx01 {
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		Set hs2 = new HashSet(); // 다형성으로 생성
		
		hs.add(100);
		hs.add(100);
		hs.add(100);
		hs.add(100);
		
		hs.add(new Date());
		hs.add(new Date()); // Date는 이미 자바 시스템에 만들어져 있는 것이라서 중복으로 들어가지 않음
		
		hs.add(new Tv());
		hs.add(new Tv()); // Tv객체는 우리가 새로 생성해주기 때문에 따로따로 주소가 생성. 중복으로 들어감
		
		hs.add("hello");
		hs.add("hello");
		
		hs.add(new String("AAA"));
		hs.add(new String("AAA")); // Date와 동일한 이유. String은 자바에서 제공하는 객체이기 때문에 하나만 저장됨
		
		System.out.println(hs); // 하나만 생성. 중복값을 허용하지 않음 / 작성한 순서대로 저장되지 않음


		
	}
}
