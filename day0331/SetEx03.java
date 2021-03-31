package test.day0331;

import java.util.TreeSet;

public class SetEx03 {
	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		
		for (int i = 0; set.size() < 6; i++ ) {			
			int num = (int)(Math.random()*45) + 1; // Math.random : 0~1사이의 double 값 랜덤으로 보냄
			System.out.println("=번호 " + i + " ==" + num); // 중복값이 나왔을 때에는 다시 돌림
			set.add(new Integer(num));
		}
		System.out.println(set);
	}
}
