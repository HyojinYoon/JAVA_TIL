package test.day0330;

import java.util.ArrayList;
import java.util.Date;

public class ListEx01 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(100);
		list.add("hello");
		list.add(new Date());
		
		System.out.println(list); // �迭ó�� ����Ǿ� ����.
		
		System.out.println(list.get(0)); // -> 0��° ���� �����޶�.
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		
		list.add(1, 5.7); // �ش� ��ġ�� �����ֱ�(hello�� ����Ǵ� ���� �ƴ�)
		System.out.println(list); // -> 100, 5.7, hello
		
		list.set(1, "AAA"); // �ش� ��ġ�� ���� ����
		System.out.println(list); // -> 100, 5.7, hello
		
		ArrayList list2 = new ArrayList(list);
		System.out.println(list);
		System.out.println(list2);
		
		list.clear(); // ���� ��� ����
		System.out.println(list); // -> []
		System.out.println(list2); 
		
		// list2�� 100�� ������ true, ������ false
		System.out.println(list2.contains(100)); // -> true
		System.out.println(list2.indexOf(100)); // 100�� �ε��� ��ġ -> 0
		
		list2.add(100);
		System.out.println(list2); //list�� �ߺ��� ���
		System.out.println(list2.indexOf(100)); // ù��°�� �߰ߵ� ��ġ�� ���� -> 0
		System.out.println(list2.lastIndexOf(100)); // ���������� �߰ߵ� ��ġ ���� -> 4
		
		list2.remove(0); // ���õǾ� �ִ� ���� ���� ����
		System.out.println(list2);
		System.out.println(list2.size()); // �迭�� ����
	}
}
