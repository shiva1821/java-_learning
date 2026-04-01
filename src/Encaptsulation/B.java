package Encaptsulation;

public class B {
	public static void main(String[] args) {
		Customer c = new Customer();
		c.setcId(2);
		System.out.println(c.getcId());
		c.setcName("shiva");
		System.out.println(c.getcName());
		c.setcNum(666666666l);
		System.out.println(c.getcNum());
	}

}
