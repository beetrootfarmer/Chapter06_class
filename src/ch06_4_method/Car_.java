package ch06_4_method;

public class Car_ {
	//필드
	int speed;
	
	//생성자 
	
	//메소드
	int getSpeed() { //Generate getter setter 자동으로 메소드 생
		return speed;
		
	}
	
	void keyTurnOn() {
		System.out.println("키를 돌립니다");
	}
	void run() {
		for(int i=0; i<=110; i+=10) {
			speed = i;
			System.out.println("달립니다.(시속: "+ speed + "km/h)");
			System.out.println(speed);

		}
	}
}
