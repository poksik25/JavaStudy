package Lesson1.CarTask;

public class Loader {
    public static final int AMOUNT_OF_CARS = 5; // чтобы не было просто 5, мы объясняем что в массиве.

    public static void main(String[] args) {
        Car car[] = new Car[AMOUNT_OF_CARS];//Массив объектов отличается одной особенностью - они состоят из ссылок на объекты.
        car[0] = new Car("Audi", "АН7656ЛД", 1131.444);
        System.out.println(car[0]);

        car[1] = new Car("BMW", "ИО3376НО", 232.444);
        car[2] = new Car("Opel", "АЕ4432ОО", 98743.33);
        car[3] = new Car("Mercedes", "YY4434LK", 332.3);
        car[4] = new Car("Porsche", "ВВ4443ЛЛ", 3131.33);

        car[3].rideCar(1000);
        car[4].rideCar(333);

        for (int i = 0; i < car.length; i++){
            car[i].rideCar(10000);
        }

        double maxMileage = car[0].getMileage();

        Car carWithMaxMileage = car[0];

        for (int i = 0; i < car.length; i++) {
            if (maxMileage < car[i].getMileage()) {
                maxMileage = car[i].getMileage();
                carWithMaxMileage = car[i];
            }
        }

        System.out.println("Max mileage is - " + maxMileage + " mille" +
                ", at the car with the number: " + carWithMaxMileage.getNumberOfCar());

       for (int i = 0; i < car.length;i++){
           car[i].getInfo();
       }
        System.out.println(car);
    }

}
