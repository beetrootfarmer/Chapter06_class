package ch06_5_instance_static;

public class SingletonExample {
	public static void main(String[] args) {
		/* 컴파일 에러
		 * Singleton obj1 = new Singleton();
		 * Singleton obj2 = new Singleton();
		 * */
		
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		System.out.println(System.identityHashCode(obj1));
		System.out.println(System.identityHashCode(obj2));

		if(obj1 == obj2) {
			System.out.println("같은 singleton 객체입니다.");
		} else {
			System.out.println("다른 singleton 객체입니다.");
		}
	}

}
