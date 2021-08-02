package ch06_4_method;

public class Car_Example {
	public static void main(String[] args) {
		Car_ nCar = new Car_();
		nCar.keyTurnOn();
		nCar.run();
		int speed = nCar.getSpeed();
		System.out.println("현재속도: " +speed + "km/h");
	}
}
