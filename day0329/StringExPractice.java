package test.day0329;
//��ҹ��� ���ڿ����� �빮�ڸ� ����!
//ex)HelloworlDJAVA ProGrammING! ��� : HDJAVAPGING
public class StringExPractice {
	public static void main(String[] args) {
		String str = "HelloworlDJAVA ProGrammING!"; // A : 65 Z : 96
		System.out.println("HelloworlDJAVA ProGrammING!");
	}
		public static String upperletter(String msg) {
			byte [] b = msg.getBytes();
			String result = "";
			String [] sp = msg.split(" ");
			for(int i = 0; i < msg.length(); i++) {
				if(i>=65 && i<=96) {
					System.out.println();
				}
				
			}
		}
}

				
				
				
