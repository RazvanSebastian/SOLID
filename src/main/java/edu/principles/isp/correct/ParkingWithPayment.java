package edu.principles.isp.correct;

import edu.principles.isp.shared.Car;

public interface ParkingWithPayment extends ParkingLot {

    double calculateFee(Car car); // Returns the price based on number of hours

    void doPayment(Car car);

}
