package test.day0331;

import java.util.Stack;

public class StackEx01 {
	public static void main(String[] args) {
		Stack s = new Stack();
		s.push("���̹�");
		s.push("����");
		s.push("���");
		
		System.out.println(s);
		System.out.println(s.peek()); // peek : ���� ���� �ִ� ��ü ����
		System.out.println(s.peek()); // ������ �ִ� ��ü�� �������� �����ִ� �� ��, ������� ����
		System.out.println(s.pop()); // -> ���
		System.out.println(s.pop()); // -> ���� - ���� ���� �ִ� ��ü ���� �� �����ϱ� ������ ��� �������
		System.out.println(s.pop()); // -> ���̹� - ������ �����
	}
}