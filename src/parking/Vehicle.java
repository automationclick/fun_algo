package parking;

import java.util.ArrayList;
import java.util.List;

public abstract class Vehicle 
{
	protected String licensePlate;
	protected int spotNeeded;
	protected ArrayList<ParkingSpot> parkingspots = new ArrayList<>();
	protected VehicleSize size;

	public int getSpotNeeded()
	{
		return this.spotNeeded;
	}

	public String getLicensePlate()
	{
		return this.licensePlate;
	}

	public VehicleSize getVehicleSize()
	{
		return this.size;
	}
	/**
	 * to park Vehicle in parking
	 */
	public void parkVehicleInParking(ArrayList<ParkingSpot> spots)
	{
		this.parkingspots.addAll(spots);
	}
	
	/**
	 * to remove vehicle from parking spot/spots
	 */
	
	public void unParkedVehicle()
	{
		// to remove parking spot, which has been occupied by Vehicle
	}
	
	public abstract boolean canFitInSpot(ParkingSpot spot);
}
