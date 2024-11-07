package edu.principles.isp.wrong;

import edu.principles.isp.shared.Car;

/**
 * Clients should not be forced to implement a function they do no need.
 */
public class FreeParking implements ParkingLot {
    @Override
    public void parkCar() {

    }

    @Override
    public void unparkCar() {

    }

    @Override
    public void getCapacity() {

    }

    /*
     * Violates ISP principle
     */
    @Override
    public double calculateFee(Car car) {
        throw new UnsupportedOperationException();
    }

    /*
     * Violates ISP principle
     */
    @Override
    public void doPayment(Car car) {
        throw new UnsupportedOperationException();
    }
}
