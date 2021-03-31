package test.day0330;

import java.util.*; 

class ArrayListEx2 { 
	public static void main(String[] args) { 
		final int LIMIT = 10;	//������������ ���̳θ� ���� �� �ִ�. final - �� ���� �Ұ� 
		String source = "0123456789abcdefghijABCDEFGHIJ!@#$%^&*()ZZZ"; 
		
		int length = source.length(); //.length : ���ڿ��� ���� 
		
		List list = new ArrayList(length/LIMIT + 10); //���������·� ArrayList�� List���ִ°� �������̵��ϴ� ��
		
		for(int i=0; i < length; i+=LIMIT) { //ũ�⸸ŭ �ݺ��� �Ѵ�. 1���̾ƴ϶� LIMIT��ŭ�̶� 10�� ���� 
			
			// 10 < 44 / 20 < 44 30 < 44 / 40 < 44 / 50 < 44
			if(i+LIMIT < length ) // i+LIMIT = 10  
				list.add(source.substring(i, i+LIMIT)); //0-9���� ����. 10~19���� ����. 20~29����, 30~39����
			else 
				list.add(source.substring(i)); //�����ִ� �κ��� ������
		} 

		for(int i=0; i < list.size(); i++) { //�����ŭ �ݺ��ϰ�
			System.out.println(list.get(i)); //������
		} 
	} // main()
} 

//��Ʈ���� �̿��ؼ� 10���� ��� �Ѵ�. 