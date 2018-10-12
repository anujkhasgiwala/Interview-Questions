package seating;

public class TrainCar {
	protected Passenger passengers[];
	TrainCar nextTrainCar;
	
	public TrainCar(Passenger passenger) {
		passengers = new Passenger[3];
		passengers[0] = passenger;
	}
}
