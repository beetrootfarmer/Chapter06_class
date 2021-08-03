package ch06_5_instance_static;

public class Person {
	//필드 
	//최조 선언 시 할당
	final String nation = "korea";
	final String ssn;
	String name;

	//생성자
	//생성자에서 할당
		public Person (String ssn, String name) {
		this.ssn = ssn;
		this.name =name;
	}
		
	//매소드
}
