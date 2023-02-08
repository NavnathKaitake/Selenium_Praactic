package synchro;

public class VelocityThread1 extends Thread {
	Velocity1 faculty;
	public VelocityThread1(Velocity1 faculty) {
		this.faculty=faculty;
		
	}
	public void run() {
		faculty.automation("Ram");
	} 

}
