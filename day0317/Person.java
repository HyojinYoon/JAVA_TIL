package test.day0317;

public class Person {
	String name; // 이름
	int age; // 나이
	int height; // 키
	int weight; // 몸무게
	int birthday; // 생일
	String addr; // 주소

	// Person(){}
	Person(String n){
		name = n;
	}
	Person(int a){
		age = a;
	}
		
	/*Person(String r){ -> 동일한 타입이 똑같이 들어갈 수 없음
		addr = r  } */
		
    Person(String ad, int b){
    	addr = ad;
    	birthday = b;
    }
}
