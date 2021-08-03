package ch06_5_instance_static;

public class CalculatorExample {
	public static void main(String[] args) {
		
		double result1= 10* 10 * Calculator.pi;
		int result2 = Calculator.plus(10, 5);
		int result3 = Calculator.minus(10, 5);
	}

}
//		A.pi=0;
//		A.method(); //클래스.staticMethod
//		
//		System.out.println(); // 여기서 out도 static