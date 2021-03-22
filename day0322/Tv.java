package test.day0322;

// ����, ä��, ����, ����ũ��, ����ũ��, ��ǰ��
// ���� - on/off => boolean
// ���� - on/off/������� => int(100 - on, 0 - off, 500 - ����)
//						 String ("����", "����", "����")
// ä�� - 1,3,5,7,9,11,15,17,20,22,30,44,45,50 => int[] (int �迭�� ���)
// ���� - 0~20 => int
// ũ�� - int - ���
// ��ǰ�� - String ("LG", "SAM", "�߼ұ��") - ���

/*�޼��� - Tv��� �����*/
// ���� - power ������ ���¸� �ݴ�� �����Ѵ�.
// ä�� - ä�� �ø��� - ������ ä���� ��� ó�� ä�η� ���� / ä�� ������ - ó�� ä���� ��� ������ ä�η� ����
// ä�� - �Է°��� �޾Ƽ� ä�� ���� - ä���� ���� ��� ���� ä�� ����!
// ���� - �ø��� - �ִ� ������ ��� ������� �ʴ´�.
// ���Ұ� - ������ 0���� �����. / ���Ұ� ���� �� ���� ���� ���·� ���ư���.
// Tv ���� ��� ex) brand-LG, ũ��-(x*y), ����-����, ä��-11ch, ����-10
// ä��, ���� ����� ������ �������� ���� �����Ѵ�.

public class Tv {
	private boolean power = false;
	private int [] channel = {1,3,5,7,9,11,15,17,20,22,30,44,45,50};
	private int indexCh = 0; //�迭�� ���ȣ - ù��° ��=0����(1)
	private int volume;
	private int muteVol; // ���Ұ� ���� ���� �� ���� ����
	private boolean mute = false; //���Ұ� ����
	public final int x; // ũ��   -- ����ε� �ʱ�ȭ ���ؼ� ���� �ߴ� ��(�ʱ�ȭ 1���� �����)
	public final int y; // ũ��
	public final String brand;
	public Tv() { // �⺻������(�Ű������� ���� ������)
		// ũ��� ��ǰ���� �����Ѵ�.
		this(100,80,"LG"); // �����ڿ��� �ٸ� ������ ȣ��(ù��!!)
		/*x = 100;
		  y = 80;
		  brand = "LG";  -> this�� �����ϰ� ���� �� ���� */
	}
	public Tv(int x, int y, String brand) {
		this.x = x; //����� �ʱ�ȭ�� �־����� �����ڿ��� �� ���� �� ����
		this.y = y;
		this.brand = brand;			
	}

	public void isPower(){  //������ ���¸� �ٲܶ� is�� ���� ����.
		this.power = !this.power; // ���� �ݴ�� �ٲ㼭 �����ض�
		if(this.power) { // this.power�� true ���,
			System.out.println(this.brand+"Tv On");
		}
	}
	
	public void channelUp() { /*���������� ���� ������ this ��������*/
		if(this.power) { //������ on�� ���� �����ؾ��ϱ� ����.
			if(this.indexCh == (this.channel.length-1)) { //length : ä���� ����, �迭�� �� ���� , index�� 0���� �����ϱ� ������ length�� 6�� ��� index�� 0~5��.
				this.indexCh = 0;
			}else {
				this.indexCh++;
			}
			System.out.println("Ch." + this.channel[this.indexCh]); // ä�ι迭�� index
		}
	}
	
	public void channelDown() {
		if(this.power) {
			if(indexCh == 0) {
				indexCh = channel.length-1;
			}else {
				indexCh--;
			}
			System.out.println("Ch. "+ channel[indexCh]);
		}
	}
	
	public void channelChange(int ch) { // ���ϴ� ä�η� �̵�
		if(this.power) {
			for(int i = 0; i < channel.length; i++) {
				if(channel[i] == ch) {
					indexCh = i;
					break;
				}
			}
			System.out.println("Ch. "+ channel[indexCh]);
		}
	}
	
	public void volumeUp() {
		if(this.power) {
			if(this.volume != 20) { //20������ �ö� �� �ֱ� ������ 20�� ���� ���� �������� �ø���. = 19���� �ø��� ���� ������.
				volume++;
			}
		}
	}
	
	public void volumeDown() {
		if(this.power) {
			if(this.volume != 0) {
				volume--;
			}
		}
	}
	
	public void isMute() {
		if(this.power) {
		this.mute = !this.mute;
		if(this.mute) {
			muteVol = volume;
			volume = 0;
		}else {
			volume = muteVol;
		   }
	    }	
	}
	public void print() {
		System.out.println(brand+" TV (" + x + "*" + y + ")");
		System.out.println("���� - " + power);
		System.out.println("ä�� - " + channel[indexCh]);
		System.out.println("���� - " + volume);
	}
}				


