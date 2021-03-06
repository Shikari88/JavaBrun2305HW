package Lesson3;

    /*
    Внутри класса HW3 написать метод под именем oneOrLessSubst, который принимает строку original и строку target
    Метод должен возвращать true, если target встречается внутри original не больше 1 раза
    и false в обратном случае
    Например для строк original="asdasdasd" и target="asd" он должен вернуть false
    Для строк original="привет, это Java программа" и target=" это Java " он должен вернуть true
    В psvm проверить работу метода на примерах или любых других строках
     */
public class HW3 {

    static boolean oneOrLessSubst(String original, String target) {
            return original.indexOf(target) == original.lastIndexOf(target);
    }

    public static void main(String[] args) {
        System.out.println(oneOrLessSubst("Слова в строке не повторяются", "не повторяются"));
        System.out.println(oneOrLessSubst("Слова в строке не повторяются повторяются повторяются", "повторяются"));
    }
}
