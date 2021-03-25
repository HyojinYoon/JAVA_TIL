package test.day0323;

//다형성 - 배열로 객체 관리
public class polyEx01 {
	public static void main(String[] args) 
	{
		int [] a = new int[3]; //기본형 배열 (기본값 0 0 0 )
		Super [] s = new Super[3]; //참조형 배열 (기본값 null null null)
		
		s[0] = new Super();
		s[1] = new Super();
		s[2] = new Super();
		System.out.println(s); // ->[Ltest.day0323.Super;@4926097b =>L은 배열의 주소라는 의미
		System.out.println(s[0]);
		System.out.println(s[1]);
		System.out.println(s[2]);
		
		System.out.println(s[0].x);
		/* Super s0 = new Super();
		   System.out.println(s[0].x); 와 동일*/
	}
}
