package test.day0401;

import javax.swing.JOptionPane;

class ThreadEx6 {
	public static void main(String[] args) throws Exception{
		String input = JOptionPane.showInputDialog("아무 값이나 입력하세요."); // 입력창이 뜨게 하는 코드
		System.out.println("입력하신 값은 " + input + "입니다.");
		for(int i=10; i > 0; i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000); // API확인-InterruptedException이라서 예외처리 필수 - RuntimeException만 예외처리 안해도 됨
				// 1000(1초) : 지정된 시간동안 스레드를 일시정지 시킨다.
			} catch(Exception e ) {}
		}}}