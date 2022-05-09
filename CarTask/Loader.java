package Lesson1.CarTask;

public class Loader {
    public static void main(String[] args) {
        Car car[] = new Car[5];//Массив объектов отличается одной особенностью - они состоят из ссылок на объекты:

        car[0] = new Car();
        car[0].setCarBrand("Porsche");
        car[0].setNumberOfCar(1433);
        car[0].setMileage(11333.33);

        car[1] = new Car();
        car[1].setCarBrand("Opel");
        car[1].setNumberOfCar(1873);
        car[1].setMileage(563333.33);

        car[2] = new Car();
        car[2].setCarBrand("Kia");
        car[2].setNumberOfCar(2133);
        car[2].setMileage(23133.33);

        car[3] = new Car();
        car[3].setCarBrand("BMW");
        car[3].setNumberOfCar(7243);
        car[3].setMileage(43133.33);

        car[4] = new Car();
        car[4].setCarBrand("Audi");
        car[4].setNumberOfCar(1043);
        car[4].setMileage(69133.33);
        car[4].rideCar(1000000.0);

        double max = car[0].getMileage();
        int temp = 0;

        for (int i = 0; i < car.length; i++) {
            //  double maxCar = car[0].getMileage();
            if (max < car[i].getMileage()) {
                max = car[i].getMileage();
                temp = i;
            }
        }

        System.out.println("Максимальный пробег - " + max + " миль" +
                ", у машины c номером: " + car[temp].getNumberOfCar());
    }
}

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

