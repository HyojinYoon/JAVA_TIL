package test.day0330;

import java.util.Date;

import java.text.SimpleDateFormat;

public class DateEx01 {
	public static void main(String[] args) {
		Date day01 = new Date();
		System.out.println(day01);
		
		Date day02 = new Date(2021-1900,2,30); // 월은 0월부터 시작됨.
		System.out.println(day02);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
		System.out.println(sdf.format(day01));
		System.out.println(sdf.format(day02));
	}
}

/* 프로그래밍의 날짜 기준. - 기준에서부터 지정한 날까지 흘러온 시간을 계산해서 출력되는 형식
   1900년 1/1 0시 0분 0초
   1970년 1/1 0시 0분 0초 	
   둘 중 어떤 기준으로 설정되어 있는지 API 생성자를 읽고 확인 필요 */