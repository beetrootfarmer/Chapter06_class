package ch06_6_packages_private;

public class Car {
	//필드
	private int speed;
	private boolean stop;
	
	//생성자
	//메소드
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		// [ speed 값 검증]
		if(speed < 0) {
			this.speed = 0;
			return;
		}else {
			this.speed = speed;
		}
	}
	public boolean isStop() { //boolean값은 getset이 아니라 is 로 해주기
		return  stop;
	}
	public void setStop(boolean stop) {
		this.stop = stop;
	}
}
