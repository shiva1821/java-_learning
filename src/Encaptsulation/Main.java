package Encaptsulation;

public class Main {
	public static void main(String[] args) {
		BankAccount ba = new BankAccount();
		//ba.bal=1000;
		//System.out.println(ba.bal);
		ba.setData(-10000);
		System.out.println(ba.getData());
	}

}
