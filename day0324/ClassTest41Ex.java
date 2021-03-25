package test.day0324;
//상속을 이용하여 다음 클래스들을 간결한 구조로 재작성하세요.

class Pen{
	private int amount;
	public int getAmount() {return amount;}
	public void setAmount(int amount) { this.amount = amount; }
}


class SharpPencil extends Pen{			
	private int width;		// 펜의 굵기

}

class BallPen extends Pen{
	private String color;	// 볼펜의 색
	public String getColor() { return color; }
	public void setColor(String color) { this.color = color; }
}

class FountainPen extends BallPen{
	public void refill(int n) { setAmount(n); }
}

public class ClassTest41Ex {
	public static void main(String[] args) {
		
	}
}
