
public class MountainBike extends Bicycle{

	int seatHeight = 0;
	MountainBike(int gears, int speed, int seatHeight) {
		super(gears, speed);
		this.seatHeight = seatHeight;
		// TODO Auto-generated constructor stub
	}
	public void setHeight(int newValue) {
	    seatHeight = newValue;
	}
	
	public String bicycleDesc() {
		return (super.bicycleDesc()+ "\nSeat height is " + seatHeight);
	}
}
