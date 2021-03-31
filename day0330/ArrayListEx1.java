package test.day0330;

import java.util.*;

class ArrayListEx1{
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList(10); // �ʱ�뷮 10���� ����
		list1.add(new Integer(5));
		list1.add(new Integer(4));
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		list1.add(new Integer(3)); // new�� Ȱ���Ͽ� ��ü 6�� ����
		ArrayList list2 = new ArrayList(list1.subList(1,4)); //subList : 1��°���� 4��° �̸������� �����ϰڴ�(1,2,3��°)
		
		print(list1, list2);
		
		Collections.sort(list1); // sort : ���� - list1�� �����Ѵ�. (�ƽ�Ű�ڵ� �������)
		Collections.sort(list2);
		
		print(list1, list2);
		
		System.out.println(list1.containsAll(list2)); //containsAll : �����ȿ�Ұ� ��� ���ԵǾ� �ִ��� Ȯ�� - list1�� list2�� ��Ұ� ��� ������ true.
		System.out.println(list1.contains(1)); // contains : ������ ��Ұ� ǥ�c�Ǿ� �ִ��� Ȯ�� - 1�� ������ true, ������ false.
		
		list2.add("B");
		list2.add("C");
		list2.add(3, "A"); // 3���ڸ��� A ����
		print(list1, list2);
		
		list2.set(3, "AA"); // set : ���� - 3���ڸ��� AA�� ����
		print(list1, list2);

		// list1���� list2�� ��ġ�� �κи� ����� �������� �����Ѵ�. - ������ �ܴ� ����
		System.out.println(list1.retainAll(list2));	
		print(list1, list2);
		System.out.println(list1.size()); // size : ����
		System.out.println(list2.size());
	
		//  list2���� list1�� ���Ե� ��ü���� �����Ѵ�.
		for(int i= 5; i >= 0; i--) {
			if(list1.contains(list2.get(i))) // list1�� list2�� 5��° ���� C�� ������ true �ƴϸ� false - 4��° B, 3��° AA ��� false.
				list2.remove(i); // 2��°�� 4�� true. list2�� 4�� �����ض�. 1��° 2, 0��° 0 ��� ����
		}
		print(list1, list2);
	} // main

	static void print(ArrayList list1, ArrayList list2) { // print �޼���
		System.out.println("list1:"+list1);
		System.out.println("list2:"+list2);
		System.out.println();		
	}
} // class