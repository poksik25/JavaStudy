package Lesson1.Alishev.Encapculation;

public class GetterSetter {
    public static void main(String[] args) {
        Person person1 = new Person(); // person1 это переменная класса Person, которая ссылается уже на новый объект.
        person1.setName("Max");
        System.out.println("Выводи значения в main: " + person1.getName());
        person1.setAge(13);
        System.out.println("Выводи значения в main: " + person1.getAge());
        person1.setSex('м');
        System.out.println("пол - " + person1.getSex() );

        //  person1.speak();


        Person person2 = new Person();
        person2.setName("");
        System.out.println("Выводи значения в main: " + person2.getName());
        person2.setAge(-7);
        System.out.println("Выводи значения в main: " + person2.getAge());


    }
}

class Person {
    private String name; // видно только в этом классе, мы можем изменить на login, но пользователь уже этого не увидит
    private int age;
    private char sex;

    public void setName(String userName) {
        if (userName.isEmpty()) {
            System.out.println("Вы ввели пустое имя");
        } else {
            name = userName;

        }
    }

    public String getName() {
        return name;
    }

    public void setAge(int userAge) {
        if (userAge < 0) {
            System.out.println("возраст должен быть больше 0");
        } else {
            age = userAge;
        }
    }

    public int getAge() {
        return age;
    }

    public void setSex(char userSex) {
        sex = userSex;
    }

    public char getSex() {
        return sex;
    }

    void speak() {
        System.out.println("My names is " + name + ", i'm " + age);
    }
}


