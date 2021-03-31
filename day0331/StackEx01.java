package test.day0331;

import java.util.Stack;

public class StackEx01 {
	public static void main(String[] args) {
		Stack s = new Stack();
		s.push("네이버");
		s.push("뉴스");
		s.push("기사");
		
		System.out.println(s);
		System.out.println(s.peek()); // peek : 제일 위에 있는 객체 추출
		System.out.println(s.peek()); // 맨위에 있는 객체가 무엇인지 보여주는 것 뿐, 사라지지 않음
		System.out.println(s.pop()); // -> 기사
		System.out.println(s.pop()); // -> 뉴스 - 제일 위에 있는 객체 추출 후 삭제하기 때문에 기사 사라졌음
		System.out.println(s.pop()); // -> 네이버 - 뉴스도 사라짐
	}
}
