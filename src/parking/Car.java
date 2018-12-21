package parking;

public class Car extends Vehicle
{

	public Car()
	{
		size = VehicleSize.MEDIUM;
		spotNeeded = 1;
	}

	@Override
	public boolean canFitInSpot(ParkingSpot spot) {
		// TODO Auto-generated method stub
		return false;
	}
}
