package test.day0331;

import java.util.TreeSet;

// TreeSet
public class SetEx02 {
	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		ts.add(4);
		ts.add(9);
		ts.add(0);
		ts.add(3);
		ts.add(7);
		System.out.println(ts); // treeSet�� ���ĵ� ����. -> 0,3,4,7,9
		
		ts.add(5);
		System.out.println(ts); // �����Ͱ� ���� ��� ������ �� ����
	}
}
