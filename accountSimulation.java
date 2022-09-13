package javaCOde;

public class accountSimulation {
	
	private int accountInfo = 123456789;
	private int currentBlance = 1234;
	private int amount;
	public int CubSubTractAmt = currentBlance + amount;
	
	public void printAccountInfo() {
		System.out.println("고객님의 계좌번호는 " + accountInfo + "입니다.\n");
	}
	
	public void printcurrentBlance() {
		System.out.println("고객님 계좌의 현재 금액은 " + currentBlance + "원 입니다.\n");
	}
	
	public void printDeposit(int amount) {
		System.out.println("고객님께서 " + amount +"원을 입금하셨습니다.");
		System.out.println("고객님 계좌의 현재 금액은 " + (currentBlance + amount) +"입니다.\n");
	}
	
	public void withdraw(int amount) {
		if(amount > currentBlance)
			System.out.println("고객님의 현재 계좌에서 " +(amount - currentBlance ) + "원이 부족합니다.");
		else { 
			System.out.println(amount + "원을 출금하셨습니다.");
			System.out.println("고객님의 현재 계좌 금액은 " + (currentBlance - amount) + "입니다.");
			currentBlance -=amount;
		}
	}

	public static void main(String[] args) {
		accountSimulation ac = new accountSimulation();
		
		//계좌정보 Method 호출
		ac.printAccountInfo();
		//현재 잔고 Method 호출
		ac.printcurrentBlance();
		//입금 Method 호출
		ac.printDeposit(1000);
		//출금 Method 호출
		ac.withdraw(1000);
	}

}