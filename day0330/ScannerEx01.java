package test.day0330;

import java.util.Scanner;

public class ScannerEx01 {
	public static void main(String[] args) {
	
		String str = "100,200,300,400,500";
		Scanner s1 = new Scanner(str);
		s1 = s1.useDelimiter(","); // useDelimiter : 문자를 ,로 구분해서 Scanner 객체에 대입
		
		System.out.println(s1.next());
		System.out.println(s1.next());
		System.out.println(s1.next());
		System.out.println(s1.next());
		System.out.println(s1.next());		
	
		
		
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println("입력받은 값="+input); // input : 입력받은 값을 리턴함.(String으로)
		
		input = s.nextLine();
		System.out.println("입력받은 값="+input); // <Console>창에 입력해주면 됨.

	}
}
