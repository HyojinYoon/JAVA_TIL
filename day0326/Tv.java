package test.day0326;

public class Tv { 
	int channel = 88;
	
	Tv(){ // �⺻ ������
		channel = 55; //���� ����� �ִ� ��ü�� 55�� �ְڴ�. 88�� �ִ� ���� �ٽ� 55�� ��.
	}
	Tv(int channel){ // �Ű������� �ϳ��� ������
		this.channel = channel;
	}
	/* Tv t1 = new Tv();   => �⺻������ ȣ��
	   Tv t2 = new Tv(500); => �Ű����� int channel�� 500�� �־� ȣ�� */
	
}

 