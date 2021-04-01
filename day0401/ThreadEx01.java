package test.day0401;

// Thread 클래스 상속 / Runnable 인터페이스 구현
class MyThread extends Thread{ // Thread 상속해서 구현
	// run() 메서드를 오버라이딩한다.
	public void run() { // 상속받은 run() 메서드 오버라이딩
		for(int i = 0; i < 100; i++) {
			System.out.println("1");
		}		
	}
}

public class ThreadEx01 {
	public static void main(String[] args) { // main 스레드
		MyThread mt = new MyThread();
		MyThread mt2 = new MyThread();
		mt.start(); //start()가 run()를 호출하도록 세팅되어 있음
		// start() : 새로운 스레드를 만들어서 실행하게 하는 메서드 (멀티스레드 구현)
		mt2.start();
		for(int i = 0; i < 100; i++) {
			System.out.println("0");
		}
		System.out.println("종료");
	}
}
