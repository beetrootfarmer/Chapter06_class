package ch06_5_instance_static;

public class PersonExample {
	public static void main(String[] args) {
		Person p1 = new Person("123456-1234567", "홍길동");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
	
		//p1.nation = "usa"; >>이 필드는 할당될 수 없음.
//		p1.ssn = "123456-1234567";
		p1.name = "홍삼원"; //>>이 필드는 파이널이 아님! 재할당 가능
	
		System.out.println(p1.name);
	}

}
