package test.day0329;
class Person{
	long id;			// p1.equals(p2)
	public boolean equals(Object obj){  // equals 메서드 오버라이딩 / obj = p2의 주소
		boolean result = false;
		if(obj !=null && obj instanceof Person){ // true && true
			Person p = (Person)obj; // p = p2의 주소
			result = id == p.id; // p1의 id(this.id) == p2의 id			
		}
		return result;
	}
	Person(long id){
		this.id=id;
	}
}

class EqualsEx2 {
	public static void main(String[] args) {
		Person p1 = new Person(8011081111222L);
		Person p2 = new Person(8011081111222L);

		if(p1 == p2){ // 주소를 비교
			System.out.println("p1 과 p2 는 같은 사람이다.");
		}else{
			System.out.println("p1 과 p2 는 다른 사람이다.");
		}

		if(p1.equals(p2)) // id를 비교
			{
				System.out.println("p1 과 p2 는 같은 사람이다.");
		}else{
			System.out.println("p1 과 p2 는 다른 사람이다.");
		}
	}
}
