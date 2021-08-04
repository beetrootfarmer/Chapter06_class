package ch06_4_method;

public class ComputerExample {
	public static void main(String[] args) {
		Computer myCom = new Computer();
		
		int[] values1 = {1, 2, 3};
		int result1 = myCom.sum1(values1); //합을 int로 리턴하는 코드 , values1은 {1, 2, 3}의 시작주소
		System.out.println("result1: " + values1);
		
		int result2 = myCom.sum1(new int[] { 1, 2, 3, 4, 5});
		System.out.println("result2: " + result2);
		
		int result3 = myCom.sum2(1, 2, 3, 4, 5, 6, 7, 8);
		System.out.println("result3: " + result3);
		
		int result4 = myCom.sum2( 1, 2, 3, 4, 5);
		System.out.println("result4: " + result4);
		
	} 

}
