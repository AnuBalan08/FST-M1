
class Bicycle implements BicycleParts, BicycleOperations{
	
	int currentgears;
	int currentSpeed;
	
	Bicycle(int gears, int speed){
		this.currentgears = gears;
		this.currentSpeed = speed;
	}

	@Override
	public void applyBrake(int decrement) {
		// TODO Auto-generated method stub
		currentSpeed = currentSpeed-decrement;
		System.out.println("Current Speed is after brake:" + currentSpeed);
	}

	@Override
	public void speedUp(int increment) {
		currentSpeed = currentSpeed+increment;
		System.out.println("Current Speed is when speeding up :" + currentSpeed);
	}
	
	public String bicycleDesc() {
	    return("No of gears are "+ currentgears + "\nSpeed of bicycle is " + currentSpeed);
	}
	
	

}
