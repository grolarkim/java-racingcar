package model;


public class Car {


    private final CarName carName;
    private CarPosition carPosition;


    private Car(CarName carName, CarPosition carPosition) {
        this.carName = carName;
        this.carPosition = carPosition;
    }

    public static Car carWithName(CarName carName) {
        return new Car(carName, CarPosition.ZERO);
    }

    public void move() {
        this.carPosition = this.carPosition.move();
    }

    public boolean isSamePosition(CarPosition carPosition) {
        return this.carPosition.equals(carPosition);
    }

    public CarName getCarName() {
        return new CarName(this.carName.getName());
    }

    public CarPosition getCarPosition() {
        return new CarPosition(this.carPosition.getPosition());
    }
}