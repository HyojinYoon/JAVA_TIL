package test.day0331;

import java.util.TreeSet;

public class SetEx03 {
	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		
		for (int i = 0; set.size() < 6; i++ ) {			
			int num = (int)(Math.random()*45) + 1; // Math.random : 0~1������ double �� �������� ����
			System.out.println("=��ȣ " + i + " ==" + num); // �ߺ����� ������ ������ �ٽ� ����
			set.add(new Integer(num));
		}
		System.out.println(set);
	}
}
