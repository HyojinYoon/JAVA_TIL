package test.day0330;

import java.util.ArrayList;

public class ListEx03 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("hello");
		list.add(100);
		list.add(5.7);
		list.add("hello");
		list.add("world");
		list.add(true);
		System.out.println(list);
		
		// Ÿ���� �������� ���� ����Ʈ���� String�� ����ϼ���.
		for(int i = 0; i < list.size(); i++) {
			Object obj = list.get(i);
			if(obj instanceof String) { // String���� ����ȯ�� �ǳ� = String�� �³�
				String s = (String)obj;
				System.out.println("��ġ : "+i+" / �� : "+s);
			}
		}
		
		
	}
}