package Lesson1.CarTask;

class Car {
    private String carBrand;
    private int numberOfCar;
    private double mileage;

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setNumberOfCar(int numberOfCar) {
        if (numberOfCar > 1000 && numberOfCar < 9999) {
            this.numberOfCar = numberOfCar;
        } else {
            System.out.println("Номер машины должен быть состоять из 4-х цифр");
        }
    }

    public int getNumberOfCar() {
        return numberOfCar;
    }

    public void setMileage(double mileage) {
        if (mileage > 0) {
            this.mileage = mileage;
        } else {
            System.out.println("Пробег не может быть отрицательным!");
        }
    }

    public double getMileage() {
        return mileage;
    }

    public void getInfo() {
        System.out.println("Марка машины - " + carBrand + " c номером:" + numberOfCar + ", и пробегом - " + mileage + " миль");
    }

    public double rideCar(double rideMileage) {
        mileage = mileage + rideMileage;
        return mileage;
    }

}

