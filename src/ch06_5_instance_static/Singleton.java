package ch06_5_instance_static;

/**
 *  싱글톤 객체 만들기
 *  @author chicory
 *  전체 프로그램에서 only 1개의 객체 생성 
 */

public class Singleton {
	
	//스태틱 필드 (생성된 객체(1개) 참조변수 생성)
	private static Singleton ref = new Singleton();
	
	//private 생성자
	//외부에서 생성자 호출이 안되도록
	private Singleton() {}
	
	//스태틱 매소드 (위에서 생성한 new Singleton();의 주소값을 계속해서 리턴)
	static Singleton getInstance() {
		return ref;
	}
}
