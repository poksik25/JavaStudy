package Lesson1.CarTask;

import java.util.Arrays;

class Car {
    private String carBrand;
    private String numberOfCar;
    private double mileage;

    public Car(String carBrand, String numberOfCar, double mileage) {
        if (numberOfCar.length() == 8) {
            this.numberOfCar = numberOfCar;
        } else {
            System.err.println("Must be in this form: AA1111BB");
        }
        this.carBrand = carBrand;
        if (mileage >= 0) {
            this.mileage = mileage;
        } else {
            System.err.println("Mileage cannot be less than 0!");
        }


    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setNumberOfCar(String numberOfCar) {
        if (numberOfCar.length() == 8) {
            this.numberOfCar = numberOfCar;
        } else {
            System.err.println("Must be in this form: AA1111BB");
        }
    }

    public String getNumberOfCar() {
        return numberOfCar;
    }

    public void setMileage(double mileage, int numberOfCar) {
        if (mileage >= 0) {
            this.mileage = mileage;
        } else {
            System.err.println("Mileage cannot be less than 0!");
        }
    }

    public double getMileage() {
        return mileage;
    }

    public void getInfo() {
        System.out.println("Сar brand - " + carBrand + " with number:" + numberOfCar + ", and " +
                " mileage - " + mileage + " mille");
    }


    public double rideCar(double rideMileage) {
        mileage = mileage + rideMileage;
        return mileage;
    }

    public String toString() {
        return "Car{"
                + "brandCar = " + carBrand
                + ", number of Car = " + numberOfCar
                + ", mileage = " + mileage
                + '}';
    }

}


