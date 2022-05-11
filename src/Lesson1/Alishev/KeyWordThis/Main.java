package Lesson1.Alishev.KeyWordThis;

public class Main {
    public static void main(String args[]) {

        Human human1 = new Human();
        human1.setAge(18);
        //почему нужно так
        // human1.name = "Tommy ";
        human1.setName("Tommy");
        human1.getInfo();

        Human human2 = new Human();
        human2.setName("Bob");
        human2.age = 17;
        human2.getInfo();
    }
}

class Human {
    String name;
    int age;

    public void setName(String name) { //Логично что myName лучше чтобы было просто name. Но у нас уже есть name.
        //java не знает какая name=name мы обращаемся и использует тут что ближе всего.
        //this - указывает ЭТО имя, ЭТОТ возраст. НУЖНО ВСЕГДА делать так
        //name = myName;
        this.name = name; // НУЖНО ВСЕГДА делать так
        // с помощью этого слова, мы обращаемся напрямую к объекту класса Human, например к human1;
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

    public void getInfo() {
        System.out.println(name + "," + age);
    }

}
