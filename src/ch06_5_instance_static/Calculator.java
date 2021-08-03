package ch06_5_instance_static;

public class Calculator {
	//필드
	static double pi = 3.14159;
	int x;
	int y;
	
	//생성자
	
	//메소드
	static int plus(int x, int y) {
		return x + y;
	}
	
	static int minus(int x, int y) {
		return x - y;
	}
}
