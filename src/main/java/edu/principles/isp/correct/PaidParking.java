package edu.principles.isp.correct;

import edu.principles.isp.shared.Car;

public class PaidParking implements ParkingWithPayment {
    @Override
    public double calculateFee(Car car) {
        return 0;
    }

    @Override
    public void doPayment(Car car) {

    }

    @Override
    public void parkCar() {

    }

    @Override
    public void unparkCar() {

    }

    @Override
    public void getCapacity() {

    }
}
