package lesson2;

import java.util.Scanner;

/*
Спросить у пользователя число
Если оно попадает в диапазон от 1 до 100 или в диапазон от -1000 до -100, вывести в консоль "+"
Если оно не попадает ни в один из этих диапазонов, вывести "-"
 */
public class HW1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println("Введите число");
        if((num > 0 && num < 101) || (num > -1001 && num < -99)){
            System.out.println("+");
        } else {
            System.out.println("-");
        }
    }
}
