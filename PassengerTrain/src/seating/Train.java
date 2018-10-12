package seating;

public class Train {
	TrainCar engine;
	
	public TrainCar addPassenger(Passenger passenger) {
		if(engine == null)
			engine = new TrainCar(passenger);
		
		TrainCar temp = engine;
		while(temp != null)
			temp = temp.nextTrainCar;
		
		if(temp.passengers.length == 0 || temp.passengers.length == 3)
			temp.nextTrainCar = new TrainCar(passenger);
		else
			temp.passengers[temp.passengers.length] = passenger;
		
		return engine;
	}
	
	public void removeCar(int index) {
		if (engine == null) 
            return;
  
        TrainCar temp = engine; 

        if (index == 0) {
            engine = temp.nextTrainCar; 
            return;
        }

        int i = 0;
        while(temp != null && i < index - 1) {
        	i++;
        	temp = temp.nextTrainCar;
        }

        if (temp == null || temp.nextTrainCar == null) 
            return; 

        TrainCar next = temp.nextTrainCar.nextTrainCar; 
  
        temp.nextTrainCar = next;
	}
	
	public int countCars() {
		int count = 0;
		
		if(engine == null)
			return count;
		
		TrainCar temp = engine;
		while(temp != null) {
			count++;
			temp = temp.nextTrainCar;
		}
		
		return count;
	}
}
