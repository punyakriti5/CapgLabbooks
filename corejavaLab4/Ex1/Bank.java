package capg.lab4.Ex1;



public class Bank {

	void deposit(Account accNum, double amount) {
		double currbal = accNum.getBalance();
		double upbal = currbal + amount;
		accNum.setBalance(upbal);
	}

	void withdraw(Account accNum, double amount) {
		double currbal = accNum.getBalance();
		double upbal = currbal - amount;
		accNum.setBalance(upbal);
	}

}