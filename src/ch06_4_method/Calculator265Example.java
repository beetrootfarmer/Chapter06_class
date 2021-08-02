package ch06_4_method;

public class Calculator265Example {
	public static void main(String[] args) {
		Calculator265 myCalc = new Calculator265();
		
		//정사각형 넓이 구하기
		double result1 = myCalc.areaRectangle(10);
		
		//직사각형 넓이 구하기
		double result2 = myCalc.areaRectangle(10, 20);
		
		//결과 출력
		System.out.println("정사각형 넓이= " + result1);
		System.out.println("직사각형 넓이= " + result2);

	}

}
