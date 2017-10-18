package labwork;

public class Vehicle implements vehicle_interface {		
	
	public Object Car;
	public Object Bus;
	
	public Object Ship;
	public Object Boat;
	
	public Object Plane;
	public Object Chopper;
	
	int S_spd;
	
	public void speed(int spd) {
		// TODO Auto-generated method stub
			S_spd = spd;
			System.out.println("Speed: "+spd+"KM/H");
		}
	public boolean isRunning() {
		if(S_spd == 0) {
			
			System.out.println("Not Running.");			
			return false;
		}
		else {
			
			System.out.println("Running.");			
			return true;
		}
	}

}