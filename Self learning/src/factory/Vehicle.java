package factory;

public interface Vehicle {
    void printVehicle();
}

class TwoWheeler implements Vehicle {
    public void printVehicle() {
        System.out.print("Two Wheeler");
    }
}

class FourWheeler implements Vehicle {
    public void printVehicle() {
        System.out.print("Four Wheeler");
    }
}

class VehicleFactory {
    static Vehicle create(int type) {
        if (type == 1)
            return new TwoWheeler();
        else if (type == 2)
            return new FourWheeler();
        return null;
    }
}