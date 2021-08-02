package ch06_4_method;

public class Calculator260 {
	int plus( int x, int y) {
		int result = x + y;
		return result;
	}
	
	double avg(int x, int y) {
		double sum = plus(x, y);
		double result = sum / 2;
		return result;
	}
	
	void excute() {
		double result = avg(7, 10);
		println("실행결과: " +result);
	}
	
	void println(String message) { //내부에서 정의한 메소드를 ㄱ콜 해서 쓴
		System.out.println(message);
	}

}
