package ch_ex_bank;

public class BankAccount {
	
	//필드
	String name;
	String number;
//	String ssn;
	int balance;
//	String address;
	
	//생성자
//	public BankAccount(String n, String nu, String s, int b, String a ) {
//		name = n;
//		number = nu;
//		ssn = s;
//		balance = b;
//		address = a;
//	}
	public BankAccount (String name) {
		this(name, "123", 0 );
	}//(나머지 공간에  임의 초기화값)
	
	public BankAccount (String name, String number) {
		this(name, number, 0 );
	}//(기본이 세 개 인데 정보가 두개일때 나머지 공간에 0)
	
	public BankAccount (String name, String number, int balance) {
		this.name =name;
		this.number =number;
		this.balance =balance;
	
	
	//메소드
	}
	public void deposit(int amount) {
		this.balance += amount;
	}
	public void withdraw(int amount) {
		this.balance -= amount;
	}
	public void checkBalance() {
		System.out.println(this.name + "계좌의 현재잔고 : " + this.balance);
	}
}
