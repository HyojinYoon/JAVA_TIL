package test.java;

import test.day0323.Super;

public class Import extends Super {
	public static void main(String[] args) {
		System.out.println(Super.a); // 모두 가능(public)
		System.out.println(Super.b); // 다른클래스 자손에서는 가능(protected)
	  /*System.out.println(Super.c); //dafault - 다른 패키지 사용 불가
		System.out.println(Super.d); // private - 자기클래스에서만 가능 */
		
		
	}
}
