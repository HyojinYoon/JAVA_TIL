package test.day0401;

import javax.swing.JOptionPane;

class ThreadEx6 {
	public static void main(String[] args) throws Exception{
		String input = JOptionPane.showInputDialog("�ƹ� ���̳� �Է��ϼ���."); // �Է�â�� �߰� �ϴ� �ڵ�
		System.out.println("�Է��Ͻ� ���� " + input + "�Դϴ�.");
		for(int i=10; i > 0; i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000); // APIȮ��-InterruptedException�̶� ����ó�� �ʼ� - RuntimeException�� ����ó�� ���ص� ��
				// 1000(1��) : ������ �ð����� �����带 �Ͻ����� ��Ų��.
			} catch(Exception e ) {}
		}}}