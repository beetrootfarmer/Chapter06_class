package ch06_4_method;

public class Calculator {

	//메소드
	public void powerOn() {
		System.out.println("전원을 켭니다.");
		
	}

	public int plus(int i, int j) {
		return i + j;
		
	}

	public void poweroff() {
		System.out.println("전원을 끕니다.");

	}

	public double divide(int i, int j) {
		if(j == 0) {
			System.out.println("0으로 나눌 수 없습니다."); // 분모가 0인 경우 알려줘야
		}
		return (double)i / j;
	}

			
}


