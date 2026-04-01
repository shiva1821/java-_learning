package Encaptsulation;

public class LaunchLearner {
	public static void main(String[] args) {
		Learner obj=new Learner();
		obj.setAge(33);
		obj.setName("shiva");
		obj.setId(8);
		System.out.println(obj.getAge());
		System.out.println(obj.getName());
		System.out.println(obj.getId());
		System.out.println("   ");
		System.out.println( "********************" );
		System.out.println("   ");
		
		Learner obj2 = new Learner ();
		obj2.setAge(44);
		obj2.setId(4);
		obj2.setName("santu");
		System.out.println(obj2.getAge());
		System.out.println(obj2.getId());
		System.out.println(obj2.getName());
	}

}
