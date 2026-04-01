package Encaptsulation;

import java.io.InputStream;
import java.util.Scanner;

public class C {
	public static void main(String[] args) {
		Activity obj = new Activity();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter wakeup time");
		System.out.println("enter break fst ");
		System.out.println(" enter lunch time ");
		System.out.println("enter snacks time");
		System.out.println("enter dinner time");
		System.out.println(" enter name time ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c= sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		String name = sc.next();
		
		obj.setWakeup(a);
		obj.setBreakfast(b);
		obj.setLunch(c);
		obj.setSnacks(d);
		obj.setDinner(e);
		obj.setName(name);
		
		System.out.println("entered wakeup time "+obj.getWakeup());
		System.out.println("entered breakfast time "+obj.getBreakfast());
		System.out.println("entered lunch time "+obj.getLunch());
		System.out.println("entered snacks time "+obj.getSnacks());
		System.out.println("entered dinner time "+obj.getDinner());
		System.out.println("entered name time "+obj.getName());
	}
}
		
		
		
		



