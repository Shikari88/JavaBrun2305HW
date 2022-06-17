package lesson5.HW;

/*
    Взять любой из классов последних занятий и переопределить в нём методы toString, equals и hashCode
    В toString использовать любой вариант создания/форматирования строк для вывод информации об объекте
    В hashCode использовать метод Objects.hash для генерации уникального числа из всех полей объекта
    В equals определить своё правило сравнения объектов (например, сравнивать по всем полям кроме одного)
    Лучше всего использовать возможность "Generate" от IDEA (обычно Alt+Insert или пр.кл.мыши -> Generate)
 */
public class HW3 {
    public static void main(String[] args) {
        Person person = new Person("Hannah", 18);
        Person person1 = new Person("Jake", 18);
        Person person2 = new Person("John", 19);

        System.out.println(person);
        System.out.println(person.hashCode());
        System.out.println(person.equals(person1));
        System.out.println(person.equals(person2));
    }
}
