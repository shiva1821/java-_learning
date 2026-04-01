package Encaptsulation;

public class Activity {
	private int wakeup;
	private int breakfast;
	private int lunch;
	private int snacks;
	private int dinner;
	private String name;
	public int getWakeup() {
		return wakeup;
	}
	public void setWakeup(int wakeup) {
		if(wakeup>=6&& wakeup<=8) {
		System.out.println("Good morning" +wakeup);
		}
		this.wakeup = wakeup;
	}
	public int getBreakfast() {
		return breakfast;
	}
	public void setBreakfast(int breakfast) {
		if(breakfast>=8&& breakfast<=9) {
		System.out.println("enjoybreakfast"+breakfast);
	}
		this.breakfast = breakfast;
	}
	public int getLunch() {
		return lunch;
	}
	public void setLunch(int lunch) {
		if(lunch>=1&& lunch<=2) {
		System.out.println("having lunch"+lunch);
	}
		this.lunch = lunch;
	}
	public int getSnacks() {
		return snacks;
	}
	public void setSnacks(int snacks) {
		if(snacks>=5&& snacks<=6) {
		System.out.println("snacks"+snacks);
		}

		this.snacks = snacks;
	}
	public int getDinner() {
		return dinner;
	}
	public void setDinner(int dinner) {
		if(dinner>=9&& dinner<=10) {
		System.out.println("dinner"+dinner);
	}
		this.dinner = dinner;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
