package edu.principles.isp.wrong;

import edu.principles.isp.shared.Car;

public interface ParkingLot {

    void parkCar();    // Decrease empty spot count by 1

    void unparkCar(); // Increase empty spots by 1

    void getCapacity();    // Returns car capacity

    double calculateFee(Car car); // Returns the price based on number of hours

    void doPayment(Car car);
}
