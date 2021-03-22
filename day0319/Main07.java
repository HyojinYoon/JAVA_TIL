package test.day0319;

class Person{
	private String name; // 이름 - 이름에 이상한 것이 들어가기를 방지용 private(ex.숫자)
	private int age; // 나이 1~200으로 설정하기 위한 작업 - private
	
	// 유효성 검사 - 유효한 값이 들어왔는지 검사하는 것
	/* 대입을 하기 위한 메서드 = set이라고 앞에 적음 */
	public void setAge(int age) { // 변수 age에 값을 대입할 목적의 메소드 - 값만 대입하고 끝이기 때문에 void
		if(age > 0 && age < 200) { //&& 주어진 모든 조건이 true여야함.
		this.age =age; //int age의 값을 private int age 값에 대입해라
		}
	}
	public int getAge() { // -> 저장된 변수값을 리턴만 해주는 메서드
		return age; // return age++; age--; 등의 작업 후 return 가능
	}
}
public class Main07 {
	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person();
		
	
		p1.setAge(20); //20이 setAge에 대입되고 private int age에 대입

	}
}
