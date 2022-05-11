package Lesson1.Alishev.ClassesAndObjects;

public class ClassesAndObjects { // можно создать только один
    public static void main(String[] args) {
        Person person1 = new Person(); // person1 это переменная класса Person, которая ссылается уже на новый объект.
        person1.age = 19;
//        person1.name = "Roma";
//        System.out.println("My names is" + person1.name + ", i'm " + person1.age);
        person1.setNameAndAge("Roma1", 18);
        person1.spek();
//        person1.calculateYearsToRetirement();
        int year1 = person1.calculateYearsToRetirement1();
        System.out.println("у первого до пенсии " + year1);

        Person person2 = new Person();
        person2.age = 14;
        //   person2.name = "Kolya";
        String sr1 = " Kolyan";
        person2.setNameAndAge(sr1,person2.age);
        person2.spek();
        person2.calculateYearsToRetirement();
        int year2 = person2.calculateYearsToRetirement1();
        System.out.println("у второго до пенсии " + year2);
//        System.out.println("My names is " + person1.name + ", i'm " + person2.age);

    }
}

/*
Абстрактный клас
Можно создать любое количество классов
1. Данные (поля);
2. Действия (методы);
 */
class Person { // передает в объект созданный из класса person. Обязательно будет имя и возраст.
    String name;
    int age;

    void spek() {
        for (int i = 0; i < 3; i++) {
            System.out.println("My names is " + name + ", i'm " + age);
        }
    }

    void setNameAndAge(String userName, int userAge) {
        name = userName;
        age = userAge;
    }

    void sayHello() {
        System.out.println("Hello");
    }

    void calculateYearsToRetirement() {
        int years = 65 - age;
        System.out.println("Лет до пенсии " + years);

    }

    int calculateYearsToRetirement1() {
        int years = 65 - age;
        return years;

    }
}
