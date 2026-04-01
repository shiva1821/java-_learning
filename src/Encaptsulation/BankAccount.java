package Encaptsulation;

public class BankAccount {
	private int bal;
	public void setData(int x) {
		if (x>=0){
			bal =x ;
		}
		else
			System.out.println("bank cannot be -ve");
		System.exit(0);
		}
	public int getData() {
		return bal;
	}
}

