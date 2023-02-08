package synchro;

public class SynExcution {
	public static void main(String[] args) {
		Velocity obj=new Velocity();
		VelocityThreads t1=new VelocityThreads(obj);
		VelocityThread2 t2=new VelocityThread2(obj);
		t1.start();
		t2.run();
	}

}
