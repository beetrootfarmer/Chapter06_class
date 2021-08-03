package ch06_5_instance_static;

public class Car278 {
	int speed;
	
	void run() {
		System.out.println(speed + "으로 달립니다.");
	}
	
	public static void main(String[] args) {
		Car278 myCar = new Car278();
		myCar.speed = 60;
		myCar.run();
	}
}
