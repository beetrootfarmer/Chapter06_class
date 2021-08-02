package ch06_4_method;

public class CalculatorExample {

	public static void main(String[] args) {
		
		Calculator myCalc = new Calculator();
		
		/*return 써주는 방법*/
		if(myCalc == null) {
			return;
			
		//계산기 켜기
		myCalc.poweron();
		}
		
		//계산하기
		int var = myCalc.plus(8, 8);
		System.out.println("var: " +var);
		
		double var2 = myCalc.divide(4, 8); //자동형변
		System.out.println("var2: " +var2);
		
		byte x = 10;
		byte y = 4;
		double var3 = myCalc.divide((int)x, (int)y);
		System.out.println("var3: " + var3);
		
		//계산기 끄기
		myCalc.poweroff();
	}
}
