package test.day0401;

import java.util.Scanner;

/*���� 1��
10������ ������ �Է¹޾� �Է¹��� ������ Ƚ�� ��ŭ "hello world" ����Ѵ�. */
public class ApplyTest01 {
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		hw();	
	}
	
	public static void hw() {
		System.out.print("Ƚ�� �Է�: ");
		int count = s.nextInt();
		if(count > 0 && count <= 10) {
			for(int i = 0; i < count; i++) {
			System.out.println("hello world");
			}
		}
	}	
}
