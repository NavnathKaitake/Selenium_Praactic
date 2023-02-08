package synchro;

public class VelocityThreads extends Thread {
	Velocity faculty;
	public VelocityThreads(Velocity faculty) {
		this.faculty=faculty;
		
	}
	public void run() {
		faculty.automation("Ram");
	}

}
