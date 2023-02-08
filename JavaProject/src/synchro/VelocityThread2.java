package synchro;

public class VelocityThread2 {
	Velocity faculty;
	public VelocityThread2(Velocity faculty) {
		this.faculty=faculty;
		
	}
public void run() {
	faculty.automation("Krushna");
}
}
