package test.day0325;

import java.nio.channels.Channel;

public class ExceptionEx03 {
	public static void main(String[] args) { 
		try {
		Channel ch = System.inheritedChannel(); //예외 발생 - try, catch로 예외처리 필요
		}catch(Exception e) {
			
		}
		
	}
}
