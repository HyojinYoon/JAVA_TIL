package test.day0323;
//다형성
public class ExtendsEx02 { 
	public static void main(String[] args) {
		Super su = null; // null-주소가 없다
		Sub s1 = new Sub();
		Sub s2 = null;
		
		su = s1; // s1을 su에 대입 ==> su = (Super)s1;
		su.add(); // add는 원래 조상꺼
		//su.sum(); // sum은 자손꺼
		
		// 조상 = 자손 // 자손 = 조상(X)
		s2 = (Sub)su; // 자손 = 조상 사용 시 (Sub) 명시로 sub 사용.
		s2.add();
		s2.sum();
		
		s1.x = 0;
		s2.sum();
	}
}