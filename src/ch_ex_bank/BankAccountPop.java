package ch_ex_bank;

/*
 * 은행계좌 기능 구현 Pop
 * @author roni
 * 
 * 
 * */

public class BankAccountPop {
	
	//계좌 1.잔고 초기화 
	static int balance =0;
	
	public static void main(String[] args) {

//		BankAccount kimAccount = new BankAccount();
//		kimAccount.name = "김길동";
		
		
		//계좌 2.입금 -> 계좌입금하기(동적인 상태로 바꿔주는 것; 메소드)
		deposit(10000);
		
		//계좌 3.출금
		withdraw(3000);
		
		//계좌 4.잔고 출력
		checkBalance();
	
		withdraw(1000);
		deposit(30000);
		checkBalance();

	}

	private static void checkBalance() {
		System.out.println("현재잔고: " + balance);		
	}

	private static void withdraw(int withdrawAmount) {
		balance -= withdrawAmount;
	}

	private static void deposit(int depositAmount) {
		balance += depositAmount;
	
		
	}
	
	
	
//		/method를 적용했을 때/
//	
//	private static int balance; //static을 붙이면 (new.클래스) 할 필요없이 메모리에 생성이 된다
//	private static int withdrawAmount;
//	
//	public static void main(String[] args) {
//		
//		//계좌 1.잔고 초기화 
//		int balance = 0;
//		//계좌 2.입금 -> 계좌입금하기(동적인 상태로 바꿔주는 것; 메소드)
//		deposit(10000);
//		
//		//계좌 3.출금
//		withdraw(3000);
//		
//		//계좌 4.잔고 출력
//		checkBalance();
//	
//		withdraw(1000);
//		deposit(30000);
//	}
//
//	private static void checkBalance() {
//		System.out.println("현재잔고: " + balance);		
//	}
//
//	private static void withdraw(int withdrawAmount) {
//		balance -= withdrawAmount;
//	}
//
//	private static void deposit(int depositAmount) {
//		balance += depositAmount;
//	
//		
//	}


		
//		/클래스를 배우기 전/
//	//계좌 1.잔고 초기화
//	int balance = 0;
//	//계좌 2.입금
//	int depositAmount = 10000;
//	balance += depositAmount;
//	
//	//계좌 3.출금
//	int withdrawAmount = 3000;
//	balance -= withdrawAmount;
//	
//	//계좌 4.잔고 출력
//	System.out.println("현재잔고: " + balance);
//	



		
}


