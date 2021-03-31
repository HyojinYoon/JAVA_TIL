package test.day0330;

import java.util.*; 

class ArrayListEx2 { 
	public static void main(String[] args) { 
		final int LIMIT = 10;	//지역변수에는 파이널만 붙을 수 있다. final - 값 변경 불가 
		String source = "0123456789abcdefghijABCDEFGHIJ!@#$%^&*()ZZZ"; 
		
		int length = source.length(); //.length : 문자열의 갯수 
		
		List list = new ArrayList(length/LIMIT + 10); //다형성형태로 ArrayList가 List에있는걸 오버라이딩하는 것
		
		for(int i=0; i < length; i+=LIMIT) { //크기만큼 반복을 한다. 1씩이아니라 LIMIT만큼이라 10씩 증가 
			
			// 10 < 44 / 20 < 44 30 < 44 / 40 < 44 / 50 < 44
			if(i+LIMIT < length ) // i+LIMIT = 10  
				list.add(source.substring(i, i+LIMIT)); //0-9까지 복사. 10~19까지 복사. 20~29까지, 30~39까지
			else 
				list.add(source.substring(i)); //남아있는 부분은 몽땅다
		} 

		for(int i=0; i < list.size(); i++) { //사이즈만큼 반복하고
			System.out.println(list.get(i)); //꺼낸다
		} 
	} // main()
} 

//스트링을 이용해서 10개씩 끊어서 한다. 