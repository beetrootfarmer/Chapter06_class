package ch_ex_bank;
/*
 * 은행계좌 기능 구현 Oop
 * @author roni
 * 
 * 
 * */
		
public class BankAccoundOop {
	public static void main(String[] args) {
		
		BankAccount kimAccount 
		= new BankAccount ("kim");
		
		kimAccount.deposit(10000);
		kimAccount.withdraw(2000);
		kimAccount.checkBalance();
		
		BankAccount leeAccount
		= new BankAccount("lee", "777-777", 10000 );
		leeAccount.deposit(10000);
		leeAccount.checkBalance();
	}


}
