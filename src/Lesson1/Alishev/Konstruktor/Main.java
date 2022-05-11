package Lesson1.Alishev.Konstruktor;

public class Main {
    public static void main(String[] args) {
        Human human1 = new Human(); // это не имеет смысла так как мы создали человека, но у
        // Него нет имени и возраста. Потому что мы в ручную это добавляем и грубо говоря это можно написать.
//        Конструктор вызывается по умолчанию,  если мы ничего не заполнили.
        Human human2 = new Human("Roma", 22);

    }
}

class Human {
    /**
     * public Human(){
     * <p>
     * }
     * это конструктор по умолчанию.
     * ОТЛИЧАЕТЬСЯ от метода, тем что нет возвращаемого значения и он ДОЛЖЕН называться как и класс.
     */


    private String name;
    private int age;

    public Human() {
        System.out.println("Hello from the first constructor");
    }

    // мы можем иметь в одном классе с одним названием, до тех пор пока есть РАЗНЫЕ ПАРМЕТРЫ
    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
