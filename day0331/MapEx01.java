package test.day0331;

import java.util.HashMap;

public class MapEx01 {
	public static void main(String[] args) {
		
		HashMap hm = new HashMap(); 
		// HashMap<Integer,String> hm = new HashMap<Integer,String>(); -> ���׸� ���� ����
		hm.put("java", "abcd");
		hm.put(100, "abcd");
		hm.put(5.7, 100);
		hm.put(100, "AAAA"); //key�� �ߺ����x - ���� key�� ���� �ٽ� ����(abcd -> AAAA)
		
		System.out.println(hm);
		
		System.out.println(hm.get(100)); // get : ������ �� ���. key�� ����
		System.out.println(hm.get(200)); // ���� key�� ������ null �� ��µ�
		
	}
}
