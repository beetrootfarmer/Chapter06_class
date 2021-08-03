package ch06_5_instance_static;

public class Car {
		
		//필드
		String model;
		int speed;
		
		//생성자
		Car(String model) {
			this.model = model; //멤버필드에 접근할때 this
		}
		
		//메소드
		void setSpeed(int speed) {
			this.speed = speed; 
		}
		
		void run() {
			for(int i=0; i<5; i++) {
				this.setSpeed((i+1) * 10);
				System.out.printf("%s가 달립니다. (시속 : %dkm/h)\n",
						this.model, this.speed);
		}
		System.out.println();
	
		}

//		MathUtil.pi

//class MathUtil {
//	static double pi = 3.141592;
//	String name;
	// class나 참조변수는 힙 영역에 저장되고 참조가 사라지면 가비지 컬렉터가 치운다.
	// static은 전혀 다른 메모리에 저장되어있다. 보기에는 class안에 속해보이지만 그렇지않다..
	// public class 밖에 static 을 쓰면 모든 곳에서 사용가능하지만 자바 규칙상 모든것이 클래스 안에 들어와야한다
	// 그래서 class MathUtil 자리를 잠시 빌려서 쓴다
	// 호출할때는 클래스.이름
	// 여기서 static double pi 은 정적멤버
}
