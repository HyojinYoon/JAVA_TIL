package test.day0401;

import java.util.ArrayList;

public class ArrayEx01 {
	public static void main(String[] args) {
		// ��� ������ Ÿ�� ���� ����
		// �⺻�� / ������ ��� ����
		ArrayList list = new ArrayList(); // ���׸� ���� ��, <> �ȿ� �����̰ų� �ڼո� �� �� ����
		
		list.add(100); // �⺻��
	//	list.add(new Integer(100)); // integer�� ����ؼ� �⺻���� �־��ִ� ���� ��ȣ
		list.add("hello"); // ������
		
		
		ArrayList list2 = new ArrayList(); 
		list2.add(10);
		list2.add(20);
		
		list.add(list2); // list �ȿ� list ���� ����
		System.out.println(list);
		
		//������ ����ϴ� ��
		System.out.println(list.size()); // list�� ������ ���� Ȯ�� -> 3 = index 0~2�������� �� �� ����
		
		if(list.size() > 0) { // 0���� ũ�� ���� ������ 0 �ʰ��ϴ� ���� �����ڴٴ� ���� ����
			Object obj = list.get(0); // 0�� 100, 1�� hello, 2�� list2 -> �ڵ常 ���� �� ���� ����ִ����� �� - object Ȱ��
			if(obj instanceof Integer) { // obj ���Ե� ���� Integer �������� ���� Ȯ��/ String ������ �������� Ȯ��
				Integer in = (Integer)obj; // ����ȯ
			}
		}
	}
}
