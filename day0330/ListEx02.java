package test.day0330;

import java.util.ArrayList;

public class ListEx02 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>(); 
		list.add("hello");
		// list.add(100); -> <String>���� �����Ǿ� �ֱ� ������ int ��� �Ұ�
		
		String str = list.get(0); // <String>���׸��� ���õǾ� �ֱ� ������ �ٷ� String���� ���� �� ����. 0��°�� ���� �ִ��� �𸣱� ����.
	}
}
