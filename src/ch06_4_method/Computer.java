package ch06_4_method;

public class Computer {
	
	int sum1(int[] values) {
		int sum = 0; //항상 합을 구할 때0으로 초기
		for(int i = 0; i<values.length; i++) {
			sum +=values[i];
			
		}
		return sum;
	}
	int sum2(int...values) { //매개변수의 가번인자.
		int sum =0;
		for(int i =0; i<values.length; i++) {
		sum += values;
	}
		return sum;



		}
	int arraySsum
	}

