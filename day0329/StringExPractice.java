package test.day0329;
//대소문자 문자열에서 대문자만 추출!
//ex)HelloworlDJAVA ProGrammING! 결과 : HDJAVAPGING
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

				
				
				
