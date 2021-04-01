package test.day0401;

import java.util.Scanner;

/*문제 1번
10이하의 정수를 입력받아 입력받은 정수의 횟수 만큼 "hello world" 출력한다. */
public class ApplyTest01 {
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		hw();	
	}
	
	public static void hw() {
		System.out.print("횟수 입력: ");
		int count = s.nextInt();
		if(count > 0 && count <= 10) {
			for(int i = 0; i < count; i++) {
			System.out.println("hello world");
			}
		}
	}	
}
