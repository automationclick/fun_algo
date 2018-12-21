package parking;

public class Bus  extends Vehicle
{

	public Bus()
	{
		size = VehicleSize.LARGE;
		spotNeeded = 1;
	}

	@Override
	public boolean canFitInSpot(ParkingSpot spot) {
		// TODO Auto-generated method stub
		return false;
	}
}
