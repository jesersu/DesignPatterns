package Builder.Interfaces.builder;

import Builder.Interfaces.car.CarType;
import Builder.Interfaces.components.Engine;
import Builder.Interfaces.components.GPSNavigator;
import Builder.Interfaces.components.Transmission;
import Builder.Interfaces.components.TripComputer;

public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
