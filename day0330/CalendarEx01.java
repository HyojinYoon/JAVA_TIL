package test.day0330;

import java.util.Date;
import java.util.Calendar; // Calendar 클래스는 추상클래스 , GregorianCalendar이 자손 클래스
import java.util.GregorianCalendar;

public class CalendarEx01 {
	public static void main(String[] args) {
		// calendar 클래스를 활용하여 날짜를 출력하시오.
		Calendar c1 = new GregorianCalendar(); // 다형성, 자손클래스 활용
		System.out.println(c1);
		
		Calendar c2 = Calendar.getInstance(); // 이미 생성되어 있는 것을 받아옴 - 자신의 객체 리턴
		System.out.println(c2);
		
		System.out.println(c1.get(Calendar.YEAR)); // c1이 갖고 있는 YEAR를 꺼내라.
		System.out.println(c1.get(Calendar.DAY_OF_MONTH));
		
		Date day = new Date(); // 주로 Calendar보다 Date로 많이 사용
		System.out.println(day.getYear()+1900);
	}
}
