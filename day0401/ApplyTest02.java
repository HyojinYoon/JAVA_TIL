package test.day0401;

import java.util.Scanner;

/*���� 2��
�� �ڸ����� ���� ���Ͽ� ����ϴ� ���α׷��� �ۼ�
��) 4567 => 4+5+6+7 => 22�� ����ϴ� ����*/
public class ApplyTest02 {
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		test2();
	}
	public static int test2() {
		int result = 0;
		System.out.print("�Է°�: ");
		String num = s.nextLine().trim(); // ���ڿ��� �Է� �ޱ�
		char [] cn = num.toCharArray(); // ���ڿ��� �ѱ��ھ� �ɰ���
		
		for(char n : cn) { // cn�迭��ŭ �ݺ�
			result += (n-48);
		}
		System.out.println(result);
		return result;
	}
}
