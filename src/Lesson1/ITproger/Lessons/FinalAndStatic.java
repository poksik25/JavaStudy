package Lesson1.ITproger.Lessons;

public class FinalAndStatic {
    public static void main(String[] args) {
        int x = Calculate.sum(56, 323);// можем взять sum не создавая объекта, ПОТОМУ ЧТО static позволяет обращаться к классу.
        System.out.println(x);

        // чтобы вызвать multiplication, нужно создать метод.
        Calculate calculate1 = new Calculate();
        calculate1.multiplication(44,1321);
        System.out.println(calculate1.multiplication(44,33));

        Calculate.x = 333;// можем менять не создавая объекта
        System.out.println(Calculate.x);
        Calculate b = new Calculate();
        System.out.println(b.x);
        //НО static меняет значение сразу у ВСЕХ объектов класса и поэтому если нужно корректным
        //он не подходит, только для ОБЩИХ значений.


    }
}

