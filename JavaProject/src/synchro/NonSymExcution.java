package synchro;

public class NonSymExcution {
	public static void main(String[] args) {
		Velocity1 obj=new Velocity1();
		VelocityThread1 t1=new VelocityThread1(obj);
		VelocityThread3 t2=new VelocityThread3(obj);
		t1.start();
		t2.run();
	}

}
