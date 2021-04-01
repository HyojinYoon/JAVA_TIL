package test.day0401;

import java.util.Scanner;

/*문제 2번
각 자리수의 값을 더하여 출력하는 프로그램을 작성
예) 4567 => 4+5+6+7 => 22를 출력하는 문제*/
public class ApplyTest02 {
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		test2();
	}
	public static int test2() {
		int result = 0;
		System.out.print("입력값: ");
		String num = s.nextLine().trim(); // 문자열로 입력 받기
		char [] cn = num.toCharArray(); // 문자열을 한글자씩 쪼개줌
		
		for(char n : cn) { // cn배열만큼 반복
			result += (n-48);
		}
		System.out.println(result);
		return result;
	}
}
