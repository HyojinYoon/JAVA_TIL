package test.day0330;

import java.util.Scanner;

public class ScannerEx01 {
	public static void main(String[] args) {
	
		String str = "100,200,300,400,500";
		Scanner s1 = new Scanner(str);
		s1 = s1.useDelimiter(","); // useDelimiter : ���ڸ� ,�� �����ؼ� Scanner ��ü�� ����
		
		System.out.println(s1.next());
		System.out.println(s1.next());
		System.out.println(s1.next());
		System.out.println(s1.next());
		System.out.println(s1.next());		
	
		
		
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println("�Է¹��� ��="+input); // input : �Է¹��� ���� ������.(String����)
		
		input = s.nextLine();
		System.out.println("�Է¹��� ��="+input); // <Console>â�� �Է����ָ� ��.

	}
}
