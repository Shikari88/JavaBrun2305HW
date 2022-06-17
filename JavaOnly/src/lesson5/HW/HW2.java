package lesson5.HW;

public class HW2 {
    /*
    Создать два класса Tree и Bush, наследующиеся от класса Plant
        У обоих классов будут конструкторы работающие так же, как и конструктор Plant
        Метод grow в классе Tree будет увеличивать поле с высотой на 0.9
        Метод grow в классе Bush будет увеличивать поле с шириной на 0.05
    В psvm создать объекты Tree и Bush, вывести их поля, вызвать метод grow и вывести поля ещё раз
    Задание со "звездочкой":
        Создать массив с типом данных Plant, поместить туда созданные ранее объекты классов Tree и Bush
        С помощью цикла for получить каждое растение и вызвать у него метод grow()
     */
    public static void main(String[] args) {

        Tree tree = new Tree(100,10);
        Bush bush = new Bush(20, 15);
        System.out.println("Высота: " + tree.height + "; Ширина: " + tree.width);
        System.out.println("Высота: " + bush.height + "; Ширина: " + bush.width);
        System.out.println("После изменения");
        tree.grow();
        bush.grow();
        System.out.println();


        //Задание со "звездочкой"
        Plant[] plants = new Plant[2];
        plants[0] = tree;
        plants[1] = bush;

        for(Plant p: plants) {
            p.grow();
        }
    }
}
