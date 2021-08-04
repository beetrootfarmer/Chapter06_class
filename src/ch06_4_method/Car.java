package ch06_4_method;

public class Car {
	
	//생성자
	
	private static int gas;
	//메소드
	//연료충전 메소드
	void setGas(int gas) {
		this.setGas(gas);
	}
	//연료 잔량 상태
	boolean isLeftGas() {
		if( Car.gas == 0) {
			
			System.out.println("gas가 없습니다");
		}
		return false;
	}
	

}
