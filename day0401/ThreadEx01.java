package test.day0401;

// Thread Ŭ���� ��� / Runnable �������̽� ����
class MyThread extends Thread{ // Thread ����ؼ� ����
	// run() �޼��带 �������̵��Ѵ�.
	public void run() { // ��ӹ��� run() �޼��� �������̵�
		for(int i = 0; i < 100; i++) {
			System.out.println("1");
		}		
	}
}

public class ThreadEx01 {
	public static void main(String[] args) { // main ������
		MyThread mt = new MyThread();
		MyThread mt2 = new MyThread();
		mt.start(); //start()�� run()�� ȣ���ϵ��� ���õǾ� ����
		// start() : ���ο� �����带 ���� �����ϰ� �ϴ� �޼��� (��Ƽ������ ����)
		mt2.start();
		for(int i = 0; i < 100; i++) {
			System.out.println("0");
		}
		System.out.println("����");
	}
}
